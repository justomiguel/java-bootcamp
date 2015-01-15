/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailsPackage;

import shoppingCartPackage.ShoppingCart;
import offerPackage.Offer;
import paymentCounterPackage.PaymentCounter;
import itemsPackage.Item;

/**
 *
 * @author Santiago
 */
public class MailingList {
    private String email;
    private StringBuilder sb = new StringBuilder(100);

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContents() {
        return sb.toString();
    }

    public void setContents(StringBuilder sb) {
        this.sb = sb;
    }
    
    public String sendEmail(Offer o){
        sb.append("There has been a new offer added:");
        sb.append(o.toString());
        System.out.println("Email with a new offer details sent");
        return sb.toString();
    }
    
    public String sendEmail(Item i){
        sb.append("Item: ");
        sb.append(i.getName());
        sb.append(" Changed price to: ");
        sb.append(i.getPrice());
        System.out.println("Email with item price change details sent");
        return sb.toString();
    }
    public String sendEmail(ShoppingCart sc){ 
        sb.append("Transaction number: ");
        sb.append(PaymentCounter.INSTANCE.getNextValue());
        sb.append(" completed, total spent was: ");
        sb.append(sc.getTotal());
        System.out.println("Email with new transaction details sent");
        return sb.toString();
    }
    
}
