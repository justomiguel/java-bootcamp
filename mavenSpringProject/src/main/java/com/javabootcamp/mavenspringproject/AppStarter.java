package com.javabootcamp.mavenspringproject;

import javax.annotation.Nonnull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@Nonnull
public class AppStarter {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(AppStarter.class);

    public static void main(String[] args) {
        LOGGER.info("Starting up...");
         BeanFactory factory =new XmlBeanFactory(new FileSystemResource("Beans.xml"));
        LOGGER.info("Spring context initialized.");
        ShoppingCart shop = (ShoppingCart) factory.getBean("shoppingCart");
              
        Item item = (Item) factory.getBean("item");

        Item item2 = (Item) factory.getBean("item2");

        Item item3 = (Item) factory.getBean("item3");
        
        shop.addToCart(item, 3);
        shop.addToCart(item2, 5);
        shop.addToCart(item3, 2);
        
        System.out.println(item2.getName());
        System.out.println(item2.getPrice());
        
        System.out.println(shop.checkoutCart());
        
        }
    }
