/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberta
 */
public class TestAuthor {
    
    public static void main(String[] args){
       Author anAuthor = new Author("Julio Cortazar", "juliocortazar@somewhere.com", 'm');
       System.out.println(anAuthor);   // call toString()
       anAuthor.setEmail("julio@nowhere.com");
       System.out.println(anAuthor);
    }
    
}
