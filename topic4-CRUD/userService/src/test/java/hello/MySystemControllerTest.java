/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roberta
 */
public class MySystemControllerTest {

    private User jhon = new User("john", "jhon@gmail.com", "1234", "John Smith");
    private User mike = new User("mike", "mike@gmail.com", "1234", "Mike Gonzalez");
    private User linus = new User("linus", "linus@gmail.com", "1234", "Linus Torval");
    private User charles = new User("charles", "charles@gmail.com", "45687", "Charles Xavier");
    private MySystemController instance = MySystemController.getInstance();

    public MySystemControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class MySystemController.
     */
    @org.junit.Test
    public void testGetInstance() {
        System.out.println("getInstance");
        MySystemController result = MySystemController.getInstance();
        assertNotNull(result);

    }

    /**
     * Test of createUser method, of class MySystemController.
     */
    @org.junit.Test
    public void testCreateUser() throws Exception {
        System.out.println("createUser");
        User user1 = new User("user1", "user1@hola.com", "1234", "Ana Lopez");
        String userName = "user1";
        String email = "user1@hola.com";
        String password = "1234";
        String realName = "Ana Perez";
        MySystemController instance = MySystemController.getInstance();
        instance.createUser(userName, email, password, realName);
        List<User> result = instance.readUser("user1");
        List<User> expected = new ArrayList<User>();
        expected.add(user1);
        assertEquals(expected, result);
    }

    /**
     * Test of deleteUser method, of class MySystemController.
     */
    @org.junit.Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        try {
            instance.createUser(mike.getUserName(), mike.getEmail(), mike.getPassword(), mike.getRealName());
        } catch (UserAlreadyExistsException ex) {
            Logger.getLogger(MySystemControllerTest.class.getName()).log(Level.SEVERE, null, ex);
            fail();
        }
        instance.deleteUser(mike.getEmail());
        assertNull(instance.retrieveUser(mike.getEmail()));
    }

    /**
     * Test of updateUser method, of class MySystemController.
     */
    @org.junit.Test
    public void testUpdateUser() {
        try {
            instance.createUser(mike.getUserName(), mike.getEmail(), mike.getPassword(), mike.getRealName());
        } catch (UserAlreadyExistsException ex) {
            Logger.getLogger(MySystemControllerTest.class.getName()).log(Level.SEVERE, null, ex);
            fail();
        }
        instance.updateUser("mike1", mike.getPassword(), mike.getEmail(), mike.getRealName());
        User retrieveUser = instance.retrieveUser(mike.getEmail());
        assertEquals("mike1", retrieveUser.getUserName());
    }

}
