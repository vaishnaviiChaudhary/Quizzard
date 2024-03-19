package quizapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminPage extends JFrame implements ActionListener {

    JButton java,python,cpp,result,logout,delete;
    JFrame frame;
    Font font1=new Font("Times New Roman",Font.BOLD,50);
    Font font2=new Font("Times New Roman",Font.BOLD,19);
    adminPage()
    {
        frame =new JFrame();
        frame.setSize(900,700);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Img35.jpg"));
        Image i3  = i1.getImage().getScaledInstance(900,700,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,900,700);
        frame.add(i2);

        JLabel l1=new JLabel("ADD QUESTIONS");
        l1.setBounds(150,140,350, 100);
        l1.setFont(font2);
        l1.setForeground(Color.WHITE);
        i2.add(l1);

        JLabel l2=new JLabel("Select Subject:-");
        l2.setBounds(150,225, 350, 50);
        l2.setFont(font2);
        l2.setForeground(Color.WHITE);
        i2.add(l2);

        logout =new JButton("Logout");
        logout.setBounds(420,570,100,30);
        logout.addActionListener(this::actionPerformed);
        i2.add(logout);

        java=new JButton("JAVA");
        java.setBounds(150,300,150,30);
        java.addActionListener(this::actionPerformed);
        i2.add(java);

        cpp=new JButton("C++");
        cpp.setBounds(150,360,150,30);
        cpp.addActionListener(this::actionPerformed);
        i2.add(cpp);

        python=new JButton("PYTHON");
        python.setBounds(150,420,150,30);
        python.addActionListener(this::actionPerformed);
        i2.add(python);

        JLabel l3=new JLabel("TO CHECK RESULT CLICK BELOW");
        l3.setBounds(500,170, 350, 30);
        l3.setForeground(Color.WHITE);
        l3.setFont(font2);
        i2.add(l3);

        result=new JButton("RESULT");
        result.setBounds(600,220,150,30);
        result.addActionListener(this::actionPerformed);
        i2.add(result);

        JLabel l5=new JLabel("TO DELETE QUIZ CLICK BELOW");
        l5.setBounds(500,300, 350, 30);
        l5.setForeground(Color.WHITE);
        l5.setFont(font2);
        i2.add(l5);

        delete=new JButton("DELETE");
        delete.setBounds(600,350,150,30);
        delete.addActionListener(this::actionPerformed);
        i2.add(delete);

        JLabel l4=new JLabel("QUIZZARD");
        l4.setBounds(300,30,500, 70);
        l4.setForeground(Color.WHITE);
        l4.setFont(font1);
        i2.add(l4);

        frame.setLayout(null);
        frame.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==java)
        {
            new addQnsJava();
            frame.setVisible(false);
        }
        if(ae.getSource()==python)
        {
            new addQnsPy();
            frame.setVisible(false);
        }
        if(ae.getSource()==cpp)
        {
            new addQnsCpp();
            frame.setVisible(false);
        }
        if(ae.getSource()==logout)
        {
            new homepage();
            frame.setVisible(false);
        }
        if(ae.getSource()==result)
        {
            new result();
        }
        if(ae.getSource()==delete)
        {
             conn c1=new conn();
             String str1="DELETE FROM cppqns;";
            String str2="DELETE FROM pyqns;";
            String str3="DELETE FROM javaqns;";

             try
             {
                 c1.s.execute(str1);
                 c1.s.execute(str2);
                 c1.s.execute(str3);
             }catch (Exception e)
             {
                 System.out.println(e);
             }
             JOptionPane.showMessageDialog(null,"Questions Deleted!");
        }
    }

    public static void main(String[] args) {
        new adminPage();
    }
}
