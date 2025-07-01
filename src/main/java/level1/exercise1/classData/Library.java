package level1.exercise1.classData;

import java.util.*;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getName().compareTo(b2.getName());
            }
        });
    }

    public List<Book> recoveryBooks(){
        return books;
    }

    public Book getBookByIndex(int index){
        if (index < 0 || index >= books.size()) {
            System.out.println("Index out of bounds.");
            return null;
        }
        return books.get(index);
    }

    public void addBookInPosition(Book book, int index){
        if (index < 0 || index > books.size()) {
            System.out.println("Invalid index. Cannot add book.");
            return;
        }
        books.add(index, book);
        System.out.println("Book added at position " + index + ": " + book.getName());
    }

    public boolean removeBook(String name){
        boolean removed = false;

        for (Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
            Book book = iterator.next();
            if (book.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                removed = true;
            }
        }
        return removed;
    }
}
