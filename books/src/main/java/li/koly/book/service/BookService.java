package li.koly.book.service;

import li.koly.book.external.UserServiceExternal;
import li.koly.book.module.Book;
import li.koly.book.module.User;
import li.koly.book.repository.BookRepo;

import java.util.List;

public class BookService {
    private UserServiceExternal userServiceExternal;
    private BookRepo bookRepo;

    public BookService(UserServiceExternal userServiceExternal, BookRepo bookRepo) {
        this.userServiceExternal = userServiceExternal;
        this.bookRepo = bookRepo;
    }

    public List<Book> getBooksOf(String username) {
        User user = userServiceExternal.getUser(username);
        return bookRepo.getBooks(user.getName());
    }
}
