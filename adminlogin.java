package quizapp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class adminlogin extends JFrame implements ActionListener {

    Font font = new Font("Times New Roman", Font.PLAIN, 15);
    Font font1 = new Font("Tahoma", Font.BOLD, 40);
    JButton log, back;
    JLabel user, pass;
    JTextField id;
    JPasswordField passwordField;
    Font fLabel = new Font("Times New Roman",0,18);
    Font fLabel1 = new Font("Times New Roman",0,18);
    JFrame frame;

    adminlogin() {
        frame = new JFrame();

        frame.setSize(900,600);
        frame.setTitle("Quizzard");//Name
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("login2.png"));
        Image i3  = i1.getImage().getScaledInstance(900,600,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,900,600);
        frame.add(i2);

        JLabel admin = new JLabel("ADMIN LOGIN");
        admin.setForeground(Color.white);
        admin.setBounds(210, 30, 500, 100);
        admin.setFont(font1);
        i2.add(admin);

        user = new JLabel("USERNAME :");
        user.setForeground(Color.white);
        user.setBounds(180, 220, 120, 50);
        user.setFont(fLabel1);
        i2.add(user);

        id = new JTextField();
        id.setBounds(380, 220, 150, 50);
        i2.add(id);

        pass = new JLabel("PASSWORD :");
        pass.setForeground(Color.white);
        pass.setBounds(180, 300, 120, 50);
        pass.setFont(fLabel1);
        i2.add(pass);

        passwordField = new JPasswordField();
        passwordField.setBounds(380, 300, 150, 50);
        i2.add(passwordField);

        log = new JButton("LOGIN");
        log.setBounds(150, 450, 120, 50);
        log.setFont(fLabel);
        i2.add(log);
        log.addActionListener(this);

        back = new JButton("BACK");
        back.setBounds(450, 450, 120, 50);
        back.setFont(fLabel);
        i2.add(back);
        back.addActionListener(this);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == log) {
            String un = this.id.getText();
            String password = String.valueOf(this.passwordField.getPassword());
            conn c = new conn();
            try{
                String str1 = "select * from admin where id = '"+un+"' and password = '"+password+"';";
                ResultSet rs = c.s.executeQuery(str1);
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null,"Login Successful!");
                   new adminPage();
                    frame.setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Invalid Credentials!");
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

        if (ae.getSource() == back) {
            frame.setVisible(false);
            new homepage();
        }
//        frame.setVisible(false);
    }




    public static void main(String[] args) throws SQLException {
        new adminlogin();
    }
}