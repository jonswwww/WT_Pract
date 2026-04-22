import java.awt.*;
import java.awt.event.*;
class blink extends Frame implements Runnable
{
            Thread t;
            Label l1;
            int f;
           Font f1;
            blink()
            { 
                       f1=new Font("arial",Font.BOLD,20);
                        t=new Thread(this);
                        t.start();
                        setLayout(null);
                        l1=new Label("Rohan");
                        l1.setBounds(100,100,100,40);
                         l1.setFont(f1);
                        add(l1);
                        setSize(300,300);
                        setVisible(true);
                        f=0;
            }
   public void run()
            {
                        try
                        {
                                    if(f==0)
                                    {
                                                t.sleep(500);
                                                l1.setText("");
                                                f=1;
                                    }
                                    if(f==1)
                                    {
                                                t.sleep(500);
                                                l1.setText("Rohan");
                                                f=0;
                                    }
                        }
                        catch(Exception e)
                        {
                                    System.out.println(e);
                        }
                        run();
            }
}
class slip4_1
{
            public static void main(String a[])
            {
                   blink d=new blink();
            }
}
