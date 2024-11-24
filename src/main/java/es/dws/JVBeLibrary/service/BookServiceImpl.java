package es.dws.JVBeLibrary.service;

import java.time.Year;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Service;

import es.dws.JVBeLibrary.dto.Book;
import es.dws.JVBeLibrary.enumeration.BookGenreEnum;

/**
 * BookServiceImpl
 */
@Service
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
        // for now, some mock books are added, but in the future they must be taken from
        // the db

        for (int i = 0; i < 10; i++) {
            final Random random = new Random();
            final BookGenreEnum genre = switch (random.nextInt(0, 4)) {
                case 0 -> BookGenreEnum.ACTION;
                case 1 -> BookGenreEnum.ROMANCE;
                case 2 -> BookGenreEnum.SUSPENSE;
                case 3 -> BookGenreEnum.THRILLER;
                default -> null;
            };

            final Year year = Year.of(random.nextInt(1200, Integer.parseInt(Year.now().toString())));

            books.add(Book.builder()
                    .id(i)
                    .title("Book: " + i)
                    .author("Author " + i)
                    .genre(genre)
                    .publicationYear(year)
                    .build());
        }

        return books;
    }

}
