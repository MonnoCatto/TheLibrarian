package model;

public class Author {
    
    private static int staticID = 0;
    private int id;
    private String name;
    private String birth;

    public Author (String name){
        generateID();
        this.name = name;
    }

    public int getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBirth(){
        return this.birth;
    }
    public void setBirth(String birth){
        this.birth = birth;
    }
    
    private void generateID(){
        id = staticID;
        staticID += 1;
    }
}
