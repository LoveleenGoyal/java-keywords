class LibraryBook {
    // Static variables shared among all books
    public static String libraryName = "Central Library";

    // Instance variables
    private String title;
    private String author;
    private final String ISBN;

    // Constructor
    public LibraryBook(String ISBN, String title, String author) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        if (this instanceof LibraryBook) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
        }

    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("1234567890", "1984", "George Orwell" );
        LibraryBook book2 = new LibraryBook("0987654321", "To Kill a Mockingbird", "Harper Lee" );

        LibraryBook.displayLibraryName();
        System.out.println("----------------------");
        System.out.println("Book 1:");
        book1.displayBookDetails();
        System.out.println();
        System.out.println("Book 2:");
        book2.displayBookDetails();
    }
}

/*
Library Name: Central Library
----------------------
Book 1:
Title: 1984
Author: George Orwell
ISBN: 1234567890

Book 2:
Title: To Kill a Mockingbird
Author: Harper Lee
ISBN: 0987654321
*/
