/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

/**
 *
 * @author Santiago
 */
public class User {
    
    private String fName;
    private String lName;

    @Override
    public String toString() {
        return "User account: " + account + ", password: " + pass + ", name: " + fName + ", surname: " + lName;
    }
    private String account;
    private String pass;
    
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public User(){
        
    }
    
    public User(String acc, String pwd, String name, String surname){
        this.account = acc;
        this.pass = pwd;
        this.fName = name;
        this.lName = surname;
    }
    

}
