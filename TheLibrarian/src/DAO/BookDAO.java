package DAO;

import model.Book;
import java.util.ArrayList;

public class BookDAO implements GenericDAO<Book>{
    
    //  Placeholder for future SQL database
    private static final ArrayList<Book> database = new ArrayList<>();
    
    //  CRUD block for DB manipulation
    public void create(Book book){
        database.add(book);
    }
    public ArrayList<Book> read(){
        return (ArrayList<Book>) database.clone();
    }
    public void update(){
        System.out.println("BookDAO.update() method not supported yet.");
    }
    public void delete(Book book){
        database.remove(book);
    }
}
