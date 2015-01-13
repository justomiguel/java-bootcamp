/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic1designpatterns;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class OfferList {

    List<Offer> offers;

    public OfferList() {
        offers = new ArrayList<Offer>();
    }

    public void addOffer(Offer o) {
        offers.add(o);
        System.out.println("Offer" + o + "succesfully added");
    }

    public OfferIteratorInterface iterator() {
        return new OfferIterator(this.offers);
    }

    class OfferIterator implements OfferIteratorInterface {

        private List<Offer> offerList;
        private int currentIndex = 0;

        public OfferIterator(List<Offer> offers) {
            this.offerList = offers;
        }

        @Override
        public boolean hasNext() {
            if (currentIndex >= offerList.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Offer next() {

            Offer o = offerList.get(currentIndex);
            currentIndex++;
            
            return o;

        }

        @Override
        public void remove() {
            offers.remove(--currentIndex);
        }

        @Override
        public int getIndex(Item i) {
            int index = 0;
            while (offers.iterator().hasNext()) {
                if (offers.get(index).getI().equals(i)) {
                    return index;

                } else {
                    index++;
                    offers.iterator().next();
                }
            }
            return -1;

        }

        @Override
        public void printDiscountItems() {
            int length = offerList.size();
            for (int i = 0; i < length; i++) {
                System.out.println(offerList.get(i));
            }

        }
    }
}
