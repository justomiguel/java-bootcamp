/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello;

/**
 * Exception thrown when an error occurs in adding or deleting a friend
 * @author roberta
 */
public class FriendException extends Exception {

    public FriendException() {
    }

    public FriendException(String string) {
        super(string);
    }

}