package level1.exercise1.main;

import level1.exercise1.classManagement.LibraryManagement;

public class main {
    public static void main(String[] args) {
        LibraryManagement libraryManagement = new LibraryManagement();
        libraryManagement.addBook("Book 1_main");
        libraryManagement.showAllBooks();
        libraryManagement.getBookAtPosition(1);
        libraryManagement.addBookAtPosition(2,"Book 2_main");
        libraryManagement.removeBookByName("The Book 1");
        libraryManagement.showAllBooks();
    }
}
