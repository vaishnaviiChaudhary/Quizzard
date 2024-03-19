package quizapp;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guidelines extends JFrame implements  ActionListener
{
    JLabel lable=new JLabel();
    JButton  btn1;
    Font fLabel = new Font("Times New Roman", 0, 23);
    Font fLabel1 = new Font("Times New Roman", Font.BOLD, 40);
    JFrame j;
    guidelines()
    {
         j=new JFrame();
        JLabel lable=new JLabel();
        JButton button=new JButton();

        lable.setText("GUIDELINES");//Text

        lable.setFont(new Font("Tahoma", Font.BOLD, 30));

        lable.setOpaque(true);

        btn1= new JButton("Back");
        btn1.setBounds(420, 700, 150, 30);
        btn1.addActionListener(this);
        j.add(btn1);

        Border bdr= BorderFactory.createLineBorder(Color.black,3);  //Border to window
        lable.setBorder(bdr);
        j.setSize(1000,850);//Window size
        j.setTitle("Quizzard");//Name



        lable.setVerticalAlignment(JLabel.TOP);
        lable.setHorizontalAlignment(JLabel.CENTER);



        JLabel name = new JLabel("Rules for attempting the quiz");
        name.setBounds(285, 55, 800, 70);
        name.setFont(new Font("Tahoma", Font.BOLD, 65));
        name.setForeground(Color.WHITE);
        name.setFont(this.fLabel1);
        j.add(name);

        //name.setHorizontalAlignment(JLabel.CENTER);
        //button
        button.setBounds(200,150,100,50);
        button.setVisible(true);
        add(button);
        // lable.setBounds(0,0,250,250);
        // j.setLayout(null);

        //background


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Img26.jpg"));
        Image i3  = i1.getImage().getScaledInstance(1000,850,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,1000,850);
        j.add(i2);


        JLabel rule1 = new JLabel("*  Select the subject of which you want to start quiz.");
        rule1.setBounds(140, 150, 800, 30);
        rule1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rule1.setForeground(Color.WHITE);
        rule1.setFont(this.fLabel);

        JLabel rule2 = new JLabel("*  Click Start Test to attempt the quiz. ");
        rule2.setBounds(140, 200, 800, 30);
        rule2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rule2.setForeground(Color.WHITE);
        rule2.setFont(this.fLabel);


        JLabel rule3 = new JLabel("*  The time will start the moment you click the Start Test button. ");
        rule3.setBounds(140, 250, 800, 30);
        rule3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rule3.setForeground(Color.WHITE);
        rule3.setFont(this.fLabel);


        JLabel rule4 = new JLabel("*   Click on Next button to move next question.");
        rule4.setBounds(140, 300, 800, 30);
        rule4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rule4.setForeground(Color.WHITE);
        rule4.setFont(this.fLabel);

        JLabel rule5 = new JLabel("*   The quiz will be of half an hour duration.");
        rule5.setBounds(140, 350, 800, 30);
        rule5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rule5.setForeground(Color.WHITE);
        rule5.setFont(this.fLabel);

        JLabel rule6 = new JLabel("*   There are a total 10 questions for each subject. ");
        rule6.setBounds(140, 400, 800, 30);
        rule6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rule6.setForeground(Color.WHITE);
        rule6.setFont(this.fLabel);

        JLabel rule7 = new JLabel("*   Each question carries one mark. No negative marking for wrong answers.");
        rule7.setBounds(140, 450, 800, 30);
        rule7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rule7.setForeground(Color.WHITE);
        rule7.setFont(this.fLabel);

        JLabel rule8 = new JLabel("*   Submit only after last question.");
        rule8.setBounds(140, 500, 800, 30);
        rule8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rule8.setForeground(Color.WHITE);
        rule8.setFont(this.fLabel);

        JLabel rule9 = new JLabel("*   Click on Submit Test button on completion of the quiz. ");
        rule9.setBounds(140, 550, 800, 30);
        rule9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rule9.setForeground(Color.WHITE);
        rule9.setFont(this.fLabel);

        JLabel rule10 = new JLabel("*   View results after attempting the test.");
        rule10.setBounds(140, 600, 800, 30);
        rule10.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rule10.setForeground(Color.WHITE);
        rule10.setFont(this.fLabel);





        i2.add(name);
        i2.add(rule1);
        i2.add(rule2);
        i2.add(rule3);
        i2.add(rule4);
        i2.add(rule5);
        i2.add(rule6);
        i2.add(rule7);
        i2.add(rule8);
        i2.add(rule9);
        i2.add(rule10);
        i2.add(lable);
        j.setResizable(false);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit code on closing window
        j.setVisible(true);
        j.setLocationRelativeTo(null);
    }
    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getSource()==btn1)
        {
            this.setVisible(false);
            new homepage();
        }
        j.setVisible(false);
    }

    public static void main(String [] args)
    {
        new guidelines();
    }
}
