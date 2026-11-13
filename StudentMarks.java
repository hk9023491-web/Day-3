
import java.util.TreeSet;

public class StudentMarks {
    public static void main(String[] args) {

        // Create TreeSet
        TreeSet<Integer> marks = new TreeSet<>();

        // 1. Store student marks
        marks.add(75);
        marks.add(90);
        marks.add(65);
        marks.add(85);
        marks.add(95);
        marks.add(75);
        marks.add(80);

        // 2. Display marks in ascending order
        System.out.println("Marks in Ascending Order:");
        System.out.println(marks);

        // 3. Display lowest mark
        System.out.println("Lowest Mark: " + marks.first());

        // 4. Display highest mark
        System.out.println("Highest Mark: " + marks.last());

        // 5. Remove mark 65
        marks.remove(65);
        System.out.println("After Removing 65: " + marks);

        // 6. Check whether mark 90 exists
        System.out.println("Is 90 Present? " + marks.contains(90));

        // 7. Display number of unique marks
        System.out.println("Number of Unique Marks: " + marks.size());
    }
}
