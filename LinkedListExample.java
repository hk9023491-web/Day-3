import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

       // Creating a LinkedList
       LinkedList<String> names = new LinkedList<>();
       
       //Adding elements
       names.add("John");
       names.add("Alice");
       names.add("David");
       names.add("Robert");

       // Displaying the list
       System.out.println("LinkedList: " +names);
       
       // Accessing an element
       System.out.println("First Element: " + names.get(0));
       
       //Updating an element
       names.set(1, "Peter");
       
       //Removing an element
       names.remove("David");

       //Adding element at first position
       names.addFirst("Sam");

       //Adding element at last position
       names.addLast("Tom");

       //Size of LinkedList
       System.out.println("Size: " + names.size());
    }       
}