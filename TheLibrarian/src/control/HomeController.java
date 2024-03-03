package control;

import model.Inventory;
import model.Book;
import model.Author;

public class HomeController {

    public void addBookToInv(String name, String author, String year){
        
        App.inventory.addEntry(new Book(name, new Author(author), Integer.parseInt(year)), 1);
        System.out.println(App.inventory.toString());
    }
}
