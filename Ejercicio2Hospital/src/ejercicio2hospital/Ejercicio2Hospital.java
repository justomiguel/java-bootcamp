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
public class Ejercicio2Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //FACTORY EXAMPLES
        Factory f = new Factory();
        
        //HOSPITAL
        Building b = f.getBuilding("other");
        System.out.println(b.buildingType());
        
        //HOTEL
        Building b2 = f.getBuilding("commercial");
        System.out.println(b2.buildingType());
        
        //BUILDER PATTERN
        HospitalBuilder hb = new GeneralHospital();
        HospitalDirector hd = new HospitalDirector(hb);
        hd.constructHospital();
        Hospital hospital = hd.getHospital();
        System.out.println(hospital);
        
    }
    
}
