package level1.exercise1.classManagement;


import level1.exercise1.classData.Book;
import level1.exercise1.classData.Library;

public class LibraryManagement {
    private Library library;

    public LibraryManagement() {
        library = new Library();
        addBookInitials();
    }

    public void addBook(String name) {
        library.addBook(new Book(name));
    }

    public void showAllBooks() {
        System.out.println("List Books");
        for (Book book: library.recoveryBooks()){
            System.out.println(book);
        }
    }

    public void addBookAtPosition(int index, String name){
        library.addBookInPosition(new Book(name),  index);
    }

    public void getBookAtPosition(int index){
        Book book = library.getBookByIndex(index);
        if (book != null){
            System.out.println("The book in position " + index + ": " + book.getName());
        }
    }

    public void removeBookByName(String name){
        boolean removed = library.removeBook(name);
        if (removed){
            System.out.println("The book with name " + name + " has been removed");
        }else {
            System.out.println("The book not found" + name);
        }
    }

    public void addBookInitials(){
        Book book1 = new Book("The Book 1");
        Book book2 = new Book("The Book 2");
        Book book3 = new Book("The Book 3");
        Book book4 = new Book("The Book 4");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

    }
}
