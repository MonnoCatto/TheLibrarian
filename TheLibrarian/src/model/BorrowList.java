package model;

import java.util.ArrayList;

public class BorrowList {
    
    @SuppressWarnings("FieldMayBeFinal")
    private ArrayList<BorrowItem> borrowList = new ArrayList<>();
    
    public BorrowList(){
    }

    public String getList(){
        return this.borrowList.toString();
    }
    public ArrayList<BorrowItem> getArrayList(){
        return this.borrowList;
    }
    public void addItem(Book book, String initDate, String rtrnDate, int ammount){
        
        this.borrowList.add(new BorrowItem(book, initDate, rtrnDate, ammount));
    }
    public void removeItem(BorrowItem item){

        boolean flag = false;
        for (int i = 0; i < borrowList.size() && !flag; i++){

            if (borrowList.get(i) == item) borrowList.remove(i);
            flag = true;
        }
    }
}
