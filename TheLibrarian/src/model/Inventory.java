package model;

import java.util.HashMap;
import DAO.InventoryDAO;

public class Inventory {
    
    final HashMap<Book, Integer> inv;
    final InventoryDAO dao;
    
    public Inventory(){
        inv = new HashMap<>();
        dao = new InventoryDAO();
    }
    
    private void sync(){
        inv.clear();
        inv.putAll(dao.getMap());
    }
    
    public void addBook(Book book) throws Exception{
        dao.addBook(book);
        sync();
    }
    
    public void deleteBook(Book book) throws Exception{
        dao.deleteBook(book);
        sync();
    }
    
    public void addStock(Book book, int value) throws Exception{
        dao.addStock(book, value);
        sync();
    }
    
    public void rmvStock(Book book, int value) throws Exception{
        dao.rmvStock(book, value);
    }
    
    public int getStock(Book book) throws Exception{
        return dao.getStock(book);
    }
    
    public HashMap getMap(){
        sync();
        return inv;
    }
}
