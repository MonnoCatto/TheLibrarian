package control;

import exc.*;
import DAO.BookDAO;
import model.Author;
import model.Book;

public class BookController {
    
    private BookDAO dao;
    
    public void addBook(String title, Author author, int year) throws DuplicateEntryException{
        Book book = new Book(title, author, year);
        
        if (isAlreadyRegistered(book)){
            //  Unlink the created object reference so garbage collector picks it up faster
            book = null;
            throw new DuplicateEntryException();
        }
        else {
            dao.create(book);
        }
    }
    
    //  Removes book entry from the database
    public void delBook(Book book){
        dao.delete(book);
    }
    
    //  Checks database for specified parameters, returns false if no occurrence was found
    public boolean isAlreadyRegistered(Book book){
        boolean flag = false;
        for (Book entry : dao.read()){
            if (entry.equals(book)){
                flag = true;
                break;
            }
        }
        return flag;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Methods for dependency injection">
    //public void setInventoryController(InventoryController inv){
    //    this.inventoryController = inv;
    //}
    public void setBookDAO(BookDAO dao){
        this.dao = dao;
    }
    //</editor-fold>
}
