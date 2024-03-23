package view;

import javax.swing.plaf.basic.BasicLookAndFeel;

public class LAFManager implements LAFInterface {

    private BasicLookAndFeel initialLAF = LAFTypes.FLAT_DARK.get();
    private BasicLookAndFeel currentLAF;

    @Override
    public void startLAF() {
        setLAF(initialLAF);
        currentLAF = initialLAF;
    }
    
    @Override
    public BasicLookAndFeel getLAF(){
        return currentLAF;
    }

    @Override
    public void cycleLAF() {

        LAFTypes[] types = LAFTypes.values();
        int currentLAFTypeIndex = searchCurrentLAFTypeIndex(types);

        int nextLAFTypeIndex;
        BasicLookAndFeel nextLAF;
        try {
            nextLAFTypeIndex = currentLAFTypeIndex + 1;
            nextLAF = types[nextLAFTypeIndex].get();
        } catch (IndexOutOfBoundsException e) {
            nextLAFTypeIndex = 0;
            nextLAF = types[nextLAFTypeIndex].get();
        }
        setLAF(nextLAF);
        currentLAF = nextLAF;
    }

    private int searchCurrentLAFTypeIndex(LAFTypes[] types) {
        int index;
        for (index = 0; index  < types.length; index++) {
            if (types[index].get().equals(currentLAF)) return index;
        }
        return -1;
    }
}
