
package com.javabootcamp.finalproject.data.jpa.web;

import com.javabootcamp.finalproject.data.jpa.domain.Product;
import com.javabootcamp.finalproject.data.jpa.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.javabootcamp.finalproject.data.jpa.service.ProductService;
import com.javabootcamp.finalproject.data.jpa.service.ShoppingService;
import com.javabootcamp.finalproject.data.jpa.service.UserService;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
        
        @Autowired
        private ProductService productService;

        @Autowired
        private UserService userService;
        
        @Autowired
        private ShoppingService shoppingService;
        
        @RequestMapping(value = "/shop/product", method = RequestMethod.GET)
	@ResponseBody
	@Transactional(readOnly = true)
	public List<Product> findAll() {
		return this.productService.findAll();
	}
        
        @RequestMapping(value = "/shop/product/id/{productid}", method = RequestMethod.GET)
	@ResponseBody
	@Transactional(readOnly = true)
        public Product findById(@PathVariable int productid){
            Long x = (long) productid;
            return this.productService.findByIdproduct(x);
                    
        }
          
        @RequestMapping(value = "/shop/product/category/{category}", method = RequestMethod.GET)
	@ResponseBody
	@Transactional(readOnly = true)
        public List<Product> findAllByCategory(@PathVariable String category){        
            return this.productService.findAllByCategory(category);                   
        }
        
        @RequestMapping(value = "/shop/user", method = RequestMethod.POST)
        public User createUser(@RequestParam String username, @RequestParam String password){    
           return this.userService.createUser(username, password);   
        }

        @RequestMapping(value = "/shop/{name}", method = RequestMethod.PUT)
        public Product addToCart(@PathVariable String name, @RequestParam String username, @RequestParam String password){
            return this.shoppingService.addToCart(name, username, password);
        }
        
        @RequestMapping(value = "/shop/item/{name}", method = RequestMethod.PUT)
        public Product addToCartItems(@PathVariable String name,@RequestParam int quantity, @RequestParam String username, @RequestParam String password){
            return this.shoppingService.addToCartItems(quantity,name, username, password);
        }
        
        @RequestMapping(value = "/shop/{name}", method = RequestMethod.DELETE)
        public String removeFromCart(@PathVariable String name, @RequestParam int quantity, @RequestParam String username, @RequestParam String password){
           return  this.shoppingService.removeFromCart(quantity, name, username, password);
        }
      
        
        @RequestMapping(value = "/shop/user", method = RequestMethod.GET)
        public String getCart(@RequestParam String username, @RequestParam String password){
            return this.shoppingService.getCart(username, password);
        }
        
        @RequestMapping(value = "/shop/user/clear", method = RequestMethod.DELETE)
        public String clearCart(@RequestParam String username, @RequestParam String password){
            return this.shoppingService.clearCart(username, password);
        }
        
        
}
