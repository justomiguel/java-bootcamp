/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordwrappingproject;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author roberta
 */
public class WordWrappingTest {

    public WordWrappingTest() {
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
     * Test of wrapWords method, of class WordWrapping.
     */
    @Test
    public void testWrapWords() {
        System.out.println("wrapWords");
        String input = "Hola Mundo!";
        int lenght = 7;

        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Hola");
        expResult.add("Mundo!");
        ArrayList<String> result = WordWrapping.wrapWords(input, lenght);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
