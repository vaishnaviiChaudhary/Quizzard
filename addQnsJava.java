package quizapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addQnsJava extends JFrame implements ActionListener {
    JTextField question , a ,b, c ,d , cop , qid;
    JButton add,back;

    JLabel qns,op1,op2,op3,op4,Cop,Id;

    Font fLabel1 = new Font("Times New Roman", 0, 20);
    JFrame frame;

    addQnsJava(){
        frame=new JFrame();
        frame.setSize(1300,800);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Img34.jpg"));
        Image i3  = i1.getImage().getScaledInstance(1300,800,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,1300,800);
        frame.add(i2);

        qns=new JLabel("Question:");
        qns.setBounds(50,125,150, 30);
        qns.setFont(this.fLabel1);
        qns.setForeground(Color.WHITE);
        i2.add(qns);

        question = new JTextField();
        question.setBounds(210,50,500,150);
        i2.add(question);

        op1=new JLabel("A:");
        op1.setBounds(100,230, 70,30);
        op1.setFont(this.fLabel1);
        op1.setForeground(Color.WHITE);
        i2.add(op1);

        a = new JTextField();
        a.setBounds(210,220,200,50);
        i2.add(a);

        op2=new JLabel("B:");
        op2.setBounds(100,310, 70,30);
        op2.setFont(this.fLabel1);
        op2.setForeground(Color.WHITE);
        i2.add(op2);

        b = new JTextField();
        b.setBounds(210,300,200,50);
        i2.add(b);

        op3=new JLabel("C:");
        op3.setBounds(100,390, 70,30);
        op3.setFont(this.fLabel1);
        op3.setForeground(Color.WHITE);
        i2.add(op3);

        c = new JTextField();
        c.setBounds(210,380,200,50);
        i2.add(c);

        op4=new JLabel("D:");
        op4.setBounds(100,470, 70,30);
        op4.setFont(this.fLabel1);
        op4.setForeground(Color.WHITE);
        i2.add(op4);

        d = new JTextField();
        d.setBounds(210,460,200,50);
        i2.add(d);

        Cop=new JLabel("Correct Option:");
        Cop.setBounds(50,550, 130,30);
        Cop.setFont(this.fLabel1);
        Cop.setForeground(Color.WHITE);
        i2.add(Cop);

        cop = new JTextField();
        cop.setBounds(210,540,200,50);
        i2.add(cop);

        Id=new JLabel("Question ID:");
        Id.setBounds(440,550, 130,30);
        Id.setFont(this.fLabel1);
        Id.setForeground(Color.WHITE);
        i2.add(Id);

        qid = new JTextField();
        qid.setBounds(560,540,200,50);
        i2.add(qid);

        add = new JButton("Add ");
        add.setBounds(210,660,150,50);
        add.addActionListener(this);
        i2.add(add);

        back=new JButton("BACK");
        back.setBounds(380,660,150,50);
        back.addActionListener(this::actionPerformed);
        i2.add(back);

        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String question = this.question.getText();
            String a = this.a.getText();
            String b = this.b.getText();
            String c = this.c.getText();
            String d = this.d.getText();
            String cop = this.cop.getText();
            String qid = this.qid.getText();

            conn c1 = new conn();
            String str = "insert into javaqns (qid, qname , a, b, c, d, cop) values ('"+qid+"','"+question+"','"+a+"','"+b+"','"+c+"','"+d+"','"+cop+"');";

            try{
                c1.s.execute(str);
                JOptionPane.showMessageDialog(null,"Question Added");
                this.question.setText(null);
                this.a.setText(null);
                this.b.setText(null);
                this.c.setText(null);
                this.d.setText(null);
                this.qid.setText(null);
                this.cop.setText(null);


            }
            catch(Exception e){
                System.out.println(e);
            }


        }
        if(ae.getSource()==back)
        {
            new adminPage();
           frame.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new addQnsJava();
    }
}
