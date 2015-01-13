/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic1designpatterns;

import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class PaypalStrategy implements PaymentStrategy {
    private String email;
    private String password;
    
    public PaypalStrategy(String email, String password){
        this.email = email;
        this.password = password;
    }
    
        
        @Override
        public void pay(ShoppingCart sc, ItemCollection items){

        double tot = sc.getTotal();
        
        Item itemAux = items.iterator().getCheapest();
        ItemCollectionImp collAux = sc.itemsCart;
        
        if (collAux.iterator().hasItem(itemAux, collAux)){
            tot = tot - items.iterator().getCheapest().price;
        }
        
        int aux = JOptionPane.showConfirmDialog(null, "Confirm transaction. Paypal account: " + email +" will be charged $" +tot, "Confirm payment", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
