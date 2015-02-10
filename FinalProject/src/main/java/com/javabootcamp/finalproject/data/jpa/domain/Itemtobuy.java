
package com.javabootcamp.finalproject.data.jpa.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import org.hibernate.annotations.NaturalId;

@Entity
public class Itemtobuy implements Serializable {
    
    @Id
    @GeneratedValue
    private Long iditem;
    
    @NaturalId
    @PrimaryKeyJoinColumn(referencedColumnName = "idshoppingcart")
    private Long idcart;
    
    @NaturalId
    @PrimaryKeyJoinColumn(referencedColumnName = "idproduct")
    private Long idprod;
    
    @Column(nullable = false)
    private int quantity;
    
    protected Itemtobuy(){}
    
    public Itemtobuy (Long idcart, Long idprod, int quantity){
        this.idcart = idcart;
        this.idprod = idprod;
        this.quantity = quantity;
    }

    public Long getIdcart() {
        return idcart;
    }

    public void setIdcart(Long ids) {
        this.idcart = ids;
    }

    public Long getIdprod() {
        return idprod;
    }

    public void setIdprod(Long idprod) {
        this.idprod = idprod;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
