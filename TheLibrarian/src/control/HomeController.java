package control;

import java.util.HashMap;
import model.Book;
import model.Author;
import exc.DuplicateEntryException;

public class HomeController {
    
    private InventoryController inventoryController;
    private BookController bookController;

    public void addBookToInv(String title, String author, String year){
        String t = title;
        Author a = new Author(author);
        int y = Integer.parseInt(year);
        try {
            bookController.addBook(t, a, y);
        } catch (DuplicateEntryException e){
            System.out.println(e.toString());
        }
    }
    
    public HashMap<Book, Integer> getInventoryMap(){
        return inventoryController.getInventoryInstance().getMap();
    }
    
    public void setInventoryController(InventoryController i){
        this.inventoryController = i;
    }
    public void setBookController(BookController b){
        this.bookController = b;
    }
}
