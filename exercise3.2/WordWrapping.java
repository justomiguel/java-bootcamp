/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordwrappingproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roberta
 */
public class WordWrapping {

    public static ArrayList<String> wrapWords(String input, int lenght) {
        ArrayList<String> resulList = new ArrayList<>();
        if (input.length() <= lenght) {
            resulList.add(input);
            return resulList;
        }
        for (String s : input.split(" ")) {
            if (s.length() < lenght) {
                resulList.add(s);
            } else {
                resulList.add(s.substring(0, lenght));
            }
        }
        return resulList;
    }

    

}
