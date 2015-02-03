/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumberconverter;

/**
 *
 * @author Santiago
 */
public enum RomanNumber {

    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    Integer value;

    Integer getValue() {
        return value;
    }

    RomanNumber(Integer value) {
        this.value = value;
    }

    public static RomanNumber getRomanValueFromChar(char i) {
        char x = Character.toUpperCase(i);
        for (RomanNumber romanNumber : RomanNumber.values()) {
            if (romanNumber.toString().charAt(0) == ((x))){
                return romanNumber;
            }
  
        }
        throw new IllegalArgumentException("the given letter doesn't match any Roman Number.");
    }

}
