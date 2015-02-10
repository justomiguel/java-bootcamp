
package com.javabootcamp.finalproject.data.jpa.service;

import com.javabootcamp.finalproject.data.jpa.domain.Product;
import java.util.List;

public interface ProductService {
    /**
     * Returns product with the given id
     * @param productid
     * @return 
     */
    Product findByIdproduct(Long productid);
    
    /**
     * Returns list with all products
     * @return 
     */
    List<Product> findAll();
    
    /**
     * Returns list with the products of the given category
     * @param category
     * @return 
     */
    List<Product> findAllByCategory(String category);
}
