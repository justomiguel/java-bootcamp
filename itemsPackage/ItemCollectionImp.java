/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itemsPackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class ItemCollectionImp implements ItemCollection {

    private List<Item> itemList;

    public ItemCollectionImp() {
        itemList = new ArrayList<>();
    }

    @Override
    public void addItem(Item i) {
        this.itemList.add(i);
    }

    @Override
    public void removeItem(Item i) {
        this.itemList.remove(i);
    }

    @Override
    public String getItemName(int index) {
        return itemList.get(index).getName();
    }

    @Override
    public Item getItem(int index) {
        return itemList.get(index);
    }

    @Override
    public ItemIterator iterator() {
        return new ItemIteratorImp(this.itemList);
    }

    private class ItemIteratorImp implements ItemIterator {

        private List<Item> items;
        private int index = 0;

        public ItemIteratorImp(List<Item> itemList) {
            this.items = itemList;
        }

        @Override
        public boolean hasNext() {
            if (index >= items.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Item next() {
            Item i = items.get(index);
            index++;
            return i;
        }

        @Override
        public String getItem(int index) {
            return items.get(index).getName();
        }

        @Override
        public boolean hasItem(Item item, ItemCollectionImp collection) {
            boolean itemFound = false;
            int index = 0;
            ItemIterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (iterator.getItem(index).equalsIgnoreCase(item.getName())) {
                    itemFound = true;

                } else {
                    index++;
                    iterator.next();
                }
            }
            return itemFound;
        }

        @Override
        public Item getCheapest() {
            double cheap = 99999;
            int indexAux = 0;
            int length = items.size();
            for (int i = 0; i < length; i++) {
                if (items.get(i).price < cheap) {
                    cheap = items.get(i).price;
                    indexAux = i;
                }
            }
            return items.get(indexAux);

        }

        @Override
        public Item getMostExpensive() {
            double expensive = 0;
            int indexAux = 0;
            int length = items.size();
            for (int i = 0; i < length; i++) {
                if (items.get(i).price > expensive) {
                    expensive = items.get(i).price;
                    indexAux = i;
                }
            }
            return items.get(indexAux);
        }
    }
}
