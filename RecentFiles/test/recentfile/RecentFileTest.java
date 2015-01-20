/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recentfile;

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
public class RecentFileTest {
    
    public RecentFileTest() {
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
     * Test of addFile method, of class RecentFile.
     */
    @Test
    public void testAddFile() {
        System.out.println("Testing addFile method for RecentFile");
        String url = "file1.txt";
        RecentFile instance = new RecentFile();
        instance.addFile(url);
        instance.addFile("file2.doc");
        instance.addFile("file1.txt");
        ArrayList<String> expResult = instance.getRecent();
        ArrayList<String> result = new ArrayList<String>();
        result.add("file1.txt");
        result.add("file2.doc");
        
        assertEquals(result, expResult);
    }

    
}
