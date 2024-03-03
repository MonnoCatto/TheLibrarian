package model;
public class Book { 
    
    private static int staticID = 0;
    public final int id;
    private String title;
    private Author author;
    private int year;

    public Book(String name, Author author, int year){
        id = staticID;
        staticID += 1;
        
        this.title = name;
        this.author = author;
        this.year = year;
    }

    public int getID(){
        return this.id;
    }
    //public void setID(int id){
    //    this.id = id;
    //}
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
}
