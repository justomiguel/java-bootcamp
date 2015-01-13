/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic1designpatterns;

/**
 *
 * @author Santiago
 */
public class PaymentCounter {
    
    public static synchronized PaymentCounter getInstance(){
        if (PaymentCounter.INSTANCE == null){
            PaymentCounter.INSTANCE = new PaymentCounter(1);
        }
        return PaymentCounter.INSTANCE;

    }

    private int idValue;
    private static PaymentCounter INSTANCE;
    
    private PaymentCounter(final int idValue){
        this.idValue = idValue;
    }
    public synchronized int getNextValue(){
        return idValue++;
    }

}
