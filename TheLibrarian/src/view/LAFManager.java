package view;

import javax.swing.plaf.basic.BasicLookAndFeel;

public class LAFManager implements LAFInterface {

    private LAFOptions initialLAF = LAFOptions.FLAT_LIGHT;
    private LAFOptions currentLAF;
    private String currentType;

    @Override
    public void startLAF() {
        setLAF(initialLAF);
        currentLAF = initialLAF;
        currentType = currentLAF.getType();
    }

    @Override
    public BasicLookAndFeel getLAF() {
        return currentLAF.get();
    }
    
    @Override
    public String getCurrentType(){
        return currentLAF.getType();
    }
    
    @Override
    public void cycleType(){
        currentType = switch (currentType) {
            case LAFOptions.LIGHT -> LAFOptions.DARK;
            case LAFOptions.DARK -> LAFOptions.LIGHT;
            default -> LAFOptions.DARK;
        };
    }

    @Override
    public void cycleLAF() {
        
        LAFOptions optionsArray[ ] = LAFOptions.valuesByType(currentType);
        LAFOptions nextLAF;

        int currentOptionIndex = searchCurrentLAFTypeIndex(optionsArray);
        int nextOptionIndex;

        try {
            nextOptionIndex = currentOptionIndex + 1;
            nextLAF = optionsArray[nextOptionIndex];
        } catch (IndexOutOfBoundsException e) {
            nextLAF = optionsArray[0];
        }
        setLAF(nextLAF);
        currentLAF = nextLAF;
    }

    private int searchCurrentLAFTypeIndex(LAFOptions[] types) {
        int index;
        for (index = 0; index < types.length; index++) {
            if (types[index].equals(currentLAF)) return index;
        }
        return -1;
    }
}
