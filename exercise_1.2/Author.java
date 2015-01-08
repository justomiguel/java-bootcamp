/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberta
 */
public class Author {
    private String name;
    private String email;
    private char gender;
    
public Author(String name, String email, char gender){
    this.name = name;
    this.email = email;
    this.gender = gender;
}




    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return name + " "+ "(" + gender + ")" + " " + "at" +" " + email;
    }




    
    
    
    
    
}
