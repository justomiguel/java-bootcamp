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
public class HouseDirector {
    public HouseBuilder build = null;
    
    public HouseDirector(HouseBuilder build){
        this.build = build;
    }
    
    public void constructHouse(){
        build.buildLength();
        build.buildWidth();
        build.buildStories();
        build.buildRooms();
    }
    
    public House getHouse(){
        return build.getHouse();
    }
}
