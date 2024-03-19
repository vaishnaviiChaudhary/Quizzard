package quizapp;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class contactus extends JFrame implements ActionListener
{
    JButton back;
    Font fLabel = new Font("Times New Roman", 0, 30);
    JFrame j;
    contactus()
    {
         j=new JFrame();
        JLabel lable=new JLabel();
        JButton button=new JButton();
        JPanel panel = new JPanel();

        Border bdr= BorderFactory.createLineBorder(Color.black,3);  //Border to window
        lable.setBorder(bdr);
        j.setSize(1000,700);//Window size
        j.setTitle("Quizzard");//Name

        ImageIcon img=new ImageIcon("logo.png");//logo change
        j.setIconImage(img.getImage());
        //j.getContentPane().setBackground(new Color(123,50,250));//change BG

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Img27.jpg"));
        Image i3  = i1.getImage().getScaledInstance(1000,700,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,1000,700);
        j.add(i2);

        JLabel l1 = new JLabel("CONTACT US");
        l1.setBounds(330, 20, 500, 100);
        l1.setFont(new Font("Tahoma", Font.BOLD, 60));
        l1.setForeground(Color.WHITE);
        i2.add(l1);

        //aligliment
        lable.setVerticalAlignment(JLabel.TOP);
        lable.setHorizontalAlignment(JLabel.CENTER);



        JLabel wel = new JLabel("E-MAIL: ");
        wel.setBounds(120, 340, 500, 40);
        wel.setForeground(Color.WHITE);
        wel.setFont(this.fLabel);
        i2.add(wel);


        JLabel mail = new JLabel("appname@gmail.com");
        mail.setBounds(120, 410, 500, 40);
        mail.setForeground(Color.WHITE);
        mail.setFont(fLabel);
        i2.add(mail);

        JLabel con = new JLabel("CONTACT NUMBER: ");
        con.setBounds(650, 340, 500, 40);
        con.setForeground(Color.WHITE);
        con.setFont(this.fLabel);
        i2.add(con);

        JLabel num = new JLabel("1234567890 ");
        num.setBounds(650, 410, 500, 40);
        num.setForeground(Color.WHITE);
        num.setFont(this.fLabel);
        i2.add(num);

        this.back =new JButton("BACK");
        this.back.setBounds(770,580,100,40);
        this.back.addActionListener(this);
        i2.add(back);


        //button
        button.setBounds(200,150,100,50);
        button.setVisible(true);
        add(button);
        // lable.setBounds(0,0,250,250);
        // j.setLayout(null);
        j.add(lable);
        j.setResizable(false);
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit code on closing window
        j.setVisible(true);


    }
    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getSource()==back)
        {
            j.setVisible(false);
            this.setVisible(false);
            new homepage();

        }

    }
    public static void main (String args[])
    {
        new contactus();
    }



}
