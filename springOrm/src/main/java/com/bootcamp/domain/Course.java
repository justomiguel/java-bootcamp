
package com.bootcamp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course implements Serializable {
    
    @Id
    @Column(name = "idcourse")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idCourse;
    @Column(name = "idteacher")
    private int idTeacher;
    @Column(name = "hoursperweek")
    private int hoursPerWeek;
    @Column(name = "schedule")
    private String schedule;
    @Column(name = "coursename")
    private String courseName;
    
    protected Course(){}
    
    @Override
    public String toString() {
        return "Course{" + "idCourse=" + idCourse + ", idTeacher=" + idTeacher + ", hoursPerWeek=" + hoursPerWeek + ", schedule=" + schedule + ", courseName=" + courseName + '}';
    }

    public Long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Course(int idTeacher, int hoursPerWeek, String schedule, String coursename) {
        this.idTeacher = idTeacher;
        this.hoursPerWeek = hoursPerWeek;
        this.schedule = schedule;
        this.courseName = coursename;
    }
    
}
