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

    public static void main(String[] args) {
//        Author anAuthor = new Author("Julio Cortazar", "juliocortazar@somewhere.com", 'm');
//        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
//        System.out.println(aBook);
//// Use an anonymous instance of Author
//        Book anotherBook = new Book("more Java for dummy", new Author("Meinadier","meinadier@somewhere.com", 'm'), 29.95, 888);
//        System.out.println(anotherBook);
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()
        System.out.print("The authors are: ");
        javaDummy.printAuthors();
    }

}
