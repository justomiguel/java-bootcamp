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
        Scanner s = new Scanner(System.in);
        int f;
        System.out.println( "Insert number to calculate factorial: " );
        f = Integer.parseInt(s.next());
        FactorialApp fact = new FactorialApp();
        System.out.println(fact.calculateFactorial(f));
    }
}
