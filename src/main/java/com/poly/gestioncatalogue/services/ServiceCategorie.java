package com.poly.gestioncatalogue.services;

import com.poly.gestioncatalogue.dao.CategorieRepository;
import com.poly.gestioncatalogue.entities.Categorie;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ServiceCategorie implements IServiceCategorie{
    private CategorieRepository categorieRepository;
    @Override
    public void saveCategorie(Categorie c) {
        categorieRepository.save(c);

    }

    @Override
    public List<Categorie> getAllCategories() {
        return categorieRepository.findAll();
    }

    @Override
    public List<Categorie> getCategorieByMc(String mc) {
        return null;
    }

    @Override
    public void deleteCategorie(Long id) {
        categorieRepository.deleteById(id);

    }

    @Override
    public Categorie getCategorie(Long id) {
        return null;
    }
}
