package es.dws.JVBeLibrary.service;

import java.util.Set;

import es.dws.JVBeLibrary.dto.Book;

/**
 * BookService
 */
public interface BookService {

    boolean addBook(Book book);

    boolean deleteBookById(Integer id);

    Set<Book> getBooks();

}
