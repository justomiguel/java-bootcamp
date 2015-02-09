
package com.bootcamp.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Notes implements Serializable {
    
    @Id
    @PrimaryKeyJoinColumn(referencedColumnName = "idStudent")
    private Long idStudent;
    
    @Id
    @PrimaryKeyJoinColumn(referencedColumnName = "idCourse")
    private Long idCourse;
    
    @Column
    private double note1;
    
    @Column
    private double note2;
    
    @Column
    private double note3;
    
    @Column
    private double finalNote;
    
    protected Notes(){}
}
