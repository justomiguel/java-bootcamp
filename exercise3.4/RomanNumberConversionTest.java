/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package romannumberconversion;

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
public class RomanNumberConversionTest {
    
    public RomanNumberConversionTest() {
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
     * Test of decToRoman method, of class RomanNumberConversion.
     */
    @Test
    public void testDecToRoman() {
        System.out.println("decToRoman");
        int dec = 5;
        String expResult = "V";
        String result = RomanNumberConversion.decToRoman(dec);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toArabic method, of class RomanNumberConversion.
     */
    @Test
    public void testToArabic() {
        System.out.println("toArabic");
        String s = "XXI";
        RomanNumberConversion instance = new RomanNumberConversion();
        String expResult = "21";
        String result = instance.romanToDec(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
