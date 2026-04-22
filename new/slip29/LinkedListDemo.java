import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList of Integer objects
        LinkedList<Integer> list = new LinkedList<>();
        
        // Add some elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        // Print the initial list
        System.out.println("Initial list: " + list);
        
        // Add an element at the first position
        list.addFirst(5);
        
        // Print the list after adding an element at the first position
        System.out.println("List after adding an element at the first position: " + list);
        
        // Delete the last element
        list.removeLast();
        
        // Print the list after deleting the last element
        System.out.println("List after deleting the last element: " + list);
        
        // Display the size of the list
        System.out.println("Size of the list: " + list.size());
    }
}
