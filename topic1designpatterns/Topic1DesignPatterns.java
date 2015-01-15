/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic1designpatterns;

import shoppingCartPackage.ShoppingCart;
import offerPackage.Offer;
import offerPackage.OfferList;
import paymentCounterPackage.PaymentCounter;
import paymentPackage.CashStrategy;
import itemsPackage.ItemCollection;
import itemsPackage.ItemIterator;
import itemsPackage.Item;
import itemsPackage.ItemCollectionImp;

/**
 *
 * @author Santiago
 */
public class Topic1DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        PaymentCounter one = PaymentCounter.getInstance();
       
        ItemCollection items = populateItems();
        ItemIterator baseIterator = items.iterator();
        while (baseIterator.hasNext()){
            Item i = baseIterator.next();
            System.out.println(i.toString());
        }
        System.out.println(""); 
        
        Item otroItem = new Item("Shoes", 50.00);
        
        OfferList offers = new OfferList();
        
        Offer o = new Offer(10, "Bread discount", items.getItem(0));
        Offer o2 = new Offer(15, "Meat discount", items.getItem(1));
        Offer o3 = new Offer(20, "Table discount", items.getItem(7));
        offers.addOffer(o);
        offers.addOffer(o2);
        offers.addOffer(o3);
        
        
        offers.iterator().printDiscountItems();
        
        ShoppingCart sc = new ShoppingCart();
        sc.addToCart(items, items.getItem(0), 5);
        System.out.println(sc.getTotal());
        
        CashStrategy cashPay = new CashStrategy();
        cashPay.pay(sc, items);

    }
    
    private static ItemCollection populateItems(){
        ItemCollection items = new ItemCollectionImp();
        items.addItem(new Item("Bread", 05.60));
        items.addItem(new Item("Meat", 35.60));
        items.addItem(new Item("Paper", 10.00));
        items.addItem(new Item("Pencil", 02.50));
        items.addItem(new Item("Cereals", 03.50));
        items.addItem(new Item("Milk", 01.75));
        items.addItem(new Item("Peanuts", 00.50));
        items.addItem(new Item("Table", 75.50));
        return items;
    }
}
