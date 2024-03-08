package DAO;

import model.DataPackage;

public interface GenericDAO {

    public void create();
    public DataPackage read();
    public void update();
    public void delete();
}