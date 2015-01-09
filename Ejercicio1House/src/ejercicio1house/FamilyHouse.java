/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1house;

/**
 *
 * @author Santiago
 */
public class FamilyHouse implements HouseBuilder {
    private House house;
    
    public FamilyHouse(){
        house = new House();
    }
    
    @Override
    public void buildWidth(){
        house.setWidth(8);
    }
    
    @Override
    public void buildLength(){
        house.setLength(14);
    }
    
    @Override
    public void buildStories(){
        house.setStories(2);
    }
    
    @Override
    public void buildRooms(){
        house.setRooms(10);
    } 
    
    @Override
    public House getHouse(){
        return house;
    }
}
