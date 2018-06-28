package com.simplus.gestao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.simplus.gestao.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Transactional(readOnly=true)
    @Query("SELECT obj FROM Product obj WHERE obj.company.id = :companyId ORDER BY obj.lastUpdate")
    public List<Product> findProducts(@Param("companyId") Integer company_id);

    @Transactional(readOnly=true)
    public List<Product> findAllByOrderByName();

    /*SELECT * FROM simplus.product WHERE CHARACTER_LENGTH(gtin)=13 ORDER BY last_update;
    SELECT * FROM simplus.product WHERE CHARACTER_LENGTH(gtin)=14 ORDER BY last_update;*/

   /*
SELECT c.id AS company_id, c.name AS company_name,
 p.id AS product_id, p.description AS product_desciption
 FROM simplus.company c LEFT JOIN simplus.product p ON p.company_id = c.id
 */
    @Transactional(readOnly=true)
    @Query("SELECT obj FROM Product obj WHERE CHARACTER_LENGTH(obj.gtin)=13 ORDER BY last_update")
    public List<product> findAllBy13();

    @Transactional(readOnly=true)
    @Query("SELECT obj FROM Product obj WHERE CHARACTER_LENGTH(obj.gtin)=14 ORDER BY last_update")
    public List<product> findAllBy14();
}
