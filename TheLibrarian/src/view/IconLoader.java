package view;

import java.awt.Image;
import java.awt.Toolkit;

public class IconLoader {
    
    private static final String DEFAULT_PATH = "icons/TheLibrarianIcon.png";
    
    public static Image loadDefault(){
        return Toolkit.getDefaultToolkit().getImage(DEFAULT_PATH);
    }
    
    public static Image load(String path){
        return Toolkit.getDefaultToolkit().getImage(path);
    }
}
