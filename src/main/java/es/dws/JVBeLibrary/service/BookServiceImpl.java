package es.dws.JVBeLibrary.service;

import java.util.LinkedHashSet;
import java.util.Set;

import es.dws.JVBeLibrary.dto.Book;

/**
 * BookServiceImpl
 */
public class BookServiceImpl implements BookService {

    private static final Set<Book> books = new LinkedHashSet<>();

    @Override
    public boolean addBook(final Book book) {
        return books.add(book);
    }

    @Override
    public boolean deleteBookById(final Integer id) {
        return books.removeIf(book -> book.getId() == id);
    }

    @Override
    public Set<Book> getBooks() {
        return books;
    }

}
