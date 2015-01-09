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
//public class OneFloorHouse extends HouseBuilder{

public class OneFloorHouseBuilder implements HouseBuilder{
    private House house;
    
    public OneFloorHouseBuilder(){
        house = new House();
    }
    
    @Override
    public void buildBathroom() {
        house.setBathroomQuantity(2);
        
    }

    @Override
    public void buildBedroom() {
        house.setBedroomQuantity(3);
    }

    @Override
    public void buildFloor() {
        house.setFloorQuantity(1);
    }
    ///agregado
    @Override
    public House getHouse(){
        return house;
    }
        
}
