package li.koly.book;


import li.koly.book.external.DependenceUserServiceExternal;
import li.koly.book.module.Book;
import li.koly.book.repository.Books;
import li.koly.book.service.BookService;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BookServiceTest {
    @Test
    public void should_return_books_owned_by_user() {
        BookService bookService = new BookService(new DependenceUserServiceExternal(), new Books());
        List<Book> books = bookService.getBooksOf("koly");
        assertThat(books.size(), is(2));
        assertThat(books.get(0).getIsbn(), is("12312"));
    }
}
