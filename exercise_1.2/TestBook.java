/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberta
 */
public class TestBook {
    public static void main(String[] args){
        Author anAuthor = new Author("Julio Cortazar", "juliocortazar@somewhere.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
        System.out.println(aBook);
// Use an anonymous instance of Author
        Book anotherBook = new Book("more Java for dummy", new Author("Meinadier","meinadier@somewhere.com", 'm'), 29.95, 888);
        System.out.println(anotherBook);
    }
    
}
