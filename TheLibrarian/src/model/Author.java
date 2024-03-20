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
    public boolean equals(Object o) {
        if (super.equals(o)) {
            return true;
        }
        Author other = (Author) o;
        
        return Objects.equals(name, other.getName());
    }
}
