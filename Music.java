
import java.util.LinkedList;
import java.util.Scanner;

public class Music {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Store 5 Telugu song names
        LinkedList<String> songs = new LinkedList<>();

        songs.add("Butta Bomma");
        songs.add("Samajavaragamana");
        songs.add("Srivalli");
        songs.add("Naatu Naatu");
        songs.add("Inkem Inkem Inkem Kaavaale");

        // 2. Display all songs
        System.out.println("Original Music Playlist:");
        System.out.println(songs);

        // 3. Add a new song at the beginning
        songs.addFirst("Vachinde");

        System.out.println("\nAfter adding song at beginning:");
        System.out.println(songs);

        // 4. Add another song at the end
        songs.addLast("Ramuloo Ramulaa");

        System.out.println("\nAfter adding song at the end:");
        System.out.println(songs);

        // 5. Remove a song by its name
        System.out.print("\nEnter song name to remove: ");
        String removeSong = sc.nextLine();

        if (songs.remove(removeSong)) {
            System.out.println("Song removed successfully!");
        } else {
            System.out.println("Song not found!");
        }

        System.out.println("\nUpdated Music Playlist:");
        System.out.println(songs);

        // 6. Display first and last songs
        System.out.println("\nFirst Song: " + songs.getFirst());
        System.out.println("Last Song: " + songs.getLast());

        // 7. Display total number of songs
        System.out.println("Total Number of Songs: " + songs.size());

        sc.close();
    }
}
