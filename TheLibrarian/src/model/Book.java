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

    //<editor-fold defaultstate="collapsed" desc="Get/Set Code">
    //  Getters / setters
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
    //</editor-fold>
    
    /**
     * Compares current book with another instance of the same class
     * @return <code>true</code> if both share the same <code>title</code>, 
     * <code>author</code> and <code>year</code>
     */
    public boolean equals(Book otherBook){
        return (this.title.equals(otherBook.getTitle()) 
                && this.author.equals(otherBook.getAuthor())
                && this.year == otherBook.getYear()
                );
    }
    
    /**
     * Compares the current instance's properties with passed parameters
     * @return <code>true</code> if both share the same <code>title</code>, 
     * <code>author</code> and <code>year</code>
     */
    public boolean equals(String title, Author author, int year){
        return (this.title.equals(title)
                && this.author.equals(author)
                && this.year == year);
    }
}
