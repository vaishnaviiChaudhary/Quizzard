package quizapp;


import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;

public class selection extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4;
    Font f1= new Font("copper black",Font.BOLD,40);
    Font f2= new Font("Algerian",Font.BOLD,20);
    JFrame frame;
    selection(){
        frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(600,500 );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("langSelection.jpg"));
        Image i3  = i1.getImage().getScaledInstance(800,500,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,600,500);
        frame.add(i2);


// buttonsize
        int x=70,w=200,h=50;

        JLabel l1 = new JLabel("TEST");
        l1.setForeground(Color.white);
        l1.setBounds(290,50,200,50);
        l1.setFont(f1);
        i2.add(l1);

        b1 = new JButton("JAVA");
        b1.setBounds(250,185,150,50);
        b1.setFont(f2);
        b1.addActionListener(this);
        i2.add(b1);

        b2 = new JButton("C++");
        b2.setBounds(250,255,150,50);
        b2.setFont(f2);
        b2.addActionListener(this);
        i2.add(b2);

        b3 = new JButton("PYTHON");
        b3.setBounds(250,325,150,50);
        b3.setFont(f2);
        b3.addActionListener(this);
        i2.add(b3);

        b4=new JButton("Back");
        b4.setBounds(360,410,150,40);
        b4.setFont(f2);
        b4.addActionListener(this);
        i2.add(b4);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == b1) {
            frame.setVisible(false);
            new Java();
        }
        if (ae.getSource() == b2) {
            frame.setVisible(false);
            new cpp();
        }
        if (ae.getSource() == b3) {
            frame.setVisible(false);
            new Python();
        }
        if(ae.getSource()==b4)
        {
            frame.setVisible(false);
            new studentlogin();
        }
    }





    public static void main(String[] args) {
        new selection();
    }
}
