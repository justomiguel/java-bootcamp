
package com.javabootcamp.mavenspringproject;

import org.springframework.context.annotation.Configuration;



/**
 * Item class with setters/getters methods for properties Item name and Item price
 * 
 */
@Configuration
public class Item {
    /**
     * Name of the item
     */
    private String name;
    /**
     * Price of the item (double)
     */
    private double price;
    
    public Item(){}
    /**
     * Returns Item as a String in the form of [* Item: name .....$price]
     *  
     * @return String
     */
    @Override
    public String toString() {
        return "* Item:" + name + " ........ $" + price;
    }
    
    /**
     * Returns name of Item
     * @return String
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets Item name
     * @param name Name of the item
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Returns item price
     * @return double Price of the item
     */
    public double getPrice() {
        return price;
    }
    
    /**
     * Sets item price
     * @param price 
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * Item constructor
     * @param name String Item name
     * @param price double Item price
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

}
