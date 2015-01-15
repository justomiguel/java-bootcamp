/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itemsPackage;

/**
 *
 * @author Santiago
 */
public class Item {

    String name;
    double price;
    double discountPrice; //New price after applying discount, set at -1 if no Offer available for Item

    @Override
    public String toString() {
        return "* Item:" + name + " ........ $" + price;
    }

    public String getName() {
        return name;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscountPrice(double price) {
        this.discountPrice = price;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.discountPrice = -1;
    }

}
