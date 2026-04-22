import java.util.*;
class slip4_2
{
   public static void main(String args[])
    {
         Hashtable ht=new Hashtable();
         Scanner t= new Scanner(System.in);
         System.out.println("Enter number of recored");
         int n=t.nextInt();
         for(int i=1;i<=n;i++)
           {
                System.out.println("Enter city Name");
                   String nm=t.next();
                System.out.println("Enter city std code");
                  int std=t.nextInt();
                  ht.put(nm,std);

          }   
  System.out.println("The Contents of Hashtable is");
   System.out.println(ht);
      System.out.println("Enter the city name to remove");
              String nm1=t.next();
              ht.remove(nm1);
    System.out.println("after removing city "+ht);
           System.out.println("Enter city name to search");
           String nm2=t.next();
              boolean ans=ht.containsKey(nm2);
           if(ans==true)
      System.out.println(nm2+"city is present");
         else
        System.out.println(nm2+"city is not present");  


 
     }


}