/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shoppingcart;

import java.util.Date;

/**
 *
 * @author roberta
 */
public class Payment {
    private int countId;
    private  Date datePayment;
    private int idPayment;
    
    public Payment(Date datePayment){

        this.datePayment = datePayment;
        this.idPayment = MySystem.getInstance().getId();
    }

    public int getIdPayment() {
        return idPayment;
    }

    
    public int getCountId() {
        return countId;
    }
    
    
    public Date getDatePayment() {
        return datePayment;
    }

    public void setCountId(int countId) {
        this.countId = countId;
    }

    public void setDatePayment(Date datePayment) {
        this.datePayment = datePayment;
    }
    
    
}
