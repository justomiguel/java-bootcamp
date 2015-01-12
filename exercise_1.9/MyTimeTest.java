/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mytimeproject;

/**
 *
 * @author roberta
 */
public class MyTimeTest {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println(time.nextSecond());
        System.out.println(time.previousSecond());
        
        MyTime time1 = new MyTime(99, 10, 59); // Exception : Invalid Hour
        System.out.println(time1);
        
        
        
    }
    
}
