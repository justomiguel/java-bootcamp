/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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

    /**
     * Test of addFriend method, of class MyFriendSystem.
     *
     *
     * @throws hello.FriendException
     */
    @Test(expected = FriendException.class)
    public void testAddNotRegisteredFriend() throws FriendException {
        //See if I get the expcetion for not being registered
        instance.addFriend(charles, linus);
    }

    /**
     * Test of addFriend method, of class MyFriendSystem.
     *
     */
    @Test()
    public void testAddRegisteredFriends() {
        try {

            instance.createUser(linus.getUserName(), linus.getEmail(), linus.getPassword(), linus.getRealName());
            instance.addFriend(mike, linus);
            List<User> expResult1 = new ArrayList<User>();
            List<User> expResult2 = new ArrayList<User>();
            expResult1.add(mike);
            expResult2.add(linus);
            assertEquals(expResult1, instance.retrieveFriendList(linus));
            assertEquals(expResult2, instance.retrieveFriendList(mike));
        } catch (UserAlreadyExistsException ex) {
            Logger.getLogger(MySystemControllerTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("This was not good...");

        } catch (FriendException ex) {
            Logger.getLogger(MySystemControllerTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("This was not good...");

        }
    }

    /**
     * Test of unFriend method, of class MyFriendSystem.
     *
     */
    @Test
    public void testUnFriend() {
        try {

            instance.addFriend(mike, linus);
            instance.unFriend(mike, linus);
            List<User> expResult = new ArrayList<User>();

            assertEquals(expResult, instance.retrieveFriendList(charles));
            System.out.println("Charles is no longer linus' friend :(");

        } catch (FriendException ex) {
            Logger.getLogger(MySystemControllerTest.class.getName()).log(Level.SEVERE, null, ex);
            fail(ex.getMessage());
        }

    }

    /**
     * Test of likePhoto method, of class MyFriendSystem.
     *
     */
    @Test
    public void testlikePhoto() {
        instance.addPhoto("link to photo", mike);
        instance.likePhoto("link to photo");
        Photo retrievePhoto = instance.retrievePhoto("link to photo");
        assertEquals(1,retrievePhoto.getLikes());
    }
    
    /**
     * Test of likePhoto method, of class MyFriendSystem.
     *
     */
    @Test
    public void testunlikePhoto() {
//        instance.addPhoto("link to photo", mike);
        instance.unlikePhoto("link to photo");
        Photo retrievePhoto = instance.retrievePhoto("link to photo");
        assertEquals(0,retrievePhoto.getLikes());
    }
    
    }
