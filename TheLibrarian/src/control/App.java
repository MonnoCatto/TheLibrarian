package control;

import view.Home;
import model.*;
import DAO.*;

public class App {

    public static void main (String[] args){
        
        var inventory = new Inventory();
        var inventoryController = new InventoryController(inventory);
        
        var homeViewController = new HomeController();
        homeViewController.setInventoryController(inventoryController);
        
        BookController.getInstance().setInventoryController(inventoryController);
        
        Home.launch(args, homeViewController);
    }
}
