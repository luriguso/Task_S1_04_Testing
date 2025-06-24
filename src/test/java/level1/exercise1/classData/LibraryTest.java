package level1.exercise1.classData;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

        boolean found = false;
        for (Book book : library.recoveryBooks()) {
            if (book.getName().equalsIgnoreCase("The Book 1 test")) {
                found = true;
                break;
            }
        }
        assertTrue(found, "The book 'The Book 1 test' should be in the collection");
    }

    @Test
    void shouldReturnCorrectBook_whenGettingBookByIndex() {
        Book bookIndex = library.getBookByIndex(1);
        boolean found = false;
        if(bookIndex.getName().equalsIgnoreCase("The Book 2")) {
            found = true;
        }
        assertTrue(found, "The book 'The Book 2' should be in the collection in the position 1");
    }

    @Test
    void shouldNotContainDuplicateBooks_whenBooksAreAdded(){
        boolean isDuplicate = false;
        for (int i = 0; i<library.recoveryBooks().size();i++){
            for (int j = i+1;j<library.recoveryBooks().size();j++){
                if(library.getBookByIndex(i).getName().equalsIgnoreCase(library.getBookByIndex(j).getName())){
                    isDuplicate = true;
                }
            }
        }
        assertFalse(isDuplicate, "The book 'The Book test duplicated' should not be in the collection");
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
        boolean isReduced = false;

        library.removeBook("The Book 1");
        if(library.recoveryBooks().size()<sizeInitial){
            isReduced = true;
        }

        assertTrue(isReduced, "The list of books was not reduced");
    }

    @Test
    void shouldSortBooksAlphabetically_whenBooksAreSorted(){
        library.addBook(new Book("The Book Z"));
        library.addBook(new Book("The Book A"));

        Collections.sort(library.recoveryBooks(), new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getName().compareTo(b2.getName());
            }
        });

        List<Book> sorted = new ArrayList<>(library.recoveryBooks());
        Collections.sort(sorted, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getName().compareTo(b2.getName());
            }
        });

        assertEquals(sorted, library.recoveryBooks(), "The list of books should be arranged alphabetically.");
    }
}