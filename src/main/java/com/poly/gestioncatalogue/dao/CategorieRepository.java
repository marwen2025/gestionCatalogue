package com.poly.gestioncatalogue.dao;

import com.poly.gestioncatalogue.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie,Long> {

}
