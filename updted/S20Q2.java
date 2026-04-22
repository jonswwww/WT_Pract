import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class S20Q2 extends JFrame {
    private JLabel label;
    private ImageIcon icon1, icon2;
    private Timer timer;

    public S20Q2() {
        icon1 = new ImageIcon("image1.jpeg"); // replace with your own image path
        icon2 = new ImageIcon("image2.jpeg"); // replace with your own image path

        label = new JLabel(icon1);

        timer = new Timer(500, new ActionListener() {
            boolean showImage1 = true;
            public void actionPerformed(ActionEvent e) {
                if (showImage1) {
                    label.setIcon(icon2);
                    showImage1 = false;
                } else {
                    label.setIcon(icon1);
                    showImage1 = true;
                }
            }
        });
        timer.start();

        getContentPane().add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // pack();
        setVisible(true);
    }

    public static void main(String[] args) 
   {
        new S20Q2();
    }
}

