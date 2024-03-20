package model;

import java.util.Objects;

public class Book extends ObjectWithID {

    private String title;
    private Author author;
    private int year;
    private Stock stock;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    //<editor-fold defaultstate="collapsed" desc="get/set code">
    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
    //</editor-fold>

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            return true;
        }

        Book other = (Book) o;
        
        return (Objects.equals(title, other.getTitle())
                && Objects.equals(author, other.getAuthor())
                && Objects.equals(year, other.getYear()));
    }
}
