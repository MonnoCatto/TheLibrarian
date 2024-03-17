package DAO;

import java.util.ArrayList;
import model.Stock;

public class StockDAO implements GenericDAO<Stock> {
    
    private final ArrayList<Stock> database = new ArrayList<>();

    @Override
    public void create(Stock entry) {
        database.add(entry);
    }

    @Override
    public ArrayList read() {
        return (ArrayList) database.clone();
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Stock entry) {
        database.remove(entry);
    }
}
