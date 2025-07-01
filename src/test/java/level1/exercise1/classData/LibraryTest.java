package level1.exercise1.classData;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
        assertNotNull(library.recoveryBooks(), "The book list should not be null after Library is created.");
        library.addBook(new Book("The Book 1"));
        library.addBook(new Book("The Book 2"));
        library.addBook(new Book("The Book 3"));

    }

    @Test
    void shouldAddBookSuccessfully_whenNewBookIsAdded() {
        library.addBook(new Book("The Book 1 test"));
        assertEquals(4, library.recoveryBooks().size(), "The library should contain 4 books after adding a new one");

        boolean found = library.recoveryBooks().stream()
                .anyMatch(book -> book.getName().equalsIgnoreCase("The Book 1 test"));

        assertTrue(found, "The book 'The Book 1 test' should be in the collection");
    }

    @Test
    void shouldReturnCorrectBook_whenGettingBookByIndex() {
        Book bookIndex = library.getBookByIndex(1);

        assertEquals("The Book 2", bookIndex.getName(), "The book at position 1 should be 'The Book 2'");
    }

    @Test
    void shouldNotContainDuplicateBooks_whenBooksAreAdded(){
        List<String> bookNames = library.recoveryBooks().stream()
                .map(Book::getName)
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        long distinctCount = bookNames.stream().distinct().count();

        assertEquals(distinctCount, bookNames.size(), "The collection should not contain duplicate books");
    }

    @Test
    void shouldReturnCorrectBookByIndex_whenIndexIsValid() {
        Book expectedBook = new Book("The Book 2");
        Book recoveredBook = library.getBookByIndex(1);
        assertEquals(expectedBook.getName(), recoveredBook.getName(), "The book expected is: " + expectedBook.getName() + " but was: " + recoveredBook.getName());
    }

    @Test
    void shouldInsertBookAtSpecificPosition_whenValidIndexIsProvided() {
        Book newBook = new Book("Book in 1");
        library.addBookInPosition(newBook, 1);
        Book recoveredBook = library.getBookByIndex(1);
        assertEquals(newBook.getName(), recoveredBook.getName(), "The book expected is: " + newBook.getName());
    }

    @Test
    void shouldRemoveBookSuccessfully_whenBookExists() {
        int sizeInitial = library.recoveryBooks().size();

        library.removeBook("The Book 1");

        assertTrue(library.recoveryBooks().size() < sizeInitial, "The list of books was not reduced");
    }

    @Test
    void shouldSortBooksAlphabetically_whenBooksAreSorted() {
        library.addBook(new Book("The Book Z"));
        library.addBook(new Book("The Book A"));

        List<Book> actualBooks = library.recoveryBooks();

        List<Book> expectedBooks = new ArrayList<>(actualBooks);
        Collections.sort(expectedBooks, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getName().compareTo(b2.getName());
            }
        });

        assertIterableEquals(expectedBooks, actualBooks, "The list of books should be arranged alphabetically.");
    }

}