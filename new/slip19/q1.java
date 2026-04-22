import java.util.*;

public class q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers to be stored in the LinkedList: ");
        int n = scanner.nextInt();

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            linkedList.add(num);
        }

        System.out.println("Negative integers in the LinkedList:");
        for (int num : linkedList) {
            if (num < 0) {
                System.out.print(num + " ");
            }
        }
    }
}
