/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author roberta
 */
@RestController
public class WSApi {

    @RequestMapping("/addUser")
    public String addUser(@RequestParam(value = "userName") String userName,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "realName") String realName) {

        try {
            MySystemController.getInstance().createUser(userName, email, password, realName);
            return "User created successfully!";
        } catch (UserAlreadyExistsException ex) {
            Logger.getLogger(WSApi.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }

    }

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam(value = "userName") String userName) {

        MySystemController.getInstance().deleteUser(userName);
        return "User eliminated successfully!";

    }
}
