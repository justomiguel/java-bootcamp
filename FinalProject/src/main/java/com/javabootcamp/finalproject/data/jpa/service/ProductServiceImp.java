
package com.javabootcamp.finalproject.data.jpa.service;

import com.javabootcamp.finalproject.data.jpa.domain.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service("productService")
public class ProductServiceImp implements ProductService {
    
    private final ProductRepository productrepository;
    
    @Autowired
    public ProductServiceImp(ProductRepository productrepository){
        this.productrepository = productrepository;
    }
    
    @Override
    public Product findByIdproduct(Long productid) {
        Assert.notNull(productid, "Product if must not be null");   
        return this.productrepository.findByIdproduct(productid);
    }
    
    @Override
    public List<Product> findAll(){      
        return this.productrepository.findAll();
    }
    
    @Override
    public List<Product> findAllByCategory(String category){
        return this.productrepository.findAllByCategory(category);
    }
}
