/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

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
public class AmountToTextTest {
    
    public AmountToTextTest() {
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
     * Test of convert method, of class AmountToText.
     */
    @Test
    public void testConvert() {
        System.out.println("convert");
        double number = 150.15;
        String expResult = " one hundred fifty and  fifteen cents";
        String result = AmountToText.convert(number);
        assertEquals(expResult, result);

    }

    
    @Test
    public void testPass() {
        System.out.println("Pass");
        AmountToText am = new AmountToText(10);
        assertEquals(" ten and zero cents", am.getText());
    }
    
}
