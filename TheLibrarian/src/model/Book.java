package model;

import java.util.Objects;

public class Book { 
    
    private static int staticID = 0;
    private int id;
    private String title;
    private Author author;
    private int year;
    private Stock stock;

    public Book(String title, Author author, int year){
        generateID();
        this.title = title;
        this.author = author;
        this.year = year;
    }
    //  Adds the option to generate a book with no author,
    //  in case the user wants to assign the author later.
    public Book (String title, int year){
        generateID();
        this.title = title;
        this.year = year;
    }

    //<editor-fold defaultstate="collapsed" desc="Get/Set Code">
    public int getID(){
        return this.id;
    }
    public String getTitle(){
       return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public Author getAuthor(){
        return this.author;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public Stock getStock(){
        return stock;
    }
    public void setStock(Stock stock){
        this.stock = stock;
    }
    //</editor-fold>
    
    @Override
    public boolean equals(Object other){
        if (this == other) return true;
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;
        
        Book otherBook = (Book) other;
        boolean authorIsNull = (otherBook.getAuthor() == null);
        
        if (authorIsNull){
            return(
                    Objects.equals(this.title, otherBook.getTitle())
                    && Objects.equals(this.year, otherBook.getYear())
                    );
        }
        return(
                Objects.equals(this.title, otherBook.getTitle())
                && Objects.equals(this.author, otherBook.getAuthor())
                && Objects.equals(this.year, otherBook.getYear())
                );
    }
    
    private void generateID(){
        id = staticID;
        staticID += 1;
    }
}
