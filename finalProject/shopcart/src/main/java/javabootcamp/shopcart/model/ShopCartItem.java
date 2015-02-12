/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabootcamp.shopcart.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

/**
 *
 * @author roberta
 */
@Entity
public class ShopCartItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;

    @NotNull
    @Column
    private Integer quantity;

    @ManyToOne
    private Product product;

    @Column
    private BigDecimal subTotal;

    @ManyToOne()
    private ShopCart cart;

    public ShopCartItem() {
    }

    public ShopCartItem(Integer quantity, Product product, BigDecimal subTotal, ShopCart cart) {
        this.quantity = quantity;
        this.product = product;
        this.subTotal = subTotal;
        this.cart = cart;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getSubTotal() {
        if (product != null) {
            subTotal = this.product.getPrice().multiply(new BigDecimal(quantity));
            return subTotal;
        }
        return BigDecimal.ZERO;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public ShopCart getCart() {
        return cart;
    }

    public void setCart(ShopCart cart) {
        this.cart = cart;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ShopCartItem other = (ShopCartItem) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
