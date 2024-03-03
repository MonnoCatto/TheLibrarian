package control;


import model.Author;
import model.Book;

public class BookController {
    
    private InventoryController inventoryController;
    
    //  Creates new book instance and sends it to the inventory
    public void addBook(String name, String author, String year){
        
        Book book = new Book(name, new Author(author), Integer.parseInt(year));
        try{
            inventoryController.getInventoryInstance().addBook(book);
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
    
    public void setInventoryController(InventoryController i){
        this.inventoryController = i;
    }
    
    //  Setup for singleton class
    private class CtrlHelper {
        private static final BookController INSTANCE = new BookController();
    }
    public static BookController getInstance(){
        return CtrlHelper.INSTANCE;
    }
    private BookController(){
    }
}
