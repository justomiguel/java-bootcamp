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
public interface ItemIterator {
    
    public boolean hasNext();
    public String getItem(int index);  
    public Item next();
    public Item getCheapest();
    public Item getMostExpensive();
    public boolean hasItem(Item item, ItemCollectionImp collection);
}
