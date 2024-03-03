package control;

import java.util.HashMap;
import model.Book;

public class HomeController {
    
    private InventoryController inventoryController;

    public void addBookToInv(String name, String author, String year){
        BookController.getInstance().addBook(name, author, year);
    }
    
    public HashMap<Book, Integer> getInventoryMap(){
        return inventoryController.getInventoryInstance().getMap();
    }
    
    public void setInventoryController(InventoryController i){
        this.inventoryController = i;
    }
}
