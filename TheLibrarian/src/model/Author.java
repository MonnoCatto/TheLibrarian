package model;

import java.util.ArrayList;

public class Author {
    
    private int id;
    private String name;
    private ArrayList<Book> bksWritten = new ArrayList<Book>();

    public Author(){
    }

    Author (int id, String name){
        this.id = id;
        this.name = name;
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
    public String getBooksWritten(){
        return this.bksWritten.toString();
    }
    public ArrayList<Book> getBooksWrittenArrayList(){
        return this.bksWritten;
    }
    public void addBookWritten(Book newBook){
        
        boolean flag = false;
        for (int i = 0; i < bksWritten.size() && !flag; i++){

            if (bksWritten.get(i).getID() == newBook.getID()){
                flag = true;
            }
        }
        if (!flag) bksWritten.add(newBook);
    }
    public void removeBookWritten(int rmvID){

        boolean flag = false;
        for (int i = 0; i < bksWritten.size() && !flag; i++){

            if (bksWritten.get(i).getID() == rmvID){

                bksWritten.remove(i);
                flag = true;
            }
        }
    }
}
