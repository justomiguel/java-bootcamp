/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paymentPackage;

import itemsPackage.ItemCollection;
import itemsPackage.Item;
import javax.swing.JOptionPane;
import mailsPackage.MailingList;
import paymentCounterPackage.PaymentCounter;
import shoppingCartPackage.ShoppingCart;

/**
 *
 * @author Santiago
 */
public class CashStrategy implements PaymentStrategy {
    
        @Override
        public void pay(ShoppingCart sc, ItemCollection items){
        
        double tot = sc.getTotal();
        
        Item itemAux = items.iterator().getMostExpensive();
        
        if (sc.getCartItems().iterator().hasItem(itemAux, sc.getCartItems())){
            tot = tot - items.iterator().getMostExpensive().getPrice()*0.9;
        } 

        
        int aux = JOptionPane.showConfirmDialog(null, "Confirm transaction. You will be charged $" +tot, "Confirm payment", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (aux == 0){
            PaymentCounter pc = PaymentCounter.getInstance();
            pc.getNextValue();
            MailingList ml = new MailingList();
            ml.sendEmail(sc);
            
        } else{
            sc.clearCart();
        }
    }
}
