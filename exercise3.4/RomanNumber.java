/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumberconversion;

/**
 *
 * @author roberta
 */
public enum RomanNumber {

    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private final int value;

    RomanNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    /**
     * Devuelve el valor numérico de la letra romana
     *
     * @param l
     * @return
     */
    public static int parse(String l) {
        for (RomanNumber r : RomanNumber.values()) {
            if (r.toString().equals(l)) {
                return r.value;
            }
        }

        throw new IllegalArgumentException("Not a romand symbol!");

    }
}
