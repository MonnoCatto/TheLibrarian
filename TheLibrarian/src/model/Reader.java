package model;

/*
 *  UNIMPLEMENTED CLASS
 */

public class Reader {

    private int id;
    private String name;
    private String cpf;
    private String phone;
    //private BorrowList borrowList;

    public Reader(){
    }

    public Reader(int id, String name, String cpf){

        this.id = id;
        this.name = name;
        this.cpf = cpf;
        //this.borrowList = new BorrowList();
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
    public String getCPF(){
        return this.cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }/*
    public BorrowList getBorrowList(){
        return this.borrowList;
    }
    public void setBorrowList(BorrowList list){
        this.borrowList = list;
    }*/
}