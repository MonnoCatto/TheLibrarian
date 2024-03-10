package DAO;

import java.util.ArrayList;

public interface GenericDAO<T> {

    public void create(T obj);
    public ArrayList<T> read();
    public void update();
    public void delete(T obj);
}