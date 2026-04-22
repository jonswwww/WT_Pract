import java.util.*;

public class q1
 {

    public static void main(String[] args)
 {
        Scanner s = new Scanner(System.in);
    System.out.print("Enter the number of integers to be stored in the LinkedList: ");
        int n = s.nextInt();
        LinkedList   <Integer>l = new LinkedList<Integer>();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
 {
            int num = s.nextInt();
            l.add(num);
        }
        System.out.println("Negative integers in the LinkedList:");
        for (int num : l) 
{
            if (num < 0) {
                System.out.print(num + " ");
            }
        }
    }
}
