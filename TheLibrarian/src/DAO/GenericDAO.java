package DAO;

import java.util.ArrayList;

public abstract class GenericDAO<T extends Object> {

    private final ArrayList<T> database = new ArrayList<>();

    public boolean create(T obj) {
        return database.add(obj);
    }

    public ArrayList<T> read() {
        return (ArrayList<T>) database.clone();
    }

    public boolean update() {
        System.out.println("UPDATE from CRUD not implemented yet.");
        return false;
    }

    public boolean delete(T obj) {
        return database.remove(obj);
    }

    public boolean contains(T obj) {
        for (T entry : database) {
            if (entry.equals(obj)) {
                return true;
            }
        }
        return false;
    }
}
