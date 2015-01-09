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
public class Construction {
    private HouseBuilder houseBuilder;
    
    public void setHouseBuilder(HouseBuilder hb){
        houseBuilder = hb;
    }
    
    public House getHouse(){
        return houseBuilder.getHouse();
    }
    
    public void buildingHouse(){
        houseBuilder.newHouse();
        houseBuilder.buildBathroom();
        houseBuilder.buildBedroom();
        houseBuilder.buildFloor();
    }
    
}
