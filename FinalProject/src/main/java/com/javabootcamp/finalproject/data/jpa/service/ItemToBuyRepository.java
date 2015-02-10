
package com.javabootcamp.finalproject.data.jpa.service;

import com.javabootcamp.finalproject.data.jpa.domain.Itemtobuy;
import java.util.List;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ItemToBuyRepository extends CrudRepository<Itemtobuy, Long> {
    
    @Query("Select p.name, i.quantity from Product p, Itemtobuy i where i.idprod = ?1 and i.idprod = p.idproduct" )
    public String findAllProductsById(Long id);
    
    @Query("from Itemtobuy i where idcart = ?1 and idprod = ?2 ")
    public Itemtobuy findByShopId(Long id, Long idprod);
    
    @Query("Select i.idprod from Itemtobuy i where i.idcart = ?1")
    public List<Long> getIdItemsInCart(Long id);

    @Modifying
    @Query("Delete from Itemtobuy i where i.idcart = ?1")
    public void deleteAllById(Long id);
    
}
