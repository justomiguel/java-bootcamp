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
public class ShoppingCartTest {
    
    public ShoppingCartTest() {
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
     * Test of addToCart method, of class ShoppingCart.
     */
    @Test
    public void testAddToCart() {
        Item i = new Item("milk", 2.0);
        int quantity = 3;
        ShoppingCart instance = new ShoppingCart();
        instance.addToCart(i, quantity);
        instance.addToCart(i, quantity);
        instance.addToCart(i, quantity);
        int itemsInCartCount = instance.itemCount;
        assertEquals(3,itemsInCartCount );
    }

    /**
     * Test of removeFromCart method, of class ShoppingCart.
     */
    @Test
    public void testRemoveFromCart() {
        Item i = new Item("milk", 2.0);
        int quantity = 3;
        ShoppingCart instance = new ShoppingCart();
        instance.addToCart(i, quantity);
        instance.removeFromCart(i);
        int itemsInCartCount = instance.getItemCount();
        assertEquals(0, itemsInCartCount);
    }

    /**
     * Test of getTotal method, of class ShoppingCart.
     */
    @Test
    public void testGetTotal() {
        Item i = new Item("milk", 2.0);
        int quantity = 3;
        ShoppingCart instance = new ShoppingCart();
        instance.addToCart(i, quantity);
        double expResult = 6.0;
        double result = instance.total;
        assertEquals(expResult, result,0.01);
    }

    /**
     * Test of clearCart method, of class ShoppingCart.
     */
    @Test
    public void testClearCart() {     
        Item i = new Item("milk", 2.0);
        int quantity = 3;
        ShoppingCart instance = new ShoppingCart();
        instance.addToCart(i, quantity);
        instance.clearCart();
        int result = instance.getItemCount();
        assertEquals(0,result );
    }
    
}
