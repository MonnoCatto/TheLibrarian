package model;

import java.util.Objects;

public class Loan extends ObjectWithID {

    public final Book book;
    public final Reader reader;
    public int quantity;
    
    public Loan(Book b, Reader r){
        book = b;
        reader = r;
    }
    
    @Override
    public boolean equals(Object o){
        if (super.equals(o)){
            return true;
        }
        Loan other = (Loan) o;
        
        return (Objects.equals(book, other.book)
                && Objects.equals(reader, other.reader));
    }
}
