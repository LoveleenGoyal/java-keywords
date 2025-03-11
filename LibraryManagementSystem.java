class Book {
    // Static variables shared among all books
    public static String libraryName = "Central Library";

    // Instance variables
    private String title;
    private String author;
    private final String ISBN;

    // Constructor
    public Book(String ISBN, String title, String author) {
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
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
        }

    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("1234567890", "1984", "George Orwell" );
        Book book2 = new Book("0987654321", "To Kill a Mockingbird", "Harper Lee" );

        Book.displayLibraryName();
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
