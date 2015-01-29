/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

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

    Connection con;
    /**
     * Public constructor, gets connection from database manager class
     */
    public UserService() {
        con = DbManager.getConnection();
    }
    
    @Override
    public void uploadPhoto(User u, String photoUrl) throws SQLException {
        PreparedStatement ps = null;
        ps = con.prepareStatement("INSERT INTO Photos(userId, photoUrl, likeCount) VALUES(?, ?, ?);");
        ps.setString(1, u.getAccount());
        ps.setString(2, photoUrl);
        ps.setInt(3, 0);
        ps.execute();
    }

    @Override
    public void createUser(String acc, String pwd, String name, String surname) throws SQLException {
        PreparedStatement ps = null;
        boolean flag;
        flag = (validateAccount(acc) && validatePass(pwd));

        if (flag == true) {

            ps = con.prepareStatement("INSERT INTO Users(acc, pass, fName, lName) VALUES(?, ?, ?, ?);");

            ps.setString(1, acc);
            ps.setString(2, pwd);
            ps.setString(3, name);
            ps.setString(4, surname);
            ps.execute();
            ps.close();

        } else {
            System.out.println("Account and password must be over 6 characters and can't contain special characters");
        }

    }

    private boolean validateAccount(String acc) {
        if (acc.length() < 6) {
            return false;
        }
        return true;
    }

    @Override
    public void readUser(String acc) throws SQLException {
        PreparedStatement ps = null;
        ps = con.prepareStatement("SELECT * FROM Users WHERE Account = ?");
        ps.setString(1, acc);     
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println("Account name: " + rs.getString("Account"));
            System.out.println("Password: " + rs.getString("Password"));
            System.out.println("First name: " + rs.getString("FirstName"));
            System.out.println("Last name: " + rs.getString("LastName"));        
        }

    }

    @Override
    public void updateUser(String acc, String pwd, String name, String surname) throws SQLException {
        PreparedStatement ps = null;
        ps = con.prepareStatement("UPDATE Users SET Password = ?, FirstName = ?, LastName = ? WHERE Account = ?");

        ps.setString(1, pwd);
        ps.setString(2, name);
        ps.setString(3, surname);
        ps.setString(4, acc);
        ps.executeUpdate();
        ps.close();

    }

    @Override
    public void deleteUser(String acc) throws SQLException {
        PreparedStatement ps = null;
        ps = con.prepareStatement("DELETE FROM Users WHERE Account = ?");
        ps.setString(1, acc);
        ps.execute();
        ps.close();
    }
    
    @Override
    public void addFriend(User u, User userFriend) throws SQLException {
        if (u.getAccount().equals(userFriend.getAccount())) {
            System.out.println("Can't add yourself as a friend !");
            System.exit(0);
        } else {
            PreparedStatement ps = null;
            ps = con.prepareStatement("INSERT INTO Friends(UserId,FriendId) VALUES(?, ?);");
            
            ps.setString(1, u.getAccount());
            ps.setString(2, userFriend.getAccount());

            ps.execute();
            ps.close();
        }

    }

    @Override
    public void likePhoto(String url) throws SQLException {
        PreparedStatement ps = null;
        ps = con.prepareStatement("UPDATE Photos SET LikeCount = LikeCount+1 WHERE URL = ?");
        ps.setString(1, url);
        ps.execute();
        ps.close();
    }

    private boolean validatePass(String pwd) {
        if (pwd.length() < 6) {
            return false;
        } else {
            return true;
        }
    }

}
