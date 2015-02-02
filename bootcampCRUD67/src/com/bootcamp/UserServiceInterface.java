/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import java.sql.SQLException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author Santiago
 */

//Service Endpoint interface

@WebService
@SOAPBinding(style = Style.DOCUMENT)

public interface UserServiceInterface {
    
    /**
     * Creates a new User and saves it to in-memory database userdb
     * @param acc Account name
     * @param pwd Account password
     * @param name First name
     * @param surname Last name
     */
    
    @WebMethod
    public User createUser(@WebParam(name = "Account") String acc, @WebParam(name = "Password") String pwd, @WebParam(name = "Name") String name, @WebParam(name = "Surname") String surname) throws SQLException;
    
    /**
     * Return Account name + Last name + First name given an account name
     * @param acc Account name to search for in userdb 
     * @throws java.sql.SQLException 
     *  @return String with user information
     */ 
    @WebMethod
    public User readUser(@WebParam(name = "Account") String acc) throws SQLException;
    
    /**
     * Searches for the given Account in userdb and updates with given password/firstName/lastName
     * 
     * @param acc Account
     * @param pwd New password
     * @param name New first name
     * @param surname New last name
     */
    @WebMethod
    public User updateUser(@WebParam(name = "Account") String acc, @WebParam(name = "Password") String pwd, @WebParam(name = "Name") String name, @WebParam(name = "Surname") String surname) throws SQLException;
    
    /**
     * Deletes account in userdb that matches given account name
     * @param acc Account to delete
     */
    @WebMethod
    public String deleteUser(@WebParam(name = "Account") String acc) throws SQLException;
    
    @WebMethod
    public Photo uploadPhoto(@WebParam(name = "Account") String acc, @WebParam(name="photoURL") String photoUrl) throws SQLException;
    
    /**
     * Updates table Friends, adds userFriend as friend of User
     * @param acc User's account
     * @param friendAcc User's new friend
     * @throws SQLException 
     */
    @WebMethod
    public String addFriend(@WebParam(name = "Account") String acc, @WebParam(name = "FriendAccount") String friendAcc) throws SQLException;
    
    /**
     * Increases like count of table Photos with the given photo URL
     * @param url Photo url
     * @throws SQLException 
     */
    @WebMethod
    public Photo likePhoto(@WebParam(name="photoURL") String url) throws SQLException;
}
