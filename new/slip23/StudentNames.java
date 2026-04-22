import java.util.*;

public class StudentNames {

    public static void main(String[] args) {
        
        List<String> namesList = new ArrayList<>(); // Create an ArrayList to store student names
        
        // Check if command line arguments are provided
        if(args.length == 0){
            System.out.println("Please provide at least one student name as argument.");
            return;
        }
        
        // Add student names to the list
        for(String name: args){
            namesList.add(name);
        }
        
        System.out.println("Student Names (Using Iterator):");
        Iterator<String> itr = namesList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        System.out.println("Student Names (Using ListIterator):");
        ListIterator<String> litr = namesList.listIterator();
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
    }
}
