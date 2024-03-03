package model;

import java.util.ArrayList;

public class Inventory {
    
    private ArrayList<InvEntry> inv = new ArrayList<InvEntry>();

    public Inventory(){
    }

    public void addEntry(Book book, int stock){
        inv.add(new InvEntry(book, stock));
    }
    public void delEntry(int i){
        inv.remove(i);
    }
    public String getInventory(){
        return this.inv.toString();
    }
    public ArrayList<InvEntry> getInventoryArrayList(){
        return this.inv;
    }
    public void addStock(Book book, int val){

        boolean flag = false;
        for (int i = 0; i < inv.size() && !flag; i++){

            if (book == inv.get(i).getBook()){
                inv.get(i).addStock(val);
                flag = true;
            }
        }
    }
    public void removeStock(Book book, int val){

        boolean flag = false;
        for (int i = 0; i < inv.size() && !flag; i++){

            if (book == inv.get(i).getBook()){
                inv.get(i).removeStock(val);
                flag = true;
            }
        }
    }
    @Override
    public String toString(){
        String out = "";
        for (int i = 0; i < inv.size(); i++){
            out += inv.get(i).getBook().getName() +", "+
                    inv.get(i).getStock();
        }
        return out;
    }
}
