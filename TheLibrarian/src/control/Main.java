package control;

import view.MainView;
import DAO.*;

public class Main {
    
    public static void main (String[] args){
        
        var authorDAO = new AuthorDAO();
        var bookDAO = new BookDAO();
        var loanDAO = new LoanDAO();
        var readerDAO = new ReaderDAO();
        var stockDAO = new StockDAO();
        
        var cAuthor = new AuthorController(authorDAO);
        var cBook = new BookController(bookDAO);
        var cLoan = new LoanController(loanDAO);
        var cReader = new ReaderController(readerDAO);
        var cStock = new StockController(stockDAO);
        
        cBook.setStockController(cStock);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }
}
