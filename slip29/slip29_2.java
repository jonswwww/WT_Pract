import java.util.*;
class slip29_2
{
   public static void main(String args[])
   {
    LinkedList l1=new LinkedList();
       Scanner s=new Scanner(System.in);
     System.out.println("Enter how many records");
      int n=s.nextInt();
System.out.println("Enter"+ n +"Integer");
       for(int i=1;i<=n;i++)
       {    
           String c=s.next();
           l1.add(c);
       }
System.out.println("the content of linked list is");
  System.out.println(l1);
  System.out.println("Enter the integer you want to add at first position");
String a=s.next();
   l1.addFirst((a));
System.out.println("after adding element at first position");
  System.out.println(l1);
       l1.removeLast();
System.out.println("after deleting element at last position");
  System.out.println(l1);
System.out.println("Size of linked list is"+l1.size());
   }
}