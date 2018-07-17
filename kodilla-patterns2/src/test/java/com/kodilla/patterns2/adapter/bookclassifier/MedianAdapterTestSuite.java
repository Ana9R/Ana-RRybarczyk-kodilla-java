package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest_odd() {
        //given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Mike Johns", "Some title 1", 1992, "Signature 1"));
        books.add(new Book("Peter Miles", "Some title 2", 1998, "Signature 2"));
        books.add(new Book("Paul Moris", "Some title 3", 2005, "Signature 3"));

        //when
        MedianAdapter medianAdapter = new MedianAdapter();
        int publicationYearMedian = medianAdapter.publicationYearMedian(books);

        //then
        assertEquals(1998, publicationYearMedian);
    }

}