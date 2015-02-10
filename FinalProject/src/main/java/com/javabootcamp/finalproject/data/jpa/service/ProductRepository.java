
package com.javabootcamp.finalproject.data.jpa.service;

import com.javabootcamp.finalproject.data.jpa.domain.Product;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>{
    
        Product findByIdproduct(Long productid);
        
        List<Product> findAll();
        
        @Query("Select idproduct from Product p where p.name = ?1")
        Long getIdproductByName(String name);
        
        @Query("Select price from Product p where p.idproduct = ?1")
        public double getPriceForId(Long idprod);
        
        List<Product> findAllByCategory(String category);
}
