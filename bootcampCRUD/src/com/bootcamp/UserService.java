/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import static java.lang.System.err;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.WebService;

/**
 *
 * @author Santiago
 */

/**
 * Web service endpoint interface 
 * Implements methods to Create, Read, Update and Delete and User from in-memory database with hsqldb
 */
@WebService(endpointInterface = "com.bootcamp.UserServiceInterface")
public class UserService implements UserServiceInterface {

    Connection con ;
    /**
     * Public constructor, gets connection from database manager class
     */
    public UserService(){
        con = DbManager.getConnection();
    }
    
    /**
     * Creates new User in database
     * @param acc Account
     * @param pwd Password
     * @param name First name 
     * @param surname Last name
     * @throws SQLException 
     */
    @Override 
    public User createUser(String acc, String pwd, String name, String surname) throws SQLException { 
        PreparedStatement ps = null;       
        boolean flag;     
        flag = (validateAccount(acc) && validatePass(pwd));
        
        if (flag == true){
            User u = new User(acc,pwd,name,surname);
        ps = con.prepareStatement("INSERT INTO Users(Account, Password, FirstName, LastName) VALUES(?, ?, ?, ?);");
        
        ps.setString(1, acc);
        ps.setString(2, pwd);
        ps.setString(3, name);
        ps.setString(4, surname);
        ps.execute();
        System.out.println("New user inserted");
        
        ps.close();
        return u;
        } else {
            System.out.println("Account and password must be over 6 characters and can't contain special characters");          
        }
        return null;
    }
    
    /**
     * Checks if Account length is > 6
     * @param acc Account
     * @return Returns true or false
     */
    private boolean validateAccount(String acc){
        if (acc.length() < 6){
            return false;        
        } 
       return true;      
    }
    
    /**
     * Reads user from database and prints his data
     * @param acc Account
     * @throws SQLException 
     */
    @Override
    public User readUser(String acc) throws SQLException {
        User u = new User();
        StringBuilder sb = new StringBuilder();
        PreparedStatement ps = null;
        ps = con.prepareStatement("SELECT * FROM Users WHERE Account = ?");
        ps.setString(1, acc);     
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            u.setAccount(rs.getString("Account"));
            u.setPass(rs.getString("Password"));
            u.setfName(rs.getString("FirstName"));
            u.setlName(rs.getString("LastName"));  
            return u;
        }
        ps.close();
        return null;
        
    }
    
    /**
     * Updates an User's Password,Name and/or Lastname. Account can't be changed
     * @param acc Account
     * @param pwd Password
     * @param name Name 
     * @param surname Last name
     * @throws SQLException 
     */
    @Override
    public User updateUser(String acc, String pwd, String name, String surname) throws SQLException {
        PreparedStatement ps = null;
        ps = con.prepareStatement("UPDATE Users SET Password = ?, FirstName = ?, LastName = ? WHERE Account = ?");
        User u = new User();
            ps.setString(1, pwd);
            ps.setString(2, name);
            ps.setString(3, surname);
            ps.setString(4, acc);
            ResultSet rs = ps.executeQuery(); 
            if (rs.next()){
            u.setAccount(rs.getString("Account"));
            u.setPass(rs.getString("Password"));
            u.setfName(rs.getString("FirstName"));
            u.setlName(rs.getString("LastName"));  
            return u;
        }
            ps.close();
            return null;
        }
           
    /**
     * Deletes an user given an account name
     * @param acc Account
     * @throws SQLException 
     */
    @Override
    public String deleteUser(String acc) throws SQLException {
        
        PreparedStatement ps = null;
        try{
        ps = con.prepareStatement("DELETE FROM Users WHERE Account = ?");
        ps.setString(1, acc);
        ps.execute();
        ps.close();
        return "User deleted";
        } catch(SQLException e ){
            e.printStackTrace();
            return "User not found";
        }
}
    
    //To be implemented
    /*
     public void uploadPhoto(){
     }
    
     public void addFriend(){
     }
    
     public void likePhoto(){
     }
    
    
     */
    
    
    /**
     * Checks if password length > 6
     * @param pwd Password
     * @return Returns true or false
     */
    private boolean validatePass(String pwd) {
        if (pwd.length() < 6){
            return false;  
        } else {
            return true;
        }
}


}