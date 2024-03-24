package view;

import javax.swing.plaf.basic.BasicLookAndFeel;
import com.formdev.flatlaf.*;
import com.formdev.flatlaf.themes.*;
import java.util.ArrayList;

public enum LAFOptions {

    FLAT_DARK(new FlatDarkLaf(), "DARK"),
    FLAT_DARCULA(new FlatDarculaLaf(), "DARK"),
    FLAT_LIGHT(new FlatLightLaf(), "LIGHT"),
    FLAT_INTELLIJ(new FlatIntelliJLaf(), "LIGHT"),
    FLAT_MAC_DARK(new FlatMacDarkLaf(), "DARK"),
    FLAT_MAC_LIGHT(new FlatMacLightLaf(), "LIGHT");
    
    private final BasicLookAndFeel laf;
    private final String type;
    
    public static final String DARK = "DARK";
    public static final String LIGHT = "LIGHT";

    LAFOptions(BasicLookAndFeel laf, String type) {
        this.laf = laf;
        this.type = type;
    }

    public BasicLookAndFeel get() {
        return laf;
    }
    
    public String getType(){
        return type;
    }
    
    /**
     * Allows the user to select only the enum values that match with a preferred LAF type
     * @param chosenType The type of LAF to be selected, can be either "DARK" or "LIGHT"
     * @return An array of the enum values that match the selected LAF type
     */
    public static LAFOptions[ ] valuesByType(String chosenType){
        ArrayList<LAFOptions> myList = new ArrayList<>();
        for (LAFOptions value : values()){
            addToListIfTypeMatches(value, chosenType, myList);
        }
        LAFOptions sortedArray[] = castListToArray(myList);
        return sortedArray;
    }
    
    private static void addToListIfTypeMatches(LAFOptions value, String chosenType, ArrayList<LAFOptions> sortedArray){
        if (value.getType().equalsIgnoreCase(chosenType)){
            sortedArray.add(value);
        }
    }
    
    private static LAFOptions[] castListToArray(ArrayList<LAFOptions> list){
        LAFOptions array[] = new LAFOptions[list.size()];
        for (int i = 0; i < list.size(); i++){
            array[i] = list.get(i);
        }
        return array;
    }
}
