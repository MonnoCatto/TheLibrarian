package control;

import model.Book;
import model.Stock;
import dao.StockDAO;

public class StockController {
    
    private final StockDAO dao;
    
    public StockController(StockDAO dao){
        this.dao = dao;
    }
    
    public Stock createStock(Book book){
        Stock stock = new Stock(book);
        dao.create(stock);
        return stock;
    }
    
    public boolean deleteStock(Stock stock){
        return dao.delete(stock);
    }
}
