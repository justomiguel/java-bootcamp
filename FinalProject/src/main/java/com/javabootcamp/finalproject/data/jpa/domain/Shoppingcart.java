
package com.javabootcamp.finalproject.data.jpa.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
public class Shoppingcart implements Serializable {
    
    @Id
    @PrimaryKeyJoinColumn(referencedColumnName = "iduser")
    private Long idshoppingcart;
    
    @Column(nullable = false)
    private double total;
    
    protected Shoppingcart(){}
    
    public Shoppingcart(Long id, double total){
        this.idshoppingcart = id;
        this.total = total;
    }

    public Long getUserid() {
        return idshoppingcart;
    }

    public void setUserid(Long userid) {
        this.idshoppingcart = userid;
    }


    public double getTotal() {
        return total;
    }

    public void setTotal(double num) {
        this.total = num;
    }
    
    
}
