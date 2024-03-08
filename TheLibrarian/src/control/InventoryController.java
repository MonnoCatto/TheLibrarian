package control;

import model.Inventory;
import DAO.InventoryDAO;

public class InventoryController {

    private Inventory inventory;
    private InventoryDAO dao;
    
    public void setInventory(Inventory inventory){
        this.inventory = inventory;
    }
    public void setInventoryDAO(InventoryDAO dao){
        this.dao = dao;
    }

    public Inventory getInventoryInstance(){
        return inventory;
    }
}
