
package com.javabootcamp.finalproject.data.jpa.service;

import com.javabootcamp.finalproject.data.jpa.domain.User;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {
    /**
     * Creates a new user and assigns a shopping cart
     * @param username Username. Must be at least 6 characters
     * @param password Password. Must be at least 6 characters
     * @return Returns User object
     */
    @Transactional
    User createUser(String username, String password);
    /**
     * Deletes user with the given username
     * @param username
     * @param password
     * @return 
     */
    String deleteUser(String username, String password);
    /**
     * Creates a Shopping cart. This method is called when creating a new user
     * @param u 
     */
    @Transactional
    void createCart(User u);
    /**
     * Returns Id given an username
     * @param username
     * @return 
     */
    Long getIdByUsername(String username);
}
