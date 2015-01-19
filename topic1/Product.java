/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 *
 * @author roberta
 */
public class Product implements Comparable<Product> {

    private String productName;
    private String productDescription;
    private double price;

    public Product(String productName, String productDescription, double price) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product t) {
        return ((Double) this.getPrice()).compareTo(t.getPrice());
    }

    @Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", Product Description=" + productDescription + ", Price=" + price + '}';
    }

}
