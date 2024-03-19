package quizapp;


//import net.proteanit.sql.DbUtils;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;

public class result extends JFrame implements ActionListener {

    JTable java, python, cpp;
    JScrollPane sp1, sp2, sp3;
    JButton home;
    JTabbedPane tabs;
    public static String name;
    public static String marks;
    public static String rank;
    int row;
    Font fLabel1 = new Font("Times New Roman", 0, 50);
    result() {
        setSize(900, 700);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Img21.jpg"));
        Image i3  = i1.getImage().getScaledInstance(900,700,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel i2 = new JLabel(i4);
        i2.setBounds(0,0,900,700);
        add(i2);

        JLabel res=new JLabel("RESULTS");
        res.setBounds(350,50,200, 50);
        res.setFont(this.fLabel1);
        res.setForeground(Color.WHITE);
        i2.add(res);
        //defining tables;
        java = new JTable();
        sp1 = new JScrollPane();
        sp1.setViewportView(java);

        python = new JTable();
        sp2 = new JScrollPane();
        sp2.setViewportView(python);

        cpp = new JTable();
        sp3 = new JScrollPane();
        sp3.setViewportView(cpp);

        //fetching the data
        //java
        conn c = new conn();
        try {
            String str1 = "select name , javamarks , javarank from student_details; ";
            ResultSet rs1 = c.s.executeQuery(str1);
            java.setModel(DbUtils.resultSetToTableModel(rs1));
        } catch (Exception e) {
            System.out.println(e);
        }

        //python
        try {
            String str2 = "select name , pymarks , pyrank from student_details ;";
            ResultSet rs2 = c.s.executeQuery(str2);
            python.setModel(DbUtils.resultSetToTableModel(rs2));

        } catch (Exception e) {
            System.out.println(e);
        }

        //c++
        try {
            String str3 = "select name , cppmarks , cpprank from student_details;";
            ResultSet rs3 = c.s.executeQuery(str3);
            cpp.setModel(DbUtils.resultSetToTableModel(rs3));

        } catch (Exception e) {
            System.out.println(e);
        }

        tabs = new JTabbedPane();
        tabs.setBounds(120, 225, 650, 270);

        //adding tabs
        tabs.add("JAVA", sp1);
        tabs.add("PYTHON", sp2);
        tabs.add("C++", sp3);
        i2.add(tabs);

        // buttons
        home = new JButton("Homepage");
        home.setBounds(400, 600, 100, 40);
        home.addActionListener(this);
        i2.add(home);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void javaSelect() {
        java.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                row = java.getSelectedRow();
                name = java.getModel().getValueAt(row, 0).toString();
                marks = java.getModel().getValueAt(row, 9).toString();
                rank = java.getModel().getValueAt(row, 10).toString();
            }

        });
    }

    void pythonSelect() {
        python.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                row = python.getSelectedRow();
                name = python.getModel().getValueAt(row, 0).toString();
                marks = python.getModel().getValueAt(row, 13).toString();
                rank = python.getModel().getValueAt(row, 14).toString();
            }
        });
    }

    void cppSelect() {
        cpp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                row = cpp.getSelectedRow();
                name = cpp.getModel().getValueAt(row, 0).toString();
                marks = cpp.getModel().getValueAt(row, 11).toString();
                rank = cpp.getModel().getValueAt(row, 12).toString();
            }

        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == home) {
            if (java.isShowing()) {
                javaSelect();
                System.out.println(name);
                System.out.println(marks);
                System.out.println(rank);
            } else if (python.isShowing()) {
                pythonSelect();
                System.out.println(name);
                System.out.println(marks);
                System.out.println(rank);
            } else if (cpp.isShowing()) {
                cppSelect();
                System.out.println(name);
                System.out.println(marks);
                System.out.println(rank);
            }

            if (ae.getSource() == home) {
                new homepage();
                this.setVisible(false);
            }


        }
    }

    public static void main (String[]args){
        new result();
    }

}
