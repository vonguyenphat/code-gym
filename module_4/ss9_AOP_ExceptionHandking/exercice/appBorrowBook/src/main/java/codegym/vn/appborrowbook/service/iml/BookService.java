package codegym.vn.appborrowbook.service.iml;

import codegym.vn.appborrowbook.model.Book;
import codegym.vn.appborrowbook.repository.IBookRepository;
import codegym.vn.appborrowbook.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BookService implements IBookService {
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void updateAmount_bookService(Long id) {
        bookRepository.updateAmount_book(id);
    }

    @Override
    public void updateAmount_book_up(Long prIDBook) {
        bookRepository.updateAmount_book_up(prIDBook);
    }
}
