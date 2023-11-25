package com.poly.gestioncatalogue.services;

import com.poly.gestioncatalogue.entities.Categorie;


import java.util.List;

public interface IServiceCategorie {
    public void saveCategorie(Categorie c);
    public List<Categorie> getAllCategories();
    public List<Categorie> getCategorieByMc(String mc);
    public void deleteCategorie(Long id);
    public Categorie getCategorie (Long id);
}
