/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.Date;

/**
 *
 * +public class CreditCard extends PaymentMethod
 *
 * @author roberta
 */
public class CreditCard extends Payment {

    private int creditNumber;
    private String companyName;
    private Date expirationDate;
    
    public CreditCard(Date datePayment, int creditNumber, String companyName,Date expirationDate) {
        super(datePayment);
        this.companyName = companyName;
        this.creditNumber = creditNumber;
        this.expirationDate = expirationDate;

    }

    public int getCreditNumber() {
        return creditNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }


    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }


}
