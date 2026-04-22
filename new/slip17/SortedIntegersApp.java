import java.util.Scanner;
import java.util.TreeSet;

public class SortedIntegersApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for N
        System.out.print("Enter the number of integers to input: ");
        int n = scanner.nextInt();

        // Prompt the user for the integers
        System.out.println("Enter " + n + " integers:");
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            set.add(num);
        }

        // Display the sorted integers
        System.out.println("Sorted integers:");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
