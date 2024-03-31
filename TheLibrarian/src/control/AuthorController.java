package control;

import model.Author;
import dao.AuthorDAO;

public class AuthorController {

    private final AuthorDAO dao;

    public AuthorController(AuthorDAO dao) {
        this.dao = dao;
    }

    public void createAuthor(String name) {
    }
    
    public void deleteAuthor(){
        
    }
}
