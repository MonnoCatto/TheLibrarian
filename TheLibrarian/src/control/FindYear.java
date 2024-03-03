package control;

import java.util.Calendar;

public class FindYear {
    
    public static int FindYear(){
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}
