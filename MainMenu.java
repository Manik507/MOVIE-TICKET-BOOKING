import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movies = {
            new Movie(1, "Avengers: Endgame", "5:00 PM"),
            new Movie(2, "Interstellar", "8:00 PM"),
            new Movie(3, "Inception", "10:00 PM")
        };

        int choice;
        do {
            System.out.println("\n=== Movie Ticket Booking System ===");
            System.out.println("1. View Movies");
            System.out.println("2. Book Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (Movie m : movies) {
                        m.display();
                    }
                    break;

                case 2:
                    System.out.print("Enter Movie ID to book: ");
                    int movieId = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    BookingThread bt = new BookingThread(movieId, name);
                    bt.start();
                    break;

                case 3:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);
        sc.close();
    }
}
