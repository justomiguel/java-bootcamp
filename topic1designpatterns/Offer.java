/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic1designpatterns;

/**
 *
 * @author Santiago
 */
public class Offer {

    private double discount; //Discount for Item i in percentages
    private String offerDescription;
    private Item i;

    @Override
    public String toString() {
        return "Offer{" + "discounted price: " + i.getDiscountPrice() + ", offerDescription: " + offerDescription + " regular price: " + i.getPrice() + '}';
    }

    public double getDiscount() {
        return discount;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public Item getI() {
        return i;
    }

    public Offer(double discount, String offerDescription, Item i) {
        if (discount > 0.99 && discount < 100) {
            this.discount = discount;
            this.offerDescription = offerDescription;
            this.i = i;

            discount = discount / 100;
            double aux = i.getPrice() - i.getPrice() * discount;
            i.setDiscountPrice(aux);
        } else {
            System.out.println("Discount must be a percentage between 1.00 and 99.99");
        }

    }

}
