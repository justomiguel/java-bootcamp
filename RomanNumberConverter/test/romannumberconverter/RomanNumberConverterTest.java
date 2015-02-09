/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumberconverter;

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
public class RomanNumberConverterTest {
    
    public RomanNumberConverterTest() {
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
     * Test of convertRoman method, of class RomanNumberConverter.
     */
    @Test
    public void testConvertRoman() {
        String r = "CCXXII";
        int expResult = 222;
        int result = RomanNumberConverter.convertRoman(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of convertDecimal method, of class RomanNumberConverter.
     */
    @Test
    public void testConvertDecimal() {
        int d = 222;
        String expResult = "CCXXII";
        String result = RomanNumberConverter.convertDecimal(d);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class RomanNumberConverter.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RomanNumberConverter.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
