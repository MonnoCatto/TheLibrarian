package view;

import javax.swing.plaf.basic.BasicLookAndFeel;
import com.formdev.flatlaf.*;
import com.formdev.flatlaf.themes.*;

public enum LAFTypes {

    FLAT_DARK(new FlatDarkLaf()),
    FLAT_DARCULA(new FlatDarculaLaf()),
    FLAT_LIGHT(new FlatLightLaf()),
    FLAT_INTELLIJ(new FlatIntelliJLaf()),
    FLAT_MAC_DARK(new FlatMacDarkLaf()),
    FLAT_MAC_LIGHT(new FlatMacLightLaf());
    
    private final BasicLookAndFeel laf;

    LAFTypes(BasicLookAndFeel laf) {
        this.laf = laf;
    }

    public BasicLookAndFeel get() {
        return laf;
    }
}
