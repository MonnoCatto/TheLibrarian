package exc;

public class MissingEntryException extends Exception {
    
    private String message = "Specified book not found in inventory";

    
    public MissingEntryException(){
    }
    
    public MissingEntryException(String s){
        message = s;
    }
    
    @Override    
    public String toString(){
        return message;
    }
}
