
package com.javabootcamp.finalproject.data.jpa.service;

import com.javabootcamp.finalproject.data.jpa.domain.Shoppingcart;
import com.javabootcamp.finalproject.data.jpa.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    
    private final UserRepository userrepository;
    private final ShoppingCartRepository shoppingRepository;
    
    @Autowired
    public UserServiceImpl(UserRepository userrepository, ShoppingCartRepository shoppingRepository) {
        this.userrepository = userrepository;
        this.shoppingRepository = shoppingRepository;
    }

    @Override
    public User createUser(String username, String password) {
        if( username.length() < 6 || password.length() < 6){
            throw new IllegalArgumentException ("Username and password must be at least 6 chars");
        } else {
        User user = new User(username, password);
        this.userrepository.save(user);
        createCart(user);
        return user;
        }
    }
    
    @Override
    public void createCart(User u){
        Shoppingcart sp = new Shoppingcart(u.getId(), 0);
        this.shoppingRepository.save(sp);
    }

    @Override
    public String deleteUser(String username, String password) {
        User user = new User(username, password);
        this.userrepository.delete(user);
        StringBuilder sb = new StringBuilder();
        sb.append("Username: ");
        sb.append(username);
        sb.append(" deleted.");
        return sb.toString();
    }

    @Override
    public Long getIdByUsername(String username) {
        User u = this.userrepository.getUserByUsername(username);
        return u.getId();
    }
}
