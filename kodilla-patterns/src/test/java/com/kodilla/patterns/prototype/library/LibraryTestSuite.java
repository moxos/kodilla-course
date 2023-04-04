package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        Library shallowClone = null;
        Library deepClone = null;

        Book firstBook = new Book("Krzyzacy", "Adam Mickiewicz", LocalDate.of(1912, 12,12));
        Book secondBook = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", LocalDate.of(1831, 3,11));
        Library library = new Library("School Books library");
        library.books.add(firstBook);
        library.books.add(secondBook);

        try{
            shallowClone = library.shallowCopy();
            shallowClone.setName("Second School Books library");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        try {
            deepClone = library.deepCopy();
            deepClone.setName("Third School Books library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        library.books.remove(secondBook);

        Assertions.assertEquals(1, library.books.size());
        Assertions.assertEquals(1, shallowClone.books.size());
        Assertions.assertEquals(2, deepClone.books.size());
    }
}
