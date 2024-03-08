package control;

import model.Inventory;
import DAO.*;

abstract class Injector {
    
    InventoryController inventoryController = new InventoryController();
    BookController bookController = new BookController();
    AuthorController authorController = new AuthorController();
    HomeController homeViewController = new HomeController();
    
    Inventory inventory = new Inventory();
    
    AuthorDAO authorDAO = new AuthorDAO();
    BookDAO bookDAO = new BookDAO();
    InventoryDAO inventoryDAO = new InventoryDAO();

    protected static void inject(){
        inventoryController.setInventory(inventory);
        inventoryController.setInventoryDAO(inventoryDAO);

        bookController.setInventoryController(inventoryController);
        bookController.setBookDAO(bookDAO);

        authorController.setAuthorDAO(authorDAO);

        homeViewController.setInventoryController(inventoryController);
        homeViewController.setBookController(bookController);
    }
}
