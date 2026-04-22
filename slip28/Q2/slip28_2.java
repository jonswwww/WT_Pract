class prg2 implements Runnable
{
 Thread t; 
prg2()
  {
t=new Thread(this,"test Thread");
 System.out.println( "child thread is "+t);
   t.start();
   }
   public void run()
   { 
      System.out.println( "currently executing thread is "+Thread.currentThread().getName());
     
     }

}
   class slip28_2
{
  public static void main(String args[])
{
  prg2 d=new prg2();

}
}