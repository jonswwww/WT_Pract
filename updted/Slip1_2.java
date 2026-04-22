//slip1_2

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Slip1_2 extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1, b2;

    public Slip1_2() 
   {
        l1 = new JLabel("Eno:");
        l2 = new JLabel("EName:");
        l3 = new JLabel("Designation:");
        l4 = new JLabel("Salary:");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);
        b1 = new JButton("Save");
        b2 = new JButton("Reset");
        b1.addActionListener(this);
        b2.addActionListener(this);
        JPanel p1, p2, p3, p4, p5, p6, p7;
        p1 = new JPanel(new GridLayout(4, 1));
        p2 = new JPanel(new FlowLayout());
        p3 = new JPanel(new FlowLayout());
        p4 = new JPanel(new FlowLayout());
        p5 = new JPanel(new FlowLayout());
        p6 = new JPanel(new FlowLayout());
        p7 = new JPanel(new FlowLayout());
        p2.add(l1);
        p2.add(t1);
        p3.add(l2);
        p3.add(t2);
        p4.add(l3);
        p4.add(t3);
        p5.add(l4);
        p5.add(t4);
        p6.add(b1);
        p6.add(b2);
        p1.add(p2);
        p1.add(p3);
        p1.add(p4);
        p1.add(p5);
        p1.add(p6);
        p1.add(p7);
        add(p1);
        setTitle("Employee ");
        setSize(300, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            try {
                Class.forName("org.postgresql.Driver");
                Connection con = DriverManager.getConnection("jdbc: postgresql://server 2/exam","exam1","exam1");
                PreparedStatement ps = con.prepareStatement("insert into employee(eno, ename, designation, salary) values (?,?,?,?)");
                ps.setString(1, t1.getText());
                ps.setString(2, t2.getText());
                ps.setString(3, t3.getText());
                ps.setString(4, t4.getText());
                int i = ps.executeUpdate();
                if (i > 0)
                    JOptionPane.showMessageDialog(null, "Employee Details Saved Successfully");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error:" + ex.getMessage());
            }
        } else if (ae.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
        }
    }

    public static void main(String[] args) {
        new Slip1_2();
    }
}