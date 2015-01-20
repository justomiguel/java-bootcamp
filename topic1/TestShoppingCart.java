/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author roberta
 */
public class TestShoppingCart {

    private static List<Item> n;

    public static void main(String[] args) {
        Product tv = new Product("Tv led", "Resolution screen: 1366 x 768 pixels", 2500);
        Product freezer = new Product("Freezer", "352 liters capacity", 8000);
        Product fridge = new Product("Fridge Atma", "Stainless steel. No Frost", 9600);

        Item item1 = new Item(1, tv);
        Item item2 = new Item(1, freezer);
        Item item3 = new Item(1, fridge);

        ShoppingCart sc = new ShoppingCart();
        List<Item> itemList = new ArrayList<Item>();
        itemList.add(item1);
        System.out.println(item1);
        itemList.add(item2);
        System.out.println(item2);
        itemList.add(item3);
        System.out.println(item3);
        sc.setItemList(itemList);
        sc.setPayment(new CreditCard(new Date(),36236541,"Visa",new Date()));
        sc.setPayment(new PaypalPayment("user@name.com", "hola123",new Date()));
        
        User user = new User("Ana", "user@name.com", "123456");
        MySystem.getInstance().addObserver(user);
        
        System.out.println(sc.getDiscountCreditCard());
        System.out.println(sc.toString());
        System.out.println(sc.getLessExpensiveItem());
        
        MySystem.getInstance().newSale(sc);
        
        
        OfferProduct op1 = new OfferProduct("Notebook 15'", "Offers endless entertainment options", 4000, 500, "New electronic sales");
        OfferProduct op2 = new OfferProduct("Samsung Galaxy SmartPhone'", "Info", 5000, 500, "New electronic sales");
        System.out.println(op1.toString());
        
    }
}
