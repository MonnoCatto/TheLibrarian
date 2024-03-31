package control;

import dao.LoanDAO;
import dao.ReaderDAO;
import dao.BookDAO;
import dao.AuthorDAO;
import dao.StockDAO;
import view.LoginScreen;
import view.LAFManager;

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
        
        LAFManager lafManager = new LAFManager();
        lafManager.setupLAF();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                var frame = new LoginScreen(lafManager);
                frame.setLocationRelativeTo(null);
                //frame.setExtendedState(LoginScreen.MAXIMIZED_BOTH);
                frame.setVisible(true);
            }
        });
    }
}
