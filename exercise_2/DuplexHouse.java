/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package building;

/**
 *
 * @author roberta
 */
public class DuplexHouse extends HouseBuilder{

    @Override
    public void buildBathroom() {
        house.setBathroomQuantity(2);
        house.setBedroomQuantity(4);
        house.setFloorQuantity(2);
    }

    @Override
    public void buildBedroom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buildFloor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
