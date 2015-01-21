/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordwrap;

import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class WordWrap {

    public WordWrap() {
    }

    private ArrayList<String> result = new ArrayList<String>();

    /**
     * @param args the command line arguments
     */

    public ArrayList<String> wrapWords(String input, int length) {
        if (input.length() < length) {
            result.add(input);
            return result;
        }
        StringBuilder auxs = new StringBuilder();
        String[] list = input.split(" ");

        if (list.length == 1) {

            String auxstring = list[0];
            int a = list[0].length() / length;
            for (int i = 0; i < list[0].length(); i += length) {
                result.add(auxstring.substring(i, Math.min(auxstring.length(), i + length)));
            }
            return result;
        } else {

            for (int i = 0; i < list.length; i++) {
                auxs.append(list[i] + " ");
                if (auxs.length() + list[i].length() > length) {

                    int lastindex = auxs.lastIndexOf(" ");

                    if (lastindex < auxs.length()) {
                        auxs.subSequence(lastindex, auxs.length() - 1);
                        System.out.println(auxs.toString());
                        result.add(auxs.toString());
                        auxs = new StringBuilder();
                    }
                }
            }
            return result;
        }
    }

    public ArrayList<String> getResult() {
        return result;
    }

    
    public static void main(String[] args) {

        WordWrap ww = new WordWrap();
        System.out.println(ww.wrapWords("Excelent", 5));
    }
}
