package exc;

public class DuplicateEntryException extends Exception {

    private String message = "Specified entry already exists.";
    
    public DuplicateEntryException(){
    }
    
    public DuplicateEntryException(String s){
        message = s;
    }
    
    @Override    
    public String toString(){
        return message;
    }
}

