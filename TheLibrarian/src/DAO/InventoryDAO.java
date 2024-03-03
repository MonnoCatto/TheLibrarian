package DAO;

import exc.MissingEntryException;
import exc.DuplicateEntryException;
import model.Book;
import java.util.HashMap;

public class InventoryDAO {
    
    private static final HashMap<Book, Integer> database = new HashMap<>();
    
    public void addBook(Book book) throws Exception{
        
        if ( !(database.containsKey(book)) ){
            database.put(book, 0);
        } 
        else {
            throw new DuplicateEntryException("Book is already linked.");
        }
    }
    
    public void deleteBook(Book book) throws Exception{
        if ( database.remove(book) == null ){
            throw new MissingEntryException();
        }
    }
    
    public void addStock(Book book, int value) throws Exception {
        if (database.replace(book, database.get(book) + value) == null){
            throw new MissingEntryException();
        }
    }
    
    public void rmvStock(Book book, int value) throws Exception {
        if (database.containsKey(book)){
            
            if ( (database.get(book) - value) < 0 ){
                throw new IllegalArgumentException("Insufficient ammount in inventory.");
            }
            else {
                database.replace(book, database.get(book) - value);
            }
        }
        else throw new MissingEntryException();
    }
    
    public int getStock(Book book) throws Exception{
        Integer stock = database.get(book);
        if (stock == null) throw new MissingEntryException();
        else return stock;
    }
    
    public HashMap getMap(){
        return database;
    }
}
