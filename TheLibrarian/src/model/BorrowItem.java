package model;

public class BorrowItem {

    public final Book book;
    public final String initDate;
    public final String rtrnDate;
    public final int ammount;
    
    BorrowItem(Book book, String initDate, String rtrnDate, int ammount){

        this.book = book;
        this.initDate = initDate;
        this.rtrnDate = rtrnDate;
        this.ammount = ammount;
    }
}
