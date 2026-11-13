
import java.util.HashMap;

public class StudentDatabase {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // 1 & 2. Add 5 student records
        students.put(101, "Rahul");
        students.put(102, "John");
        students.put(103, "Priya");
        students.put(104, "Sneha");
        students.put(105, "Kiran");

        // 3. Display all student records
        System.out.println("All Student Records:");
        System.out.println(students);

        // 4. Retrieve name using student ID 102
        System.out.println("\nName of ID 102: "
                + students.get(102));

        // 5. Update student ID 103 name
        students.put(103, "Anjali");

        System.out.println("\nAfter updating ID 103:");
        System.out.println(students);

        // 6. Remove student ID 105
        students.remove(105);

        System.out.println("\nAfter removing ID 105:");
        System.out.println(students);

        // 7. Check whether student ID 101 exists
        System.out.println("\nDoes ID 101 exist? "
                + students.containsKey(101));

        // 8. Check whether name John exists
        System.out.println("Does John exist? "
                + students.containsValue("John"));

        // 9. Display all student IDs separately
        System.out.println("\nAll Student IDs:");
        for (Integer id : students.keySet()) {
            System.out.println(id);
        }

        // 10. Display all student names separately
        System.out.println("\nAll Student Names:");
        for (String name : students.values()) {
            System.out.println(name);
        }
    }
}
