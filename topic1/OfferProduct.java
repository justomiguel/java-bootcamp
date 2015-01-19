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
public class OfferProduct extends Product {

    private double discount;
    private String offerName;

    public OfferProduct(String productName, String productDescription, double price, double discount, String offerName) {
        super(productName, productDescription, price);
        this.discount = discount;
        this.offerName = offerName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }
    
    @Override
    public double getPrice(){
        return super.getPrice() - discount;
    }
    
    public String toString(){
      String a =  this.getOfferName() + " .... $" + this.getPrice();
      String b = this.getProductName() + " .... $" + super.getPrice();
      return a + " \n \t "  + b;
    }
    
}
