
package com.javabootcamp.finalproject.data.jpa.service;

import com.javabootcamp.finalproject.data.jpa.domain.Product;
import com.javabootcamp.finalproject.data.jpa.domain.Shoppingcart;
import org.springframework.transaction.annotation.Transactional;

public interface ShoppingService {

    /**
     * Adds single item to cart given an product name
     * @param name
     * @param username
     * @param password
     * @return 
     */
    @Transactional
    Product addToCart(String name, String username, String password);
    /**
     * Adds items to cart given by product name and quantity
     * @param quantity
     * @param name
     * @param username
     * @param password
     * @return 
     */
    @Transactional
    Product addToCartItems(int quantity, String name, String username, String password);
    /**
     * Removes an item from cart given by product name and quantity
     * @param quantity
     * @param name
     * @param username
     * @param password
     * @return 
     */
    @Transactional
    String removeFromCart(int quantity, String name, String username, String password);   
    /**
     * Saves cart
     * @param s 
     */
    void save(Shoppingcart s);
    /**
     * Returns cart of given user
     * @param username
     * @param password
     * @return 
     */
    String getCart(String username, String password);
    /**
     * Empty cart of the given user. Sets total to zero and deletes items in cart.
     * @param username
     * @param password
     * @return 
     */
    @Transactional
    public String clearCart(String username, String password);
}
