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
public class GeneralHospital implements HospitalBuilder {
    
    private Hospital hospital;
    
    public GeneralHospital(){
        hospital = new Hospital();
    }
    
    @Override
    public void buildName() {
        hospital.setName("Hospital Escuela");
    }

    @Override
    public void buildType() {
        hospital.setType("General");
    }

    @Override
    public void buildMaxPatients() {
        hospital.setMaxPatients(1000);
    }

    @Override
    public void buildNumberDoctors() {
        hospital.setNumberDoctors(200);
    }

    @Override
    public Hospital getHospital() {
        return hospital;
    }
    
}
