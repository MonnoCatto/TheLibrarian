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

    //  Adds the option to generate a book with no author,
    //  in case the user wants to assign the author later.
    public Book(String title, int year) {
        this.title = title;
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
    public boolean equals(Object othr) {
        if (super.equals(othr)) {
            return true;
        }

        Book other = (Book) othr;
        boolean authorIsNull = (other.getAuthor() == null);

        if (authorIsNull) {
            System.out.println("No author is set, comparing only the title and year of the books.");
            return (Objects.equals(this.title, other.getTitle())
                    && Objects.equals(this.year, other.getYear()));
        }
        return (Objects.equals(this.title, other.getTitle())
                && Objects.equals(this.author, other.getAuthor())
                && Objects.equals(this.year, other.getYear()));
    }
}
