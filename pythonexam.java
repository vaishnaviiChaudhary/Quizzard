package quizapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class pythonexam extends JFrame implements ActionListener {
    JLabel l1,l2;

    JRadioButton a,b,c,d;
    JTextField uname;
    JButton next, back,submit;
    int rdX=150,rdW=250,rdH=50,marks=0;

    ButtonGroup opt;
    String question ,op1, op2, op3, op4, cop;
    String selectedOpt;
    int i=1;
    pythonexam() {
        setSize(1000, 700);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Img7.jpg"));
        Image i3  = i1.getImage().getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,1000,700);
        add(i2);

        l1 = new JLabel("PYTHON");
        l1.setBounds(450, 5, 1000, 100);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        l1.setForeground(Color.WHITE);
        i2.add(l1);

        l2 = new JLabel("Question");
        l2.setBounds(30, 80, 1000, 100);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        l2.setForeground(Color.WHITE);
        i2.add(l2);

        opt = new ButtonGroup();

        a = new JRadioButton("a) ");
        a.setBounds(rdX, 210, rdW, rdH);
        a.setActionCommand("a");
        opt.add(a);
        i2.add(a);

        b = new JRadioButton("b) ");
        b.setBounds(rdX, 280, rdW, rdH);
        b.setActionCommand("b");
        opt.add(b);
        i2.add(b);

        c = new JRadioButton("c) ");
        c.setBounds(rdX, 350, rdW, rdH);
        c.setActionCommand("c");
        opt.add(c);
        i2.add(c);

        d = new JRadioButton("d) ");
        d.setBounds(rdX, 420, rdW, rdH);
        d.setActionCommand("d");
        opt.add(d);
        i2.add(d);

        next = new JButton("NEXT");
        next.setBounds(620,570,100,40);
        next.addActionListener(this);
        i2.add(next);

        back = new JButton("BACK");
        back.setBounds(370,570,100,40);
        back.addActionListener(this);
        i2.add(back);
        JLabel l1=new JLabel("Enter Username:");
        l1.setForeground(Color.WHITE);
        l1.setBounds(700,20,100,30);
        i2.add(l1);

        uname =new JTextField();
        uname.setBounds(800,20,100,30);
        i2.add(uname);

        submit=new JButton("SUBMIT");
        submit.setBounds(500,570,100,40);
        submit.addActionListener(this);
        i2.add(submit);



        getQuestion();

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    void optionSelect(){
        selectedOpt = this.opt.getSelection().getActionCommand();
        System.out.println(selectedOpt);
    }

    void getQuestion(){
        conn c1 = new conn();
        String str = "select * from pyqns where qid = '" + i + "';";
        try {
            ResultSet rs = c1.s.executeQuery(str);
            while (rs.next()) {
                question = rs.getString(2);
                op1 = rs.getString(3);
                op2 = rs.getString(4);
                op3 = rs.getString(5);
                op4 = rs.getString(6);
                cop = rs.getString(7);


            }

            System.out.println(question);
            System.out.println(op1);
            System.out.println(op2);
            System.out.println(op3);
            System.out.println(cop);

            l2.setText(question);
            a.setText(op1);
            b.setText(op2);
            c.setText(op3);
            d.setText(op4);


        } catch (Exception e) {
            System.out.println(e);
        }
        i++;
    }
    void checkOption(){
        if(cop.equalsIgnoreCase(selectedOpt)){
            //JOptionPane.showMessageDialog(null, "Correct Option selected");
            marks++;
        }
        else{
            //JOptionPane.showMessageDialog(null, "Wrong Option selected");
        }
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            optionSelect();
            checkOption();
            getQuestion();
        }
        if(ae.getSource()==back){
            i-=3;
            getQuestion();
            marks--;
        }
        if(ae.getSource()==submit)
        {
            String username = this.uname.getText();
            conn c1=new conn();
            String str="UPDATE student_details SET pymarks='"+marks+"' where username ='"+username+"';";
            try
            {
                c1.s.execute(str);
            }catch (Exception e)
            {
                System.out.println(e);
            }
            new selection();
            this.setVisible(false);
        }

    }


    public static void main(String[] args) {
        new pythonexam();
    }
}
