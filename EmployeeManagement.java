
import java.util.HashSet;

public class EmployeeManagement {
    public static void main(String[] args) {

        // Create HashSet
        HashSet<Integer> emp = new HashSet<>();

        // 1. Store 10 employee IDs
        emp.add(101);
        emp.add(102);
        emp.add(103);
        emp.add(104);
        emp.add(105);
        emp.add(106);
        emp.add(107);
        emp.add(108);
        emp.add(109);
        emp.add(110);

        // 2. Try adding duplicate IDs
        emp.add(103);
        emp.add(105);

        System.out.println("After adding duplicate IDs:");
        System.out.println(emp);

        // 3. Display all employee IDs
        System.out.println("All Employee IDs:");
        for (int id : emp) {
            System.out.println(id);
        }

        // 4. Check whether ID 105 exists
        System.out.println("Employee ID 105 exists: "
                + emp.contains(105));

        // 5. Remove employee ID 103
        emp.remove(103);
        System.out.println("After removing ID 103: " + emp);

        // 6. Display total employees
        System.out.println("Total Employees: " + emp.size());

        // 7. Check whether collection is empty
        System.out.println("Is collection empty: " + emp.isEmpty());
    }
}
 