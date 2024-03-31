package control;

import exc.*;
import dao.BookDAO;
import model.Author;
import model.Book;
import model.Stock;

public class BookController {

    private final BookDAO dao;
    private StockController stockController;
    
    public BookController(BookDAO dao){
        this.dao = dao;
    }
    
    public void setStockController(StockController s){
        stockController = s;
    }

    public void createBook(String title, Author author, int year) throws DuplicateEntryException {
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
}
