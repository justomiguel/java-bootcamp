/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recentfileproject;

import java.util.LinkedList;
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
     * Test of addReadFile method, of class recentFile.
     */
    @Test
    public void testAddReadFile() {
        RecentFile file1 = new RecentFile();
        System.out.println("Testing addFile method for RecentFile");
        RecentFile fileList = new RecentFile();
        fileList.addReadFile("C:/Users/Documents/aux1.txt");
        fileList.addReadFile("C:/Users/Documents/aux2.txt");
        fileList.addReadFile("C:/Users/Documents/aux3.txt");
        fileList.addReadFile("C:/Users/Documents/aux4.txt");
        fileList.addReadFile("C:/Users/Documents/aux5.txt");
        fileList.addReadFile("C:/Users/Documents/aux6.txt");
        fileList.addReadFile("C:/Users/Documents/aux7.txt");
        fileList.addReadFile("C:/Users/Documents/aux8.txt");
        fileList.addReadFile("C:/Users/Documents/aux9.txt");
        fileList.addReadFile("C:/Users/Documents/aux10.txt");
        fileList.addReadFile("C:/Users/Documents/aux11.txt");
        fileList.addReadFile("C:/Users/Documents/aux12.txt");
        fileList.addReadFile("C:/Users/Documents/aux13.txt");
        fileList.addReadFile("C:/Users/Documents/aux14.txt");
        fileList.addReadFile("C:/Users/Documents/aux9.txt");

        LinkedList<String> expResult = new LinkedList<>();
        expResult.add("C:/Users/Documents/aux9.txt");
        expResult.add("C:/Users/Documents/aux1.txt");
        expResult.add("C:/Users/Documents/aux2.txt");
        expResult.add("C:/Users/Documents/aux3.txt");
        expResult.add("C:/Users/Documents/aux4.txt");
        expResult.add("C:/Users/Documents/aux5.txt");
        expResult.add("C:/Users/Documents/aux6.txt");
        expResult.add("C:/Users/Documents/aux7.txt");
        expResult.add("C:/Users/Documents/aux8.txt");
        expResult.add("C:/Users/Documents/aux10.txt");
        expResult.add("C:/Users/Documents/aux11.txt");
        expResult.add("C:/Users/Documents/aux12.txt");
        expResult.add("C:/Users/Documents/aux13.txt");
        expResult.add("C:/Users/Documents/aux14.txt");


        assertEquals(fileList.getFileList(), expResult);
    }

    @Test
    public void testOverflow() {
        RecentFile file1 = new RecentFile();
        System.out.println("Testing addFile method for RecentFile");
        RecentFile fileList = new RecentFile();

        fileList.addReadFile("C:/Users/Documents/aux1.txt");
        fileList.addReadFile("C:/Users/Documents/aux2.txt");
        fileList.addReadFile("C:/Users/Documents/aux3.txt");
        fileList.addReadFile("C:/Users/Documents/aux4.txt");
        fileList.addReadFile("C:/Users/Documents/aux5.txt");
        fileList.addReadFile("C:/Users/Documents/aux6.txt");
        fileList.addReadFile("C:/Users/Documents/aux7.txt");
        fileList.addReadFile("C:/Users/Documents/aux8.txt");
        fileList.addReadFile("C:/Users/Documents/aux9.txt");
        fileList.addReadFile("C:/Users/Documents/aux10.txt");
        fileList.addReadFile("C:/Users/Documents/aux11.txt");
        fileList.addReadFile("C:/Users/Documents/aux12.txt");
        fileList.addReadFile("C:/Users/Documents/aux13.txt");
        fileList.addReadFile("C:/Users/Documents/aux14.txt");
        fileList.addReadFile("C:/Users/Documents/aux15.txt");
        fileList.addReadFile("C:/Users/Documents/aux20.txt");
        LinkedList<String> expResult = new LinkedList<>();

        expResult.add("C:/Users/Documents/aux1.txt");
        expResult.add("C:/Users/Documents/aux2.txt");
        expResult.add("C:/Users/Documents/aux3.txt");
        expResult.add("C:/Users/Documents/aux4.txt");
        expResult.add("C:/Users/Documents/aux5.txt");
        expResult.add("C:/Users/Documents/aux6.txt");
        expResult.add("C:/Users/Documents/aux7.txt");
        expResult.add("C:/Users/Documents/aux8.txt");
        expResult.add("C:/Users/Documents/aux9.txt");
        expResult.add("C:/Users/Documents/aux10.txt");
        expResult.add("C:/Users/Documents/aux11.txt");
        expResult.add("C:/Users/Documents/aux12.txt");
        expResult.add("C:/Users/Documents/aux13.txt");
        expResult.add("C:/Users/Documents/aux14.txt");
        expResult.add("C:/Users/Documents/aux20.txt");

        assertEquals(expResult, fileList.getFileList());
    }

}
