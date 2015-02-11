/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabootcamp.shopcart.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.Version;

/**
 *
 * @author roberta
 */
@Entity
public class ShopCart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;

    @Column()
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private final Date creationDate;

    @OneToMany(mappedBy = "cart")
    private List<ShopCartItem> cartItems;

    @Column
    private BigDecimal total;

    @Enumerated
    private PaymentType paymentType;

    public ShopCart() {
        this.creationDate = new Date();
    }

    public List<ShopCartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<ShopCartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public BigDecimal getTotal() {
        total = BigDecimal.ZERO;
        for (ShopCartItem it : getCartItems()) {
            total = total.add(it.getSubTotal());
        }
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

}
