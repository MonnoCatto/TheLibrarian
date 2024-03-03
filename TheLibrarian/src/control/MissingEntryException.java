package control;

public class MissingEntryException extends Exception {
    @Override
    public String toString(){
        return "Specified book not found in inventory";
    }
}
