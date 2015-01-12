/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosoop;

/**
 *
 * @author Santiago
 */
public class Author {
    private String name;
    private String email;
    private char gender;

    @Override
    public String toString() {
        return name + "(" +gender +")" + " at" + email ;
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        
        if (gender == 'm' || gender == 'f')
            this.gender = gender;
        else {System.out.println("Gender must be 'm' or 'f' ");
            System.exit(0);
        }
    }

    public void setEmail(String email) {
        this.email = email;
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
    
    
}
