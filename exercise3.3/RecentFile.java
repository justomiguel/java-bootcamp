/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recentfileproject;

import java.util.LinkedList;

//import java.util.ArrayList;
//import java.util.List;
/**
 *
 * @author roberta
 */
public class RecentFile {

    LinkedList fileList = new LinkedList();
    private int maxItem = 15;

    public void addReadFile(String file) {

        if (fileList.size() >= maxItem) {
            fileList.removeLast();
            fileList.add(file);
        } else {

            if (fileList.contains(file)) {
                int index = fileList.indexOf(file);
                fileList.remove(file);
                fileList.addFirst(file);

            } else {

                fileList.add(file);
            }

        }
    }

    public LinkedList getFileList() {
        return fileList;
    }

}
