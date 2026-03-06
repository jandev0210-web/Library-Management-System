import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Menu");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    books.add(new Book(title));
                    System.out.println("Book added.");
                    break;

                case 2:
                    System.out.println("Books in Library:");
                    for (Book b : books) {
                        System.out.println(b.title);
                    }
                    break;

                case 3:
                    System.out.print("Enter book title to search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (Book b : books) {
                        if (b.title.equalsIgnoreCase(search)) {
                            System.out.println("Book found.");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Book not found.");
                    break;

                case 4:
                    System.out.print("Enter book title to remove: ");
                    String remove = sc.nextLine();
                    books.removeIf(b -> b.title.equalsIgnoreCase(remove));
                    System.out.println("Book removed if it existed.");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
