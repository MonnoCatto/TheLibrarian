package model;
public class Book { 
    
    private int id;
    private String name;
    private Author author;
    private int year;

    public Book(){
    }

    public Book(int id, String name, Author author, int year){
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
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
}
