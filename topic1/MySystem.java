/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * falta ultima parte del patrón
 *
 * @author roberta
 */
public class MySystem extends Observable {

    private static MySystem system;

    private List<Product> productList = new ArrayList<>();
    private List<User> userList = new ArrayList<>();
    private List<Payment> paymentList = new ArrayList<>();
    private List<OfferProduct> offerList = new ArrayList<>();
    private List<ShoppingCart> cartList = new ArrayList<>();
    private  int id = 0;

    private MySystem() {
    }

    public static MySystem getInstance() {
        if (system == null) {
            system = new MySystem();

        }
        return system;
    }

    public static MySystem getSystem() {
        return system;
    }

    public static void setSystem(MySystem system) {
        MySystem.system = system;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public List<OfferProduct> getOfferList() {
        return offerList;
    }

    public void setOfferList(List<OfferProduct> offerList) {
        this.offerList = offerList;
    }

    public List<ShoppingCart> getCartList() {
        return cartList;
    }

    public void setCartList(List<ShoppingCart> cartList) {
        this.cartList = cartList;
    }

    private static MySystem instance;

    /**
     * new sale is created
     */
    public void newSale(Object sale) {
        setChanged();
        notifyObservers();
    }

    /**
     * when there's a new offer
     *
     * @param item
     */
    public void newOfferAvailable(Object item) {
        setChanged();
        notifyObservers();
    }

    /**
     * When a price has changed
     *
     * @param precio
     */
    public void newPriceChanged(String precio) {
        setChanged();
        notifyObservers(precio);
    }

    public void addOffer(OfferProduct newOffer) {
        offerList.add(newOffer);
        setChanged();
        notifyObservers(newOffer);
        
    }

    public void changedPrice(Product newPrice) {
        productList.add(newPrice);
        setChanged();
        notifyObservers(newPrice);
    }

    public void newTransaction(Payment newTransaction) {
        paymentList.add(newTransaction);
        setChanged();
        notifyObservers(newTransaction);
    }

    public int getIdUnique() {
       id++;
       return id;  
    }

}

