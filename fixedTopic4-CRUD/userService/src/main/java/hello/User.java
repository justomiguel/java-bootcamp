/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.util.List;

/**
 *
 * @author roberta
 */
public class User {

    private String userName;
    private String email;
    private String password;
    private String realName;
    private List<User> friendslist;
  

    public User(String userName, String email, String password, String realName) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.realName = realName;
    }
    
    public User(){
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getFriendslist() {
        return friendslist;
    }

    public void setFriendslist(List<User> friendslist) {
        this.friendslist = friendslist;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + (this.email != null ? this.email.hashCode() : 0);
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
        final User other = (User) obj;
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", email=" + email + ", password=" + password + ", realName=" + realName +  '}';
    }

}
