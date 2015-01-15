/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itemsPackage;

/**
 *
 * @author Santiago
 */
public interface ItemCollection {

    public void addItem(Item i);

    public void removeItem(Item i);

    public String getItemName(int index); 

    public ItemIterator iterator();

    public Item getItem(int index);

}
