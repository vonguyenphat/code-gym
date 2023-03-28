package codegym.vn.appborrowbook.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.Date;

@Entity(name = "PersonBookBorrower")
public class PersonBookBorrower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPerson;
    private Long bookLoanCard;
    @NotBlank(message = "{namePerson.notBlank}")
    private String namePerson;
    private Date borrowedDate;
    private Date payDay;
    @ManyToOne()
    @JoinColumn(name = "id_Book",referencedColumnName = "idBook")
    private Book books;

    public PersonBookBorrower() {
    }

    public PersonBookBorrower(Long idPerson, Long bookLoanCard, String namePerson, Date borrowedDate, Date payDay, Book books) {
        this.idPerson = idPerson;
        this.bookLoanCard = bookLoanCard;
        this.namePerson = namePerson;
        this.borrowedDate = borrowedDate;
        this.payDay = payDay;
        this.books = books;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public Long getBookLoanCard() {
        return bookLoanCard;
    }

    public void setBookLoanCard(Long bookLoanCard) {
        this.bookLoanCard = bookLoanCard;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public Date getBorrowedDate() {
        return borrowedDate;
    }

    public void setBorrowedDate(Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public Date getPayDay() {
        return payDay;
    }

    public void setPayDay(Date payDay) {
        this.payDay = payDay;
    }

    public Book getBooks() {
        return books;
    }

    public void setBooks(Book books) {
        this.books = books;
    }
}
