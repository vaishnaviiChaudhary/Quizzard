package quizapp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class homepage extends JFrame implements ActionListener {
    JButton bt1;
    JButton bt2;
    JButton bt3;
    JButton bt4;
    JButton bt5;
    JButton bt6;
    JFrame frame;
    Font fLabel = new Font("Times New Roman", 0, 40);
    Font fLabel1 = new Font("Times New Roman", 0, 120);
    homepage() {
        frame = new JFrame();
        frame.setSize(1600, 900);
        this.setDefaultCloseOperation(3);
        this.setLayout((LayoutManager)null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Img22.jpg"));
        Image i3  = i1.getImage().getScaledInstance(1600,900,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,1600,900);
        frame.add(i2);

        this.bt1 = new JButton("LOGIN");
        this.bt1.setBounds(1270, 240, 150, 50);
        bt1.addActionListener(this);
        i2.add(this.bt1);


        this.bt6 = new JButton("REGISTRATION");
        this.bt6.setBounds(1270, 350, 150, 50);
        bt6.addActionListener(this);
        i2.add(this.bt6);

        this.bt2 = new JButton("RESULT");
        this.bt2.setBounds(120, 240, 150, 50);
        this.bt2.addActionListener(this);
        i2.add(this.bt2);

        this.bt3 = new JButton("RULES");
        this.bt3.setBounds(120, 330, 150, 50);
        this.bt3.addActionListener(this);
        i2.add(this.bt3);

        this.bt4 = new JButton("CONTACT US");
        this.bt4.setBounds(120, 420, 150, 50);
        this.bt4.addActionListener(this);
        i2.add(this.bt4);

//        this.bt5 = new JButton("FEEDBACK");
//        this.bt5.setBounds(120, 510, 150, 50);
//        this.bt5.addActionListener(this);
//        i2.add(this.bt5);

        JLabel wel = new JLabel("WELCOME");
        wel.setBounds(700, 730, 800, 60);
        wel.setFont(this.fLabel);
        wel.setForeground(Color.WHITE);
        i2.add(wel);

        JLabel name = new JLabel("QUIZZARD");
        name.setBounds(500, 30, 800, 130);
        name.setFont(this.fLabel1);
        name.setForeground(Color.WHITE);
        i2.add(name);

//        JLabel logo = new JLabel("LOGO");
//        logo.setBounds(100, 40, 40, 80);
//        logo.setForeground(Color.WHITE);
//        i2.add(logo);
        JLabel details = new JLabel("");
        details.setBounds(720, 560, 800, 100);
        frame.add(details);
        frame.setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() ==bt1)
        {
            frame.setVisible(false);
            new studentlogin();
        }
        else if (ae.getSource() == bt6)
        {
            frame.setVisible(false);
            new registration();
        }
        else if (ae.getSource()== bt2 )
        {
            frame.setVisible(false);
            new result();
        }
        else if (ae.getSource()== bt3 )
        {
            frame.setVisible(false);
            new guidelines();
        }
        else if (ae.getSource()== bt4 )
        {
            frame.setVisible(false);
            new contactus();
        }
//        else if (ae.getSource()== bt5 )
//        {
//            frame.setVisible(false);
//            new contactus();
//        }

    }

    public static void main(String[] args)
    {
        new homepage();
    }
}
