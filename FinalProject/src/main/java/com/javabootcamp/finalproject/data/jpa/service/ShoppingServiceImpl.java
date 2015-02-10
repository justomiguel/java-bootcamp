
package com.javabootcamp.finalproject.data.jpa.service;

import com.javabootcamp.finalproject.data.jpa.domain.Itemtobuy;
import com.javabootcamp.finalproject.data.jpa.domain.Product;
import com.javabootcamp.finalproject.data.jpa.domain.Shoppingcart;
import com.javabootcamp.finalproject.data.jpa.domain.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("shoppingCartService")
public class ShoppingServiceImpl implements ShoppingService {
    
    private final ShoppingCartRepository shoppingRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final ItemToBuyRepository itemToBuyRepository;
    
    @Autowired
    public ShoppingServiceImpl(ShoppingCartRepository shoppingRepository,UserRepository userRepository, ProductRepository productRepository, ItemToBuyRepository itemToBuyRepository){
        this.shoppingRepository = shoppingRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
        this.itemToBuyRepository = itemToBuyRepository;
    }
    
    @Override
    public Product addToCart(String name, String username, String password) {
        User u = this.userRepository.getUserByUsername(username);       
        if (u.getPassword().equals(password)){
            Long id = this.shoppingRepository.getShoppingCartId(u.getId());
            Long idprod = this.productRepository.getIdproductByName(name);
            double price = this.productRepository.getPriceForId(idprod);
            Itemtobuy i = new Itemtobuy(id, idprod, 1);
            this.itemToBuyRepository.save(i);
            
            this.shoppingRepository.addTotal(id, price, 1);
            
            return this.productRepository.findByIdproduct(idprod);
        } else {
            throw new IllegalArgumentException ("Username and password does not match");
        }
    }

    @Override
    public Product addToCartItems(int quantity, String name, String username, String password) {
        if (quantity < 1){
            throw new IllegalArgumentException ("Please insert a valid quantity value");
        } else {
        User u = this.userRepository.getUserByUsername(username);
        if (u.getPassword().equals(password)){
            Long id = this.shoppingRepository.getShoppingCartId(u.getId());
            Long idprod = this.productRepository.getIdproductByName(name);
            double price = this.productRepository.getPriceForId(idprod);
            
            Itemtobuy i = new Itemtobuy(id, idprod, quantity);
            this.itemToBuyRepository.save(i);
            
            this.shoppingRepository.addTotal(id, price, quantity);
            return this.productRepository.findByIdproduct(idprod);
        } else {
            throw new IllegalArgumentException ("Username and password does not match");
        }
       }
    }

    @Override
    public String removeFromCart(int quantity, String name, String username, String password) {
        User u = this.userRepository.getUserByUsername(username);
        if (u.getPassword().equals(password)){
            Long id = this.shoppingRepository.getShoppingCartId(u.getId());
            Long idprod = this.productRepository.getIdproductByName(name);    
            Itemtobuy i = this.itemToBuyRepository.findByShopId(id, idprod);           
            if (quantity > i.getQuantity()) {
                throw new IllegalArgumentException ("Given quantity is greater than quantity in cart");
            } else {
               double price = this.productRepository.getPriceForId(idprod);            
               this.shoppingRepository.removeFromTotal(id, quantity, price);
               this.shoppingRepository.removeItemToBuy(quantity, id,idprod);
               return "Removed item from cart"; 
            }       
        } else {
            throw new IllegalArgumentException ("Username and password does not match");
        }
    }
    
    @Override
    public void save(Shoppingcart s){
        this.shoppingRepository.save(s);
    }

    @Override
    public String getCart(String username, String password) {
        User u = this.userRepository.getUserByUsername(username);
        if (u.getPassword().equals(password)){
            Long id = this.shoppingRepository.getShoppingCartId(u.getId());
            StringBuilder sb = new StringBuilder();
            
            List<Long> idlist = this.itemToBuyRepository.getIdItemsInCart(id);
            
            for (int i = 0; i < idlist.size(); i++){
                sb.append(this.itemToBuyRepository.findAllProductsById(idlist.get(i)));
                sb.append(", ");
            }
            sb.append(" Total: $");
            sb.append(this.shoppingRepository.findTotalByIdshoppingcart(id));
            return sb.toString();
        } else{
            throw new IllegalArgumentException ("Username and password does not match");
        }
    }

    @Override
    public String clearCart(String username, String password) {
        User u = this.userRepository.getUserByUsername(username);
        if (u.getPassword().equals(password)){
            Long id = this.shoppingRepository.getShoppingCartId(u.getId());
            this.itemToBuyRepository.deleteAllById(id);
            this.shoppingRepository.clearTotal(id);
            
            return "Shopping cart cleared";
        }else{
            throw new IllegalArgumentException ("Username and password does not match");
        }
    }
}
