/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author roberta
 */
public class MySystemController {

    private List<User> userList = new ArrayList<User>();
    private static MySystemController system;
    private List<Photo> photoList = new ArrayList<Photo>();

    public static MySystemController getInstance() {
        if (system == null) {
            system = new MySystemController();

        }
        return system;
    }

    private MySystemController() {
    }

    /**
     * Creates a new user,if the user already exists displays an exception
     *
     * @param userName
     * @param email
     * @param password
     * @param realName
     * @throws UserAlreadyExistsException
     */
    public void createUser(String userName, String email, String password, String realName) throws UserAlreadyExistsException {

        User user = new User(userName, email, password, realName);
        if (!userList.contains(user)) {
            userList.add(user);
        } else {
            throw new UserAlreadyExistsException("User already exists!");
        }
    }

    /**
     * Eliminate a user if exists and matches with the email inserted
     *
     * @param email
     *
     */
    public void deleteUser(String email) {
        Integer indexOf = null;
        for (User u : userList) {
            if (u.getEmail().equals(email)) {
                indexOf = userList.indexOf(u);
                break;
            }
        }
        if (indexOf != null) {
            userList.remove(userList.get(indexOf));
        }
    }

    /**
     * Search the user by userName and return a list with the values.
     *
     * @param userName
     * @return
     */
    public List<User> readUser(String userName) {
        List<User> resultList = new ArrayList<User>();
        for (User u : userList) {
            if (u.getUserName().contains(userName)) {
                resultList.add(u);
            }
        }
        return resultList;

    }

    /**
     * Find a user by mail
     *
     * @param mail
     * @return
     */
    public User retrieveUser(String mail) {

        for (User u : userList) {
            if (u.getEmail().equals(mail)) {
                return u;
            }
        }
        return null;
    }

    /**
     * Search for the email, and update userName | password | realName
     *
     * @param userName
     * @param password
     * @param email
     * @param realName
     */
    public void updateUser(String userName, String password, String email, String realName) {

        for (User u : userList) {
            if (u.getEmail().equals(email)) {
                u.setPassword(password);
                u.setRealName(realName);
                u.setUserName(userName);
                break;
            }
        }
    }

    public void addPhoto(String link, User user) {
        Photo photo = new Photo(link, 0, new Date(), user);
        photoList.add(photo);
    }

    public void deletePhoto(String link) {
        Integer indexOf = null;
        for (Photo u : photoList) {
            if (u.getLink().equals(link)) {
                indexOf = photoList.indexOf(u);
                break;
            }
        }
        if (indexOf != null) {
            photoList.remove(photoList.get(indexOf));
        }
    }

    /**
     * Adds person p2 as friend of person p1. Throws friend exception when
     * addign friend to yourself or adding a repeated friend.
     *
     * @param p1
     * @param p2
     * @throws FriendException
     */
    public void addFriend(User p1, User p2) throws FriendException {
        if (!(userList.contains(p1) && userList.contains(p2))) {
            throw new FriendException("You have to be registered to do that!");
        }
        if (p1.equals(p2)) {
            throw new FriendException("You can't be friend of yourself!");
        }
        if (p1.getFriendslist() == null) {
            p1.setFriendslist(new ArrayList<User>());
        }
        if (p2.getFriendslist() == null) {
            p2.setFriendslist(new ArrayList<User>());
        }
        if (p1.getFriendslist().contains(p2)) {
            throw new FriendException("You are friend of that person already.");
        }

        p1.getFriendslist().add(p2);
        p2.getFriendslist().add(p1);
    }

    /**
     * Removes person p2 as friend of person p1. Throws friend exception when
     * addign friend to yourself or adding a repeated friend.
     *
     * @param p1
     * @param p2
     * @throws hello.FriendException
     */
    public void unFriend(User p1, User p2) throws FriendException {
        if (!(userList.contains(p1) && userList.contains(p2))) {
            throw new FriendException("You have to be registered to do that!");
        }

        if (p1.getFriendslist() == null) {
            p1.setFriendslist(new ArrayList<User>());
        }
        if (p2.getFriendslist() == null) {
            p2.setFriendslist(new ArrayList<User>());
        }
        if (!p1.getFriendslist().contains(p2)) {
            throw new FriendException("Person 1 is not friend of person 2!");
        }

        p1.getFriendslist().remove(p2);
        p2.getFriendslist().remove(p1);
    }

    /**
     * Returns the list of friends for person p
     *
     * @param p
     * @return
     */
    public List<User> retrieveFriendList(User p) {
        return p.getFriendslist() == null ? new ArrayList<User>() : p.getFriendslist();
    }

    public void likePhoto(String link) {

        for (Photo p : photoList) {
            if ((p.getLink().equals(link))) {
                p.setLikes(p.getLikes() + 1);
                break;
            }
        }
    }

    public void unlikePhoto(String link) {

        for (Photo p : photoList) {
            if ((p.getLink().equals(link))) {
                p.setLikes(p.getLikes() - 1);
                break;
            }
        }
    }

    public Photo retrievePhoto(String link) {
        for (Photo p : photoList) {
            if (p.getLink().equals(link)) {
                return p;
            }
        }
        return null;
    }

}
