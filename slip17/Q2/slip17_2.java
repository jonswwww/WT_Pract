import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class printnum extends JFrame implements ActionListener, Runnable
{     
            JFrame f;
             Font f1;
            JTextField t;
            JButton b;
            Thread t1;
            printnum()
            {
                        f = new JFrame();
                         f1=new Font("Arial",Font.BOLD,25);
                        f.setSize(400, 400);
                        f.setVisible(true);
                      f.setLayout(null);
                        t = new JTextField(60);
                        b = new JButton("Start");                  
                        b.addActionListener(this);
                      t.setBounds(100,100,150,50);
                        f.add(t);
                   b.setBounds(100,150,150,50);
                        f.add(b);                       
          t1 = new Thread(this);
                              
            }
public void actionPerformed(ActionEvent e)
   {
    if(e.getSource()==b)
    {
       t.setFont(f1);
       t1.start();
    }

   }
            public void run()
            {
                        for(int i =1; i<=100;i++)
                        { 
                                    t.setText(""+i);
                                    try
                                    {
                                                Thread.sleep(300);
                                    }
                                    catch(Exception  e)
                                    {
                                                
                                    }
                        }
            }
}
class slip17_2
{
           
            public static void main(String args[])
            {
                  printnum t5=new printnum();
            }   
}
