/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paymentPackage;

import itemsPackage.ItemCollection;
import javax.swing.JOptionPane;
import mailsPackage.MailingList;
import paymentCounterPackage.PaymentCounter;
import shoppingCartPackage.ShoppingCart;

/**
 *
 * @author Santiago
 */
public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private int cardNumber;

    public CreditCardStrategy(String name, int cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(ShoppingCart sc, ItemCollection items) {
        double tot = sc.getTotal();
        tot = (tot - tot * 0.1);
        int aux = JOptionPane.showConfirmDialog(null, "Confirm transaction. Credit card numer" + cardNumber + " will be charged $" + tot, "Confirm payment", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (aux == 0) {
            PaymentCounter pc = PaymentCounter.getInstance();
            pc.getNextValue();
            MailingList ml = new MailingList();
            ml.sendEmail(sc);

        } else {
            sc.clearCart();
        }
    }
}
