package control;

import model.Book;
import model.Inventory;
import model.Reader;

public class Checkout {

    public static void doCheckout(Inventory inventory, Book book, Reader reader, int i, String initDate, String rtrnDate){

        reader.getBorrowList().addItem(book, initDate, rtrnDate, i);
        inventory.removeStock(book, i);
    }
}
