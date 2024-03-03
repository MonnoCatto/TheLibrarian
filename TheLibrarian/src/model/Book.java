package model;
public class Book { 
    
    private static int staticID = 0;
    public final int id;
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year){
        id = staticID;
        staticID += 1;
        
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public int getID(){
        return this.id;
    }
    //public void setID(int id){
    //    this.id = id;
    //}
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
