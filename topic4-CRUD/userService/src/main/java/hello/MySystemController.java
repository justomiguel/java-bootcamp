/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roberta
 */
public class MySystemController {

    private List<User> userList = new ArrayList<User>();
    private static MySystemController system;

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

}
