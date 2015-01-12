/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package authorandbook;

/**
 *
 * @author roberta
 */
public class TestMyBook {

    public static void main(String[] args) {
        Book javaDummy = new Book("Java for Dummy", 19.99, 99);
        javaDummy.addAuthor(new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm'));
    //   javaDummy.addAuthor(new Author("Paul Tan", "Paul@nowhere.com", 'm'));
        System.out.println(javaDummy);  // toString()
        System.out.print("The authors are: ");
        javaDummy.printAuthors();
        System.out.println(javaDummy);
        javaDummy.removeAuthorByName("Paul Tan");
        

        javaDummy.removeAuthorByName("Tan Ah Teck");
        javaDummy.printAuthors();
          // toString()
        System.out.print("The authors are: ");
        javaDummy.printAuthors();
    }
}
