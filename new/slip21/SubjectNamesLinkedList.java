import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class SubjectNamesLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " subject names:");
        for (int i = 0; i < n; i++) {
            String subject = scanner.next();
            list.add(subject);
        }

        System.out.println("Subject names:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String subject = iterator.next();
            System.out.println(subject);
        }

        scanner.close();
    }
}
