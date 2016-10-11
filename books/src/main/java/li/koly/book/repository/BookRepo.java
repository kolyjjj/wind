package li.koly.book.repository;

import li.koly.book.module.Book;

import java.util.List;

public interface BookRepo {
    List<Book> getBooks(String username);
}
