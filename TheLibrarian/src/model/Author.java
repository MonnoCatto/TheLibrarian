package model;

import java.util.Objects;

public class Author extends ObjectWithID {

    private String name;
    private String birth;

    public Author(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    public Author(String name) {
        this.name = name;
    }

    //  <editor-fold defaultstate="collapsed" desc="get/set code">
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return this.birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
    //  </editor-fold>

    @Override
    public boolean equals(Object othr) {
        if (super.equals(othr)) {
            return true;
        }
        Author other = (Author) othr;
        boolean birthIsNull = (other.getBirth() == null);

        if (birthIsNull) { 
            System.out.println("No birth date is set, comparing only the name of the author.");
            return Objects.equals(this.name, other.getName());
        }
        
        return (Objects.equals(this.name, other.getName())
                && Objects.equals(this.birth, other.getBirth()));
    }
}
