/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recentfile;

import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class RecentFile {
    
    ArrayList<String> recent = new ArrayList<String>();
    private int maxFiles = 15;
    private int currentFiles;
    
    public RecentFile(){
        this.currentFiles = 0;
    }
   
    public RecentFile(int maxLength){
       this.maxFiles = maxLength; 
    }
    public void addFile(String url){
        if (recent.contains(url)){
            recent.remove(url);
            currentFiles -= 1;
        }
        
        
        recent.add(0,url);
        if (recent.size() > maxFiles){
            recent.remove(recent.size() -1);
            currentFiles -= 1;
        }
       
        currentFiles += 1;
    }
    
    
    public ArrayList<String> getRecent(){
        return recent;
    }
    
    public int getCurrentFiles(){      
        return currentFiles;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RecentFile file = new RecentFile();
        
        file.addFile("url1.txt");
        file.addFile("url2.txt");
        file.addFile("url3.txt");
        file.addFile("url4.txt");
        file.addFile("url5.txt");
        file.addFile("url6.txt");
        file.addFile("url7.txt");
        file.addFile("url8.txt");
        file.addFile("url9.txt");
        file.addFile("url10.txt");
        file.addFile("url11.txt");
        file.addFile("url12.txt");
        file.addFile("url13.txt");
        file.addFile("url14.txt");
        file.addFile("url15.txt");
        file.addFile("url16.txt");
        file.addFile("url4.txt");
        System.out.println(file.getRecent());
        System.out.println(file.getCurrentFiles());
    }
    
}
