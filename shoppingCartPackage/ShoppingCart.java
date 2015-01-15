/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingCartPackage;

import itemsPackage.ItemCollection;
import itemsPackage.ItemIterator;
import itemsPackage.Item;
import itemsPackage.ItemCollectionImp;

/**
 *
 * @author Santiago
 */
public class ShoppingCart  {

    protected double total;
    protected ItemCollectionImp itemsCart = new ItemCollectionImp();
    
    public ShoppingCart(){
        total = 0;
    }
    
    
    //Adds single item to cart and calls addTotal method to sum the new total
    public void addToCart(ItemCollection items, Item item, int quantity){
        int index = 0;
        boolean itemFlag = false;
        if (items == null){
            System.out.println("No items for sale");
            
        } else {
            ItemIterator iterator = items.iterator();
            while (iterator.hasNext()){
                if (iterator.getItem(index).equalsIgnoreCase(item.getName())){
                    itemFlag = true;
                    
                    break;
                } else {
                    items.iterator().next();
                    index ++;
                }
            }
        }
        
        if (itemFlag == true){
            
           itemsCart.addItem(item);
           this.addTotal(item, quantity);
        } else {
            System.out.println("We do not have the item " + item.toString() + " in stock. Please contact the manager");
        }
    }
    
    // Sums total price for a single item and its quantity, checks for offers too 
    public void addTotal(Item i, int quantity){
        if (i.getDiscountPrice() != -1){
        total += (i.getDiscountPrice()*quantity);
        } else 
            total += (i.getPrice()*quantity); 
    }
    
    public double getTotal(){
        return total;
    }
    
    public ItemCollectionImp getCartItems(){
        return this.itemsCart;
    }
    // Returns new instance of shopping cart (clears current instance)
    public ShoppingCart clearCart(){
        return new ShoppingCart();
    }
    
}