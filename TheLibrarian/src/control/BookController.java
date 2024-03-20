package control;

import exc.*;
import DAO.BookDAO;
import model.Author;
import model.Book;
import model.Stock;

public class BookController {

    private BookDAO dao;
    private StockController stockController;

    public void addBook(String title, Author author, int year) throws DuplicateEntryException {
        Book book = new Book(title, author, year);

        if (!isAlreadyRegistered(book)) {
            Stock newStock = stockController.createStock(book);
            book.setStock(newStock);
            dao.create(book);
        } else {
            book = null;    //  make test object elligible for garbage collection
            throw new DuplicateEntryException();
        }
    }

    //  Removes book entry from the database
    public void deleteBook(Book book) {
        dao.delete(book);
    }

    public boolean isAlreadyRegistered(Book book) {
        return dao.contains(book);
    }

    public void setBookDAO(BookDAO dao) {
        this.dao = dao;
    }
}
