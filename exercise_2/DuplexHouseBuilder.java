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
//public class DuplexHouse extends HouseBuilder{

  public class DuplexHouseBuilder implements HouseBuilder{
      
    private House house;
    
    public DuplexHouseBuilder(){
        house = new House();
    }
    
    @Override
    public void buildBathroom() {
        house.setBathroomQuantity(2);
     }

    @Override
    public void buildBedroom() {
        house.setBedroomQuantity(4);
    }

    @Override
    public void buildFloor() {
        house.setFloorQuantity(2);
    }
    ////agregado
    @Override
    public House getHouse(){
        return house;
    }
    
}
