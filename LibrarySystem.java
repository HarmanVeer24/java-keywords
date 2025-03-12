// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Book bookOne = new Book("978-3-16-148410-0", "Java Programming", "RK Singh");
        Book bookTwo = new Book("978-0-262-13472-9", "Data Structures", "SP Shukla");

        bookOne.showBookInfo();
        bookTwo.showBookInfo();
        Book.showLibraryName();
    }
}

class Book {
    private static String libraryTitle = "City Library"; // Static variable
    private final String bookISBN; // Final variable (cannot be changed)
    private String bookTitle;
    private String bookAuthor;

    // Constructor using 'this' to resolve ambiguity
    public Book(String bookISBN, String bookTitle, String bookAuthor) {
        this.bookISBN = bookISBN;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public void showBookInfo() {
        if (this instanceof Book) { // Using instanceof
            System.out.println("Library: " + libraryTitle);
            System.out.println("ISBN: " + bookISBN);
            System.out.println("Title: " + bookTitle);
            System.out.println("Author: " + bookAuthor);
        }
    }

    public static void showLibraryName() {
        System.out.println("Library Name: " + libraryTitle);
    }
}

//output
//Library: City Library
//ISBN: 978-3-16-148410-0
//Title: Java Programming
//Author: RK Singh
//Library: City Library
//ISBN: 978-0-262-13472-9
//Title: Data Structures
//Author: SP Shukla
//Library Name: City Library


