import java.util.*;

 class S19Q1
 {
    public static void main(String[] args) 
    {
        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = input.nextInt();
            numbers.add(num);
        }

        System.out.print("Negative integers: ");
        for (int num : numbers) {
            if (num < 0) {
                System.out.print(num + " ");
            }
        }
    }
}
