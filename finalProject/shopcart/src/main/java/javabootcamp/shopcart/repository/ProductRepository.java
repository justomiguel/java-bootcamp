/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabootcamp.shopcart.repository;

import java.util.List;
import javabootcamp.shopcart.model.Category;
import javabootcamp.shopcart.model.Product;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author roberta
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByName(String name);
    List<Product> findByCategory(Category category);
    
    
}
