package control;




import control.*;
import exc.*;
import DAO.BookDAO;
import model.Author;
import model.Book;

public class BookController {
    
    private InventoryController inventoryController;
    private BookDAO dao;
    
    //  Adds book to the database, if there isn't already an identical entry
    public void addBook(String name, Author author, int year) throws DuplicateEntryException{
        if (this.isAlreadyRegistered(name, author, year)){
            throw new DuplicateEntryException();
        }
        else {
            dao.create(new Book(name, author, year));
        }
    }
    
    //  Removes book entry from the database
    public void delBook(Book book){
        dao.delete(book);
    }
    
    //  Checks database for specified parameters, returns false if no occurrence was found
    public boolean isAlreadyRegistered(String name, Author author, int year){
        boolean flag = false;
        for (Book entry : dao.readAll()){
            if (entry.equals(name, author, year)){
                flag = true;
                break;
            }
        }
        return flag;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Methods for dependency injection">
    public void setInventoryController(InventoryController inv){
        this.inventoryController = inv;
    }
    public void setBookDAO(BookDAO dao){
        this.dao = dao;
    }
    //</editor-fold>
}
