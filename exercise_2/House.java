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
public class House {
    private int bedroomQuantity;
    private int bathroomQuantity;
    private int floorQuantity;
    
    
    
    public House(int bedroomQuantity, int bathroomQuantity, int floorQuantity){
        this.bathroomQuantity = bathroomQuantity;
        this.bedroomQuantity = bedroomQuantity;
        this.floorQuantity = floorQuantity;      
    }
    
    public  House(){
    }

    public int getBedroomQuantity() {
        return bedroomQuantity;
    }

    public int getBathroomQuantity() {
        return bathroomQuantity;
    }

    public int getFloorQuantity() {
        return floorQuantity;
    }

    public void setBedroomQuantity(int bedroomQuantity) {
        this.bedroomQuantity = bedroomQuantity;
    }

    public void setBathroomQuantity(int bathroomQuantity) {
        this.bathroomQuantity = bathroomQuantity;
    }

    public void setFloorQuantity(int floorQuantity) {
        this.floorQuantity = floorQuantity;
    }
    
    @Override
    public String toString(){
        return "Bathroom Quantity:" + bathroomQuantity + "bedroom Quantity:"+ bedroomQuantity + "Floor Quantity:" + floorQuantity;   
    }
    
    
    
}
