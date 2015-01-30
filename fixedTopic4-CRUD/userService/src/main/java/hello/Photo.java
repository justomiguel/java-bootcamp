/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;
import java.util.Date;

/**
 *
 * @author roberta
 */
public class Photo {

    private String link;
    private int likes;
    private Date uploadDate;
    private User user;
    
    public Photo(String link,int likes, Date uploadDate, User user){
        this.link = link;
        this.likes = likes;
        this.uploadDate = uploadDate;
        this.user = user;
        
        
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (this.link != null ? this.link.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Photo other = (Photo) obj;
        if ((this.link == null) ? (other.link != null) : !this.link.equals(other.link)) {
            return false;
        }
        return true;
    }
    
}
