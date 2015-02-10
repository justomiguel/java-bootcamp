
package com.javabootcamp.finalproject.data.jpa.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column( name = "iduser")
    private Long iduser;
    
    @Column(nullable = false)
    private String username;
    
    @Column(nullable = false)
    private String password;
      
    protected User(){}
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + ", username=" + username + ", password=" + password + ", administrator=" +'}';
    }

    public Long getId() {
        return iduser;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}
