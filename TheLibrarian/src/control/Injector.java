package control;

import model.Inventory;
import DAO.*;

abstract class Injector {
    
    InventoryController inventoryController = new InventoryController();
    HomeController homeViewController = new HomeController();
    BookController bookController = new BookController();
    
    Inventory inventory = new Inventory();
    
    AuthorDAO authorDAO = new AuthorDAO();
    BookDAO bookDAO = new BookDAO();
    InventoryDAO inventoryDAO = new InventoryDAO();

    protected void inject(){
        inventoryController.setInventory(inventory);
    }
}
