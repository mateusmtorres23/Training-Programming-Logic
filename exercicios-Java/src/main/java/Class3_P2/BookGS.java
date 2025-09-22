package Class3_P2;
import java.util.Scanner;

public class BookGS {
    private final String title;
    private final String author;
    private boolean checkedOut = false;

    Scanner sc = new Scanner(System.in);

    public BookGS(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void mainLoop() {
        while(true){
            System.out.println("Choose an option:");
            System.out.println("1. Display book information");
            System.out.println("2. Check out the book");
            System.out.println("3. Return the book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            String userChoice = sc.nextLine();
            switch (userChoice) {
                case "1" -> displayInfo();
                case "2" -> checkOut();
                case "3" -> returnBook();
                case "4" -> {
                    System.out.println("Exiting the program.");
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public void displayInfo() {
        System.out.println();
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Checked Out: " + (getCheckedOut() ? "Yes" : "No"));
        System.out.println();
    }
    public void checkOut() {
        System.out.print("would you like to check out this book? (y/n) ");
        String q = sc.nextLine();
        if (q.equals("y")) {
            if (!getCheckedOut()) {
                setCheckedOut(true);
                System.out.println("You have checked out the book.");
            }else {
                System.out.println("Sorry, the book is already checked out.");
            }
        }
    }
    public void returnBook() {
        System.out.print("would you like to return this book? (y/n) ");
        String q = sc.nextLine();
        if (q.equals("y")) {
            if (getCheckedOut()) {
                setCheckedOut(false);
                System.out.println("You have returned the book.");
            }else {
                System.out.println("This book was not checked out.");
            }
        }
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean getCheckedOut() {
        return checkedOut;
    }
    public void setCheckedOut(boolean newStatus) {
        this.checkedOut = newStatus;
    }

    public static void main(String[] args) {
        BookGS SoftwareEng = new BookGS("Software Engineering", "Ian Sommerville");
        SoftwareEng.mainLoop();
    }

}


