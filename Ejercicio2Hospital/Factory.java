/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2hospital;

/**
 *
 * @author Santiago
 */
public class Factory {
    
    public Building getBuilding(String type){
        if (type == null){
            return null;
        }
        switch (type) {
            case "healthcare" : 
                return new Hospital(); 
              //  break;  
            case "commercial" : 
                return new Hotel(); 
              //  break;
            default: return null;
            
    }
}
}