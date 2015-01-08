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
public interface HospitalBuilder {
    
     public void buildName();
    
     public void buildType();
            
     public void buildMaxPatients();
            
     public void buildNumberDoctors();     
    
     public Hospital getHospital();
}
