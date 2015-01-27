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
    public void createUser(String acc, String pwd, String name, String surname) throws SQLException;
    
    /**
     * Return Account name + Last name + First name given an account name
     * @param acc Account name to search for in userdb 
     * @throws java.sql.SQLException 
     */
    @WebMethod
    public void readUser(String acc) throws SQLException;
    
    /**
     * Searches for the given Account in userdb and updates with given password/firstName/lastName
     * 
     * @param acc Account
     * @param pwd New password
     * @param name New first name
     * @param surname New last name
     */
    @WebMethod
    public void updateUser(String acc, String pwd, String name, String surname) throws SQLException;
    
    /**
     * Deletes account in userdb that matches given account name
     * @param acc Account to delete
     */
    @WebMethod
    public void deleteUser(String acc) throws SQLException;


}
