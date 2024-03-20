package control;

import model.Book;
import model.Stock;
import DAO.StockDAO;

public class StockController {
    
    private StockDAO dao;
    
    public Stock createStock(Book book){
        Stock stock = new Stock(book);
        dao.create(stock);
        return stock;
    }
    
    public boolean deleteStock(Stock stock){
        return dao.delete(stock);
    }
}
