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
public class PaypalPayment extends Payment {

    private String email;
    private String password;

    public PaypalPayment(String email, String password,  Date datePayment) {
        super(datePayment);
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    
    
}
