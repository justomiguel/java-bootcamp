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
public class BuilderTest {
    public static void main(String[] args) {
        Construction construction = new Construction();
        HouseBuilder duplexHouse = new DuplexHouse();
        HouseBuilder oneFloorHouse = new OneFloorHouseBuilder();
        
        construction.setHouseBuilder(duplexHouse);
        construction.buildingHouse();
        
        House house = construction.getHouse();
    }
}
