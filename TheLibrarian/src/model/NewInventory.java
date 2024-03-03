package model;

import java.util.HashMap;

public class NewInventory {
    
    public final HashMap<Book, Integer> inv;
    
    public NewInventory(){
        inv = new HashMap<>();
    }
    
    public void addBook(Book book, int stock){
        inv.put(book, stock);
    }
    public void addStock(Book book, int value) throws Exception {
        if (inv.replace(book, inv.get(book) + value) == null){
        }
    }
}
