package view;

import javax.swing.plaf.basic.BasicLookAndFeel;

public interface LAFInterface {

    public void setupLAF();
    
    public void cycleLAF();
    
    public void cycleType();
    
    public BasicLookAndFeel getLAF();
    
    public String getCurrentType();
    
    default void setLAF(LAFOptions lookAndFeel) {
        try {
            javax.swing.UIManager.setLookAndFeel(lookAndFeel.get());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
