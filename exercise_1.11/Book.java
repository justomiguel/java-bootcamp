/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberta
 */
public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qtyInStock = 0;

    public Book(String name, Author[] authors, double price, int qtyInStock) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }



    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    //The toString() method shall return "book-name by n authors", where n is the number of authors.
    @Override
    public String toString() {
        return " Book " + name + " by " + authors.length + " authors ";
    }

        //A new method printAuthors() to print the names of all the authors.
    public void printAuthors(){
        for (int i = 0; i < authors.length; i++ ){
            System.out.println(authors[i]);
        }
    }
}