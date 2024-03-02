package model;

import java.util.ArrayList;

public class Inventory {
    
    private ArrayList<InvEntry> inventory = new ArrayList<InvEntry>();

    public Inventory(){
    }

    public void addEntry(Book book, int stock){
        inventory.add(new InvEntry(book, stock));
    }
    public void delEntry(int i){
        inventory.remove(i);
    }
    public String getInventory(){
        return this.inventory.toString();
    }
    public ArrayList<InvEntry> getInventoryArrayList(){
        return this.inventory;
    }
    public void addStock(Book book, int val){

        boolean flag = false;
        for (int i = 0; i < inventory.size() && !flag; i++){

            if (book == inventory.get(i).getBook()){
                inventory.get(i).addStock(val);
                flag = true;
            }
        }
    }
    public void removeStock(Book book, int val){

        boolean flag = false;
        for (int i = 0; i < inventory.size() && !flag; i++){

            if (book == inventory.get(i).getBook()){
                inventory.get(i).removeStock(val);
                flag = true;
            }
        }
    }
}
