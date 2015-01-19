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
public class Item implements Comparable<Item> {

    private int quantityItem;
    private Product product;

    public Item(int quantity, Product product) {

        this.quantityItem = quantity;
        this.product = product;
    }

    public int getQuantityItem() {
        return quantityItem;
    }

    public void setQuantityItem(int quantityItem) {
        this.quantityItem = quantityItem;
    }

    public String displayInformation() {
        return ("Item Name:" + this.product.getProductName() + "......" + this.product.getPrice());

    }

    public double getSubTotal() {
        return this.product.getPrice() * quantityItem;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int compareTo(Item t) {
        return this.getProduct().compareTo(t.getProduct());
    }

    @Override
    public String toString() {
        return "Item{" + "quantity Item=" + quantityItem + ", product=" + product + ", subtotal=" + getSubTotal() + '}';
    }

}
