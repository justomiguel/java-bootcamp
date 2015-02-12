/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabootcamp.shopcart.repository;

import javabootcamp.shopcart.model.ShopCartItem;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author roberta
 */
public interface ItemRepository extends CrudRepository<ShopCartItem, Long> {

}
