package com.poly.gestioncatalogue.dao;

import com.poly.gestioncatalogue.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ProduitRepository extends JpaRepository<Produit,Long> {
    public Page<Produit> findByNomContains(String mc, Pageable p);
    @Query("select p from Produit p where p.categorie.id= :x")
    public List<Produit> getProductsByCat (@Param("x") Long idC);


}
