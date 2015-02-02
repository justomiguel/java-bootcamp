/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javabootcamp.high.school;

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
public class HighSchoolAccessTest {
    
    public HighSchoolAccessTest() {
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
     * Test of printStudentsByCourse method, of class HighSchoolAccess.
     */
    @Test
    public void testPrintStudentsByCourse() {
        System.out.println("printStudentsByCourse");
        int courseId = 2;
        HighSchoolAccess instance = new HighSchoolAccess();
        instance.printStudentsByCourse(courseId);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
