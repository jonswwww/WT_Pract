import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.*;

 class S23Q2 {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();

        // add student names to the ArrayList
        for(int i = 0; i < args.length; i++) {
            studentNames.add(args[i]);
        }

        // display student names using Iterator
        System.out.println("Student names using Iterator:");
        Iterator<String> itr = studentNames.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        // display student names using ListIterator in reverse order
        System.out.println("\nStudent names using ListIterator (in reverse order):");
        ListIterator<String> litr = studentNames.listIterator(studentNames.size());
        while(litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}



