/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp;

/**
 *
 * @author Santiago
 */
public class Photo {
      
    private String UserAccount;
    private String URL;
    private int likeCount;

    @Override
    public String toString() {
        return "Photo{" + "UserAccount: " + UserAccount + ", Photo URL: " + URL + ", likeCount: " + likeCount + '}';
    }
    
    public Photo(){}

    public Photo(String UserAccount, String URL, int likeCount) {
        this.UserAccount = UserAccount;
        this.URL = URL;
        this.likeCount = likeCount;
    }
    

    public String getUserAccount() {
        return UserAccount;
    }

    public void setUserAccount(String UserAccount) {
        this.UserAccount = UserAccount;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
    
}
