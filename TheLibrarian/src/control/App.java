package control;

import view.Home;
import model.*;

public class App {
    
    static Inventory inventory = new Inventory();

    public static void main (String[] args){
        
        Home.launch();
    }
}
