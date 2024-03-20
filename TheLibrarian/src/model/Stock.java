package model;

import java.util.Objects;

public class Stock extends ObjectWithID {

    private final Book book;
    private int quantity;

    public Stock(Book book) {
        this.book = book;
        quantity = 0;
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
    public boolean equals(Object o) {
        if (super.equals(o)) {
            return true;
        }
        Stock other = (Stock) o;
        return Objects.equals(book, other.getBook());
    }
}
