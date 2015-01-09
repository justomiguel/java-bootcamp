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
 
        HouseBuilder houseBuilder = new DuplexHouseBuilder();
        ConstructionDirector constructionDirector = new  ConstructionDirector(houseBuilder);
        constructionDirector.buildHouse();
        House house = constructionDirector.getHouse();
        System.out.println("House is:" + house);
        
        houseBuilder = new OneFloorHouseBuilder();
        constructionDirector = new  ConstructionDirector(houseBuilder);
        constructionDirector.buildHouse();
        house = constructionDirector.getHouse();
        System.out.println("House is:" + house);
        
    /*    HouseBuilder duplexHouse = new DuplexHouse();
        HouseBuilder oneFloorHouse = new OneFloorHouse(); 
        construction.setHouseBuilder(duplexHouse);
        construction.buildingHouse();
        House house = construction.getHouse();*/
        
        
    }
}
