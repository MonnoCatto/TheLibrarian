package DAO;

import model.Book;
import java.util.ArrayList;

public class BookDAO {
    
    //  Placeholder for future SQL database
    private static final ArrayList<Book> database = new ArrayList<>();
    
    //  CRUD block for DB manipulation
    public void create(Book book){
        database.add(book);
    }
    public void read(){
    }
    public void update(){
    }
    public void delete(Book book){
        database.remove(book);
    }
    
    //  Returns the reference to the static ArraList (placeholder for DB)
    public ArrayList<Book> readAll(){
        return database;
    }
}
