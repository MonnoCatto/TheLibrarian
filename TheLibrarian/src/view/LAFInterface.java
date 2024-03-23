package view;

import javax.swing.plaf.basic.BasicLookAndFeel;

public interface LAFInterface {

    public void startLAF();
    
    public void cycleLAF();
    
    public BasicLookAndFeel getLAF();
    
    default void setLAF(BasicLookAndFeel laf) {
        try {
            javax.swing.UIManager.setLookAndFeel(laf);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
