package li.koly.book.repository;

import li.koly.book.module.Book;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Books implements BookRepo{
    private static List<Book> kolyBooks = Arrays.asList(
            new Book("12312", "harry potter", "JK"),
            new Book("12311", "wind", "JZ")
    );
    private static Map<String, List<Book>> record = new HashMap<>();

    static {
        record.put("koly", kolyBooks);
    }

    @Override
    public List<Book> getBooks(String username) {
        return record.get(username);
    }
}
