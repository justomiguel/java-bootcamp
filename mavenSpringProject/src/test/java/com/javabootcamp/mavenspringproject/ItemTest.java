/*
 * Copyright 2015 Santiago.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.javabootcamp.mavenspringproject;

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
public class ItemTest {
    
    public ItemTest() {
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
     * Test of toString method, of class Item.
     */
    @Test
    public void testToString() {
        Item instance = new Item();
        instance.setName("item1");
        instance.setPrice(5.0);
        String expResult = "* Item:item1 ........ $5.0";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of getName method, of class Item.
     */
    @Test
    public void testGetName() {      
        Item instance = new Item();
        String expResult = "itemName";
        instance.setName("itemName");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class Item.
     */
    @Test
    public void testGetPrice() {
        Item instance = new Item();
        double expResult = 10.70;
        instance.setPrice(10.7);
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
    }


}
