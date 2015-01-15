/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paymentPackage;

import itemsPackage.ItemCollection;
import shoppingCartPackage.ShoppingCart;

/**
 *
 * @author Santiago
 */
public interface PaymentStrategy {
    public void pay(ShoppingCart sc, ItemCollection items);
}
