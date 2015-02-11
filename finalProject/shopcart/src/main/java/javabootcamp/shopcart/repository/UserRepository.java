/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabootcamp.shopcart.repository;

import javabootcamp.shopcart.model.ShopUser;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author roberta
 */
public interface UserRepository extends CrudRepository<ShopUser, String> {

}
