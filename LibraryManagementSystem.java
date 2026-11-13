import java.util.Scanner;
import java.util.TreeMap;

/*
Terminal Operations:
1. Add a New book - book ID, book Name
2. Display History - 
3. Issue a book - book id, book name, student id, student name, curr date
4. Return Book - book id
5. Display all books - 
*/
public class LMS {
    public static void main(String[] args) {
        TreeMap<Integer, String> book = new TreeMap<>();
        TreeMap<String, String> history = new TreeMap<>();

        // Book
        int BookID ;
        String BookName, StudName, date, bookid,StudID;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the option to perform:");
            System.out.println("1. Add a New Book");
            System.out.println("2. Display History");
            System.out.println("3. Issue a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Display all Books");
            System.out.println("6. Exit the Application");
            System.out.println("Enter a choice:");
            int choice = sc.nextInt();
            if (choice == 1) {
                // Adding book - ID, Name
                System.out.println("Enter the Book ID");
                BookID = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Book Name");
                BookName = sc.nextLine();
                book.put(BookID, BookName);

            } else if (choice == 2) {
                // Display History
                System.out.println(history);

            } else if (choice == 3) {
                sc.nextLine();
                // Issue a book
                System.out.println("Enter the Book ID");
                bookid = sc.nextLine();
                System.out.println("Enter Book Name");
                BookName = sc.nextLine();
                System.out.println("Enter the Student ID");
                StudID = sc.nextLine();
                System.out.println("Enter Student Name");
                StudName = sc.nextLine();
                System.out.println("Enter Date");
                date = sc.nextLine();
                history.put("BookID",bookid);
                history.put("BookName", BookName);
                history.put("StudentID",StudID);
                history.put("StudentName",StudName);
                history.put("Date",date);

            } else if (choice == 4) {
                // Return a book
            } else if (choice == 5) {
                // display all books
                System.out.println(book);
            } else if (choice == 6) {
                System.out.println("Byeee... !");
                break;
            } else {
                System.out.println("Invalid Choice , Please Try again !");
            }

        } while (true);
    }
}