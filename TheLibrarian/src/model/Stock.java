package model;

public class Stock extends ObjectWithID {

    private final Book book;
    private int quantity;

    public Stock(Book book) {
        this.book = book;
        quantity = 0;
    }

    public Stock(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public void add(int q) {
        quantity += q;
    }

    public void reduce(int q) {
        quantity -= q;
    }

    //  <editor-fold defaultstate="collapsed" desc="get/set code">
    public Book getBook() {
        return book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int q) {
        quantity = q;
    }
    //  </editor-fold>

    @Override
    public boolean equals(Object othr) {
        if (super.equals(othr)) {
            return true;
        }
        Stock other = (Stock) othr;
        return this.book.equals(other.getBook());
    }
}
