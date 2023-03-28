package codegym.vn.appborrowbook.repository;

import codegym.vn.appborrowbook.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface IBookRepository extends JpaRepository<Book, Long> {

    @Modifying
    @Query("update Book b set b.amountBook  = b.amountBook - 1 where b.idBook = :prIDBook ")
    void updateAmount_book(@Param("prIDBook") Long prIDBook);

    @Modifying
    @Query("update Book b set b.amountBook  = b.amountBook + 1 where b.idBook = :prIDBook ")
    void updateAmount_book_up(@Param("prIDBook") Long prIDBook);

}
