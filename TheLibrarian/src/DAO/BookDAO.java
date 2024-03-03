package DAO;

import model.Book;
import java.util.ArrayList;

public class BookDAO {
    
    private static final ArrayList<Book> database = new ArrayList<>();
    
    public void insert(Book book)throws Exception{
        if ( !(database.contains(book)) ){
            database.add(book);
        }
    }
    
    public ArrayList<Book> retrieve(){
        return database;
    }
}
