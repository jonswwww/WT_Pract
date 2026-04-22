import java.util.*;
class slip23_2
{
   public static void main(String args[])
   {
    LinkedList l1=new LinkedList();
     
       for(int i=0;i<args.length;i++)
       {
           
           String c=args[i];
           l1.add(c);
       }
  System.out.println("records of linkledlist using Listiterator");
    ListIterator i=l1.listIterator();
        while(i.hasNext())
        {
              System.out.println(i.next());
        }  
          System.out.println("records in reverse order ");
       while(i.hasPrevious())
          {
                 System.out.println(i.previous());
       }
     

   }


}