package model;

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
    public boolean equals(Object other){
        System.out.println("equals() method not yet finished for class Reader");
        if (super.equals(other)) {
            return true;
        }
        return false;
    }
}
