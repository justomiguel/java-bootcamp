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
public class Apartment implements HouseBuilder{
    private House house;
    
    public Apartment(){
        house = new House();
    }
    
    @Override
    public void buildWidth(){
        house.setWidth(5);
    }
    
    @Override
    public void buildLength(){
        house.setLength(10);
    }
    
    @Override
    public void buildStories(){
        house.setStories(10);
    }
    
    @Override
    public void buildRooms(){
        house.setRooms(50);
    } 
    
    @Override
    public House getHouse(){
        return house;
    }
}
