/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordwrap;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Santiago
 */
public class WordWrapTest {
    
    public WordWrapTest() {
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
     * Test of main method, of class WordWrap.
     */
    @Test
    public void testWrapWords() {
        System.out.println("Wrap word test");
        String s = "a b c d e f";
        ArrayList<String> expResult = new ArrayList<String>();
        expResult.add("a b ");
        expResult.add("c d ");
        expResult.add("e f ");
        WordWrap result = new WordWrap();
        result.wrapWords(s, 3);
        assertEquals(expResult, result.getResult());
        
    }
    
}
