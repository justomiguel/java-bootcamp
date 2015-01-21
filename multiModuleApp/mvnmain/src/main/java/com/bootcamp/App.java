package com.bootcamp;

import bootcampmv.mvnApp.FactorialApp;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(callFactorial(6));
    }
    
    public static int callFactorial(int x){
        FactorialApp fact = new FactorialApp();
        x = fact.calculateFactorial(x);
        return x;       
    }
}
