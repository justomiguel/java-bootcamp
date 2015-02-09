
package com.javabootcamp.mavenspringproject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Shopping cart class
 * @author Santiago
 */
@Configuration
public class ShoppingCart  {
    /**
     * Total price 
     */
    protected double total;
    /**
     * Current items added in cart
     */
    private Set itemsInCart = new HashSet();
    /**
     * Different items in cart count
     */
    protected int itemCount;
    
    /**
     * Shopping cart constructor
     */
    public ShoppingCart(){
        total = 0;
        itemCount = 0;
    }

    /**
     * Returns amount of different items in cart
     * @return int
     */
    public int getItemCount() {
        return itemCount;
    }
    
    
    /**
     * Adds and item to itemsInCart and calls addTotal
     * @param i item
     * @param quantity int
     */
    @Bean
    public void addToCart(Item i, int quantity){
        itemsInCart.add(i);
        addTotal(i, quantity);
        itemCount ++;
    }
    
    /**
     * Removes item i from cart
     * @param i item
     */
    @Bean
    public void removeFromCart(Item i){
        itemsInCart.remove(i);
        itemCount --;
    }
    
   /**
    * Adds and prints current total when new item is added to cart
    * @param i Item
    * @param quantity Quantity of item i
    */
    private void addTotal(Item i, int quantity){//Item i, int quantity){
       total += i.getPrice() * quantity;
       System.out.println("New total: " + total);
       
    }
    
    /**
     * Completes transaction for items in shopping cart and clears cart
     * @return String returns list of items and total paid
     */
    @Bean
    public String checkoutCart(){
        getCartItems();
        StringBuilder sb = new StringBuilder();
        sb.append("Total for this transaction: ");
        sb.append(getTotal());
        sb.append("Transaction completed. Clearing cart");
        clearCart();
        return sb.toString();      
    }
    
    /**
     * Return total price of Sum (itemPrice*quantity)
     * @return double
     */
    private double getTotal(){
        return total;
    }
    
    /**
     * Prints all items in cart as String
     */
    @Bean
    public void getCartItems(){
        for (Iterator it = itemsInCart.iterator(); it.hasNext();){
            Item i = (Item) it.next();
            System.out.println(i.toString());
        }
    }
    
    /**
     * Clears current cart instance, puts total and itemCount values to zero
     */
    @Bean
    public void clearCart(){
        itemsInCart.clear();
        total = 0.0;
        itemCount = 0;
        System.out.println("Cart cleared");
    }
    
}