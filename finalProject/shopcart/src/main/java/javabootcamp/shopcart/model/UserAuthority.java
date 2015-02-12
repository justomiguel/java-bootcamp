/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabootcamp.shopcart.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author roberta
 */
@Entity
@Table(name = "authorities")
public class UserAuthority implements Serializable {

    @JoinColumn(name = "username", referencedColumnName = "username",columnDefinition = "varchar(50)")
    @Size(max = 50)
    @Id
    @ManyToOne
    private ShopUser username;

    @Column
    @Id
    @Size(max = 50)
    private String authority;

    public UserAuthority() {
    }

    public ShopUser getUsername() {
        return username;
    }

    public void setUsername(ShopUser username) {
        this.username = username;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.username);
        hash = 43 * hash + Objects.hashCode(this.authority);
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
        final UserAuthority other = (UserAuthority) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.authority, other.authority)) {
            return false;
        }
        return true;
    }

}
