package control;

import model.Inventory;

public class InventoryController {

    private final Inventory inventory;
    
    public InventoryController(Inventory inventory){
        this.inventory = inventory;
    }
    
    public Inventory getInventoryInstance(){
        return inventory;
    }
    
    /*
    public void setInventory(Inventory inv){
        inventory = inv;
    }
    
    //  Setup for singleton class
    private static class CtrlHelper {
        private static final InventoryController INSTANCE = new InventoryController();
    }
    public static InventoryController getInstance(){
        return CtrlHelper.INSTANCE;
    }
    private InventoryController(){
    }
    */
}
