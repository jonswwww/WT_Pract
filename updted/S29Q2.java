import java.util.*;

class S29Q2 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("LinkedList elements: " + list);
        list.addFirst(5);
        System.out.println("LinkedList elements after adding at first position: " + list);
        list.removeLast();
        System.out.println("LinkedList elements after deleting last element: " + list);
        System.out.println("Size of LinkedList: " + list.size());
    }
}
