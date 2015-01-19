/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author roberta
 */
public class ShoppingCart {

    List<Item> itemList = new ArrayList<>();
    private double discount;
    private double total = 0;
    private Payment payment;
    private boolean stateCart = false;

    public ShoppingCart() {

    }

    public Item getMostExpensiveItem() {
        TreeSet ts = new TreeSet(itemList);
        return (Item) ts.last();
    }

    public Item getLessExpensiveItem() {
        TreeSet ts = new TreeSet(itemList);
        return (Item) ts.first();
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public boolean isStateCart() {
        return stateCart;
    }

    public void setStateCart(boolean stateCart) {
        this.stateCart = stateCart;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public double getDiscount() {

        if (payment instanceof PaypalPayment) {
            return this.getDiscountPaypal();
        }
        if (payment instanceof CashPayment) {

            return this.getDiscountCash();
        } else {
            return this.getDiscountCreditCard();
        }
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotal() {
        double sum = 0;
        for (Item it : getItemList()) {
            sum += it.getSubTotal();
        }
        total = sum - getDiscount();
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDiscountCash() {
        double discountCash = (this.getMostExpensiveItem().getSubTotal() * 0.90);
        return discountCash;
    }

    public double getDiscountPaypal() {
        double discountPaypal = (this.getLessExpensiveItem().getSubTotal());
        return discountPaypal;
    }

    public double getDiscountCreditCard() {
        double discountCredCard = (this.getMostExpensiveItem().getSubTotal() * 0.10);
        return discountCredCard;
    }

    public void confirmCar(boolean stateCart) {
        stateCart = true;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" + "itemList=" + itemList + ", discount=" + getDiscount() + ", total=" + getTotal() + ", payment=" + payment + '}';
    }

}
