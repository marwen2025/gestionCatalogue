package com.poly.gestioncatalogue;

import com.poly.gestioncatalogue.dao.CategorieRepository;
import com.poly.gestioncatalogue.dao.ProduitRepository;
import com.poly.gestioncatalogue.entities.Categorie;
import com.poly.gestioncatalogue.entities.Produit;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class GestionCatalogueApplication{ //implements CommandLineRunner {
	//@Autowired
	//private CategorieRepository categorieRepository;
	//@Autowired
	//private ProduitRepository produitRepository;

	/*public GestionCatalogueApplication(CategorieRepository categorieRepository, ProduitRepository produitRepository) {
		this.categorieRepository = categorieRepository;
		this.produitRepository = produitRepository;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(GestionCatalogueApplication.class, args);
	}
	/*@Override
	public void run(String... args)throws  Exception{
	//categorieRepository.save(new Categorie(null,"INFORMATIQUE",null));
	//categorieRepository.save(new Categorie(null,"ELECTRONIQUE",null));
	//produitRepository.save(new Produit(null,"talvza",800,50,null));
	//produitRepository.save(new Produit(null,"pc portable",800,50,categorieRepository.findById(1L).get()));
	//produitRepository.deleteById(1L);
	Produit produit = produitRepository.findById(2L).get();
	}
*/
	@Bean
	CommandLineRunner commandLineRunner(CategorieRepository categorieRepository,ProduitRepository produitRepository){
		return args -> {
			//categorieRepository.save(Categorie.builder().nom("MECANIQUE").build());
			//produitRepository.save(Produit.builder().nom("karahba").prix(80000).quantite(5).categorie(categorieRepository.findById(3L).get()).build());

			/*List<Produit> produits;
			produits =produitRepository.getProduitsByCat(3L);
			System.out.println(produits);*/

		};

	}
}
