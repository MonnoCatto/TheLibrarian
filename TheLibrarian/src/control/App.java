package control;

import view.Home;
import model.*;
import DAO.*;

public class App extends Injector {

    public static void main (String[] args){
        /*
        InventoryController inventoryController = new InventoryController();
        HomeController homeViewController = new HomeController();
        BookController bookController = new BookController();
    
        Inventory inventory = new Inventory();
    
        AuthorDAO authorDAO = new AuthorDAO();
        BookDAO bookDAO = new BookDAO();
        InventoryDAO inventoryDAO = new InventoryDAO();
        */
        /*
        
        ADD INJECTION CODE HERE
        
        */

        inject();
        
        Home.launch(args, homeViewController);
    }
}
