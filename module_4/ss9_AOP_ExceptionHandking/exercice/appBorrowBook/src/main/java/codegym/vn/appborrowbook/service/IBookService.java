package codegym.vn.appborrowbook.service;

import codegym.vn.appborrowbook.model.Book;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    Book findById(Long id);

    void updateAmount_bookService(Long id);

    void updateAmount_book_up(Long prIDBook);
}
