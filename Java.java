package quizapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

public class Java extends JFrame implements ActionListener
{
    JButton bt1, bt2;
    Font fLabel = new Font("Times New Roman", 0, 25);
    Font fLabel1 = new Font("Times New Roman", 0, 35);
    JLabel link1,link2,link3,ref_book,Books,label;
    JFrame j;
    Java()
    {
        j=new JFrame();
        JLabel lable=new JLabel();
        JButton button=new JButton();
        JPanel panel = new JPanel();



        j.setSize(800,520);//Window size
        j.setTitle("Quizzard");//Name

        ImageIcon img=new ImageIcon("logo.png");//logo change
        j.setIconImage(img.getImage());
        //j.getContentPane().setBackground(new Color(123,50,250));//change BG

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ref.jpeg"));
        Image i3  = i1.getImage().getScaledInstance(800,500,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,800,520);
        j.add(i2);

        bt2=new JButton("BACK");
        bt2.setBounds(400,400,100,40);
        bt2.addActionListener(this);

        i2.add(bt2);


        JLabel label = new JLabel("JAVA ");
        label.setForeground(Color.white);
        label.setBounds(370,30, 100, 80);
        label.setFont(this.fLabel1);
        i2.add(label);

        JLabel wel = new JLabel("Reference :");
        wel.setForeground(Color.pink);
        wel.setBounds(250,130, 120, 60);
        wel.setFont(this.fLabel);
        i2.add(wel);


        JLabel mail = new JLabel("YouTube Links");
        mail.setForeground(Color.white);
        mail.setBounds(250,180, 200, 60);
        mail.setFont(fLabel);
        i2.add(mail);


        this.bt1 = new JButton("Start Test");
        this.bt1.setBounds(600,400, 100, 40);
        bt1.addActionListener(this);
        i2.add(this.bt1);

        JLabel Books=new JLabel("Books");
        Books.setForeground(Color.white);
        Books.setBounds(470,180,200,60);
        Books.setFont(this.fLabel);
        i2.add(Books);

        link1 = new JLabel();
        link1.setText("<html> <a href=>Tutorial 1</a></html>");
        link1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        link1.setBounds(250, 210, 201, 50);
        i2.add(link1);
        yt1(link1);

        link2 = new JLabel();
        link2.setText("<html> <a href=>Tutorial 2</a></html>");
        link2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        link2.setBounds(250, 260, 201, 50);
        i2.add(link2);
        yt2(link2);

        link3 = new JLabel();
        link3.setText("<html> <a href=>Tutorial 3</a></html>");
        link3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        link3.setForeground(Color.yellow);
        link3.setBounds(250,310, 201, 50);
        i2.add(link3);
        yt3(link3);


        ref_book = new JLabel();
        ref_book.setText("<html> <a href=>Complete Reference JAVA</a></html>");
        ref_book.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ref_book.setBounds(470, 210, 201, 50);
        i2.add(ref_book);
        book(ref_book);

        j.setLocationRelativeTo(null);
        j.setResizable(false);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit code on closing window
        j.setVisible(true);

    }
//    https://www.pdfdrive.com/download.pdf?id=185771881&h=0db0f2eae168c600917807d193abdf4a&u=cache&ext=pdf

    public void yt1(JLabel kirim)
    {
        kirim.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                try
                {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/UmnCZ7-9yDY"));
                }
                catch(Exception ex)
                {
                    System.out.println(ex);
                }
            }
        });
    }
    public void yt2(JLabel kirim)
    {
        kirim.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                try
                {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/eIrMbAQSU34"));
                }
                catch(Exception ex)
                {
                    System.out.println(ex);
                }
            }
        });
    }
    public void yt3(JLabel kirim)
    {
        kirim.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                try
                {
                    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=xk4_1vDrzzo"));
                }
                catch(Exception ex)
                {
                    System.out.println(ex);
                }
            }
        });
    }
    public void book(JLabel kirim)
    {
        kirim.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent me)
            {
                try
                {
                    Desktop.getDesktop().browse(new URI("https://www.pdfdrive.com/download.pdf?id=185771881&h=0db0f2eae168c600917807d193abdf4a&u=cache&ext=pdf"));
                }
                catch(Exception ex)
                {
                    System.out.println(ex);
                }
            }
        });
    }
    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getSource() == bt1) {
            j.setVisible(false);
            this.setVisible(false);
            new javaexam();
        }
        if (ae.getSource() == bt2) {
            j.setVisible(false);
            this.setVisible(false);
            new selection();
        }

    }
    public static void main(String [] args)
    {
        new Java();
    }


}