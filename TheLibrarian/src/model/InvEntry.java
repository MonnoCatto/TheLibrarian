package model;

public class InvEntry {
    
    private Book book;
    private int stock;

    public InvEntry(Book book, int stock){
        this.book = book;
        this.stock = stock;
    }

    public int getStock(){
        return this.stock;
    }
    public void setStock(int stock){
        this.stock  = stock;
    }
    public void addStock(int val){
        this.stock += val;
    }
    public void removeStock(int val){
        this.stock -= val;
    }
    public Book getBook(){
        return this.book;
    }
    public void setBook(Book book){
        this.book = book;
    }

}
