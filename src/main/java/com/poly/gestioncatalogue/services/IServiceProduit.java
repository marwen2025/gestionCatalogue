package com.poly.gestioncatalogue.services;

import com.poly.gestioncatalogue.entities.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;

public interface IServiceProduit
{
    public void saveProduct(Produit p, MultipartFile mf) throws IOException;
    public List<Produit> getAllProducts();
    public Page<Produit> getProductByMc(String mc, Pageable p);
    public List<Produit> getProductByCat(Long idCat);
    public void deleteProduct(Long id);
    public Produit getProduct (Long id);
    public void editProduct(Long id, Produit editedProduct);


}
