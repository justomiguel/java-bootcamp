/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabootcamp.shopcart.repository;

import javabootcamp.shopcart.model.ShopCart;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author roberta
 */
public interface ShopCartRepository extends CrudRepository<ShopCart, Long> {

}
