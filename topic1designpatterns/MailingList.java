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
public class MailingList {
    private String email;
    private String contents;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
    
    public String sendEmail(Offer o){
        contents += "There has been a new offer added:";
        contents += o.toString();
        System.out.println("Email with a new offer details sent");
        return contents;
    }
    
    public String sendEmail(Item i){
        contents += "Item: " +i.getName() +" Changed price to:" + i.getPrice();
        System.out.println("Email with item price change details sent");
        return contents;
    }
    public String sendEmail(ShoppingCart sc){ 
        contents += "Transaction number: " +PaymentCounter.getInstance() +" completed, total spent was: " + sc.getTotal();
        System.out.println("Email with new transaction details sent");
        return contents;
    }
    
}
