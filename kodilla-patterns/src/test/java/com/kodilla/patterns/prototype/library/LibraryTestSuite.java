package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks_shellowCopy() {
        //Given
        Library library = new Library("Library number 1");
        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", LocalDate.of(1998, 12, 23));
        Book book2 = new Book("Quo vadis", "Henryk Sienkiewicz", LocalDate.of(1992, 12, 5));
        Book book3 = new Book("Krzyżacy", "Henryk Sienkiewicz", LocalDate.of(1990, 3, 12));
        library.addBook(book1);
        library.addBook(book2);
        //library.addBook(book3);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        cloneLibrary.addBook(book3);

        //When
        Set<Book> books = library.getBooks();
        Set<Book> books2 = cloneLibrary.getBooks();

        //Then
        Assert.assertEquals(3, books.size());
        Assert.assertEquals(3, books2.size());
    }

    @Test
    public void testGetBooks_deepCopy() {
        //Given
        Library library = new Library("Library number 1");
        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", LocalDate.of(1998, 12, 23));
        Book book2 = new Book("Quo vadis", "Henryk Sienkiewicz", LocalDate.of(1992, 12, 5));
        Book book3 = new Book("Krzyżacy", "Henryk Sienkiewicz", LocalDate.of(1990, 3, 12));
        library.addBook(book1);
        library.addBook(book2);
        //library.addBook(book3);

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        deepCloneLibrary.addBook(book3);

        //When
        Set<Book> books = library.getBooks();
        Set<Book> books2 = deepCloneLibrary.getBooks();

        //Then
        Assert.assertEquals(2, books.size());
        Assert.assertEquals(3, books2.size());
    }

}
