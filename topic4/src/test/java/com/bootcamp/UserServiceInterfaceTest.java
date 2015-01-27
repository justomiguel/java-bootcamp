/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

import java.sql.Connection;
import java.sql.SQLException;
import junit.framework.TestCase;

/**
 *
 * @author Santiago
 */
public class UserServiceInterfaceTest extends TestCase {
    
    public UserServiceInterfaceTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of createUser method, of class UserServiceInterface.
     */
    public void testCreateUser() throws Exception {
        Connection con;
        con = DbManager.getConnection();
       
        System.out.println("createUser");
        String acc = "santi0011";
        String pwd = "contraseña";
        String name = "santiago";
        String surname = "schumacher";
        UserService instance = new UserService();
        instance.createUser(acc, pwd, name, surname);
        instance.createUser("otro", "crt", "nom", "ape");
        instance.readUser("santi001");
    }

    /**
     * Test of readUser method, of class UserServiceInterface.
     */
    public void testReadUser() throws Exception {
        System.out.println("readUser");
        String acc = "";
        UserServiceInterface instance = new UserServiceInterfaceImpl();
        instance.readUser(acc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class UserServiceInterface.
     */
    public void testUpdateUser() throws Exception {
        System.out.println("updateUser");
        String acc = "";
        String pwd = "";
        String name = "";
        String surname = "";
        UserServiceInterface instance = new UserServiceInterfaceImpl();
        instance.updateUser(acc, pwd, name, surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class UserServiceInterface.
     */
    public void testDeleteUser() throws Exception {
        System.out.println("deleteUser");
        String acc = "";
        UserServiceInterface instance = new UserServiceInterfaceImpl();
        instance.deleteUser(acc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UserServiceInterfaceImpl implements UserServiceInterface {

        public void createUser(String acc, String pwd, String name, String surname) throws SQLException {
        }

        public void readUser(String acc) throws SQLException {
        }

        public void updateUser(String acc, String pwd, String name, String surname) throws SQLException {
        }

        public void deleteUser(String acc) throws SQLException {
        }
    }
    
}
