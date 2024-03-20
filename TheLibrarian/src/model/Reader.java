package model;

import java.util.Objects;

public class Reader extends ObjectWithID {

    private String name;
    private String cpf;
    private String phone;

    public Reader(String name, String cpf) {

        this.name = name;
        this.cpf = cpf;
    }

    //  <editor-fold defaultstate="collapsed" desc="get/set code">
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    //  </editor-fold>
    
    @Override
    public boolean equals(Object o){
        if (super.equals(o)) {
            return true;
        }
        Reader other = (Reader) o;
        
        return Objects.equals(this.cpf, other.getCPF());
    }
}
