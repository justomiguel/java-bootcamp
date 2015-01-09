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
public class HospitalDirector {
    public HospitalBuilder build = null;
    
    public HospitalDirector(HospitalBuilder build){
        this.build = build;
    }
    
    public void constructHospital(){
        build.buildName();
        build.buildType();
        build.buildMaxPatients();
        build.buildNumberDoctors();
    }
    
    public Hospital getHospital(){
        return build.getHospital();
    }
}
