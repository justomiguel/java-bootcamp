
package com.javabootcamp.finalproject.data.jpa.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="idproduct")
    private Long idproduct;
    
    @Column(nullable=false)
    private String name;
    
    @Column(nullable=false)
    private String category;
    
    @Column(nullable=false)
    private double price;
    
    protected Product(){}
    
    public Product(String name, String category){
        this.name = name;
        this.category = category;
    }

    public Long getId() {
        return idproduct;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + idproduct + ", name=" + name + ", category=" + category + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public void setPrice(double p){
        this.price = p;
    }
    
    public double getPrice(){
        return price;
    }
}
