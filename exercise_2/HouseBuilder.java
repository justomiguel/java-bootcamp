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
//abstract class HouseBuilder {
public interface HouseBuilder {
    /*protected House house;
    
    public House getHouse(){
        return house;
    }
    
    public void newHouse(){
        house = new House();
    }*/
    
    public void buildBathroom();
    public void buildBedroom();
    public void buildFloor();
    
    public House getHouse();
    
    
    
}
