
package com.javabootcamp.finalproject.data.jpa.service;

import com.javabootcamp.finalproject.data.jpa.domain.Shoppingcart;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingCartRepository extends CrudRepository <Shoppingcart, Long> {
    
    @Query("Select sp.idshoppingcart from Shoppingcart sp where sp.idshoppingcart = ?1")
    public Long getShoppingCartId(Long id);

    @Modifying
    @Query(value = "Insert into Itemtobuy(idcart, idprod, quantity) values (?1, ?2, ?3)", nativeQuery = true)
    public void addItemToBuy(Long id,Long idprod,int i);
    
    @Modifying
    @Query("Update Itemtobuy i set quantity = (quantity - ?1) where i.idcart = ?2 AND i.idprod = ?3")
    public void removeItemToBuy(int quantity, Long id, Long idprod);
    
    @Modifying
    @Query("Update Shoppingcart s set total = (total + (?2 * ?3)) where s.idshoppingcart = ?1")
    public void addTotal(Long id, double price, int quantity);
    
    @Query("Select s.total from Shoppingcart s where s.idshoppingcart = ?1")
    public double findTotalByIdshoppingcart(Long id);
    
    @Modifying
    @Query("Update Shoppingcart s set total = (total - (?2 * ?3)) where s.idshoppingcart = ?1")
    public void removeFromTotal(Long id, int quantity, double price);

    @Modifying
    @Query("Update Shoppingcart s set total = 0 where s.idshoppingcart = ?1")
    public void clearTotal(Long id);
}
