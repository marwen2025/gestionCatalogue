package com.poly.gestioncatalogue.controller;

import com.poly.gestioncatalogue.entities.Categorie;
import com.poly.gestioncatalogue.services.ServiceCategorie;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class CategorieController {
    ServiceCategorie serviceCategorie;

    @GetMapping("/categories")
    public String getAllCategories(Model m)
    {
        List<Categorie> categories=serviceCategorie.getAllCategories();
        m.addAttribute("categories",categories);

        return "categories";
}
}
