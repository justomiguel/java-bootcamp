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
public interface OfferIteratorInterface {
    public boolean hasNext();
    public Offer next();
    public void remove();
    public int getIndex(Item i);
    public void printDiscountItems();
}
