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
public class Ejercicio1House {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //BUILDER PATTERN EXAMPLE USING FAMILYHOUSE
        HouseBuilder b = new FamilyHouse();
        HouseDirector d = new HouseDirector(b);
        d.constructHouse();
        House h = d.getHouse();
        System.out.println(h);
        
        //BUILDER PATTERN EXAMPLE USING APARTMENT
        HouseBuilder b2 = new Apartment();
        HouseDirector d2 = new HouseDirector(b2);
        d2.constructHouse();
        House h2 = d2.getHouse();
        System.out.println(h2);
    }
    
}
