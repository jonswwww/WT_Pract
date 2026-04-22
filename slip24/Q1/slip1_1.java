import java.awt.*;
import java.awt.event.*;

class slip1_1 extends Frame implements Runnable
{
            Thread t;
         
            int f,x,y;
String str;
            slip1_1()
            {
                        t=new Thread(this);
                        t.start();
                        setLayout(null);
                        setSize(300,300);
                        setVisible(true);
                        f=1;
                    x=100;y=100;
                       str="hello java";
            }
    public void update() 
             {
                            
              x=x+10*f;
                    if(x>300)
                  f=-1;
                  if(x<100)
                      f=1;
                    
        }
   public void run()
            {
                                                      
                                     while(true)
                                    {
                                                 
                                                 repaint();
                                                      update();  
                                                   try{

                                                            Thread.sleep(500);
                                                     }catch(Exception e){}                                        
                                   }
           }
       public void paint(Graphics g)
             {
                
                  g.drawString(str,x,y);
                  
                      
                     
          }
            public static void main(String a[])
            {
                        new slip1_1();
            }
}
