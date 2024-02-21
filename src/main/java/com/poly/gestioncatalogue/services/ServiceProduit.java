package com.poly.gestioncatalogue.services;

import com.poly.gestioncatalogue.dao.ProduitRepository;
import com.poly.gestioncatalogue.entities.Produit;
import lombok.AllArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class ServiceProduit implements IServiceProduit{

    private ProduitRepository produitRepository;

    @Override
    public void saveProduct(Produit p, MultipartFile mf) throws IOException {
        if (!mf.isEmpty())
        {

            String image=saveImage(mf);
            p.setPhoto(image);
        }

        produitRepository.save(p);

    }

    @Override
    public List<Produit> getAllProducts() {
        return produitRepository.findAll();
    }

    @Override
    public Page<Produit> getProductByMc(String mc, Pageable p) {
        return produitRepository.findByNomContains(mc, p);
    }

    @Override
    public List<Produit> getProductByCat(Long idCat) {
        return produitRepository.getProductsByCat(idCat);
    }

    @Override
    public void deleteProduct(Long id) {
        produitRepository.deleteById(id);

    }

    @Override
    public Produit getProduct(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public void editProduct(Long id, Produit editedProduct, MultipartFile mf) throws IOException{
        Optional<Produit> existingProductOptional = produitRepository.findById(id);
        if (existingProductOptional.isPresent()) {
            Produit existingProduct = existingProductOptional.get();

            existingProduct.setNom(editedProduct.getNom());
            existingProduct.setPrix(editedProduct.getPrix());
            existingProduct.setQuantite(editedProduct.getQuantite());
            existingProduct.setCategorie(editedProduct.getCategorie());

            if (mf != null && !mf.isEmpty())
            {
                String newImageName=saveImage(mf);
                existingProduct.setPhoto(newImageName);
            }
            produitRepository.save(existingProduct);
        }

    }

    public String saveImage(MultipartFile mf) throws IOException {
        String nomphoto=mf.getOriginalFilename();
        String tab[]=nomphoto.split("\\.");
        String newName=tab[0]+System.currentTimeMillis()+"."+tab[1];
        File f = new ClassPathResource("static/photos").getFile();
        String chemin= f.getAbsolutePath();
        Path p= Paths.get(chemin,newName);
        Files.write(p,mf.getBytes());
        return newName;
    }
}