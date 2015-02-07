
package com.bootcamp.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher implements Serializable {
    
    @Id
    @Column(name = "idteacher")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idTeacher;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "birthdate")
    private Date birthdate;

    protected Teacher(){}
    
    @Override
    public String toString() {
        return "Teacher{" + "idTeacher=" + idTeacher + ", firstName=" + firstName + ", lastName=" + lastName + ", brithDate=" + birthdate + '}';
    }

    public Long getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Long idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBrithDate() {
        return birthdate;
    }

    public void setBrithDate(Date brithDate) {
        this.birthdate = brithDate;
    }

    public Teacher(String firstName, String lastName, Date birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }
    
}
