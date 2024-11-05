package com.sesion1.MD.Controllers;

import com.sesion1.MD.Models.BebidasModel;
import com.sesion1.MD.Models.DeportesModel;
import com.sesion1.MD.Models.LibrosModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//Controlador que no espera tener una vista
//Puede ser consumido por otras aplicaciones o por web
//Tecnologias legacy
//@RestController

@Controller
@RequestMapping("/libros")
public class LibrosController {
    private List<LibrosModel> libros = new ArrayList<>();

    /*@GetMapping
    public List<LibrosModel> getAllLibros(){
        libros.add(new LibrosModel("Harry Pother","JK Rowling",150, "Fantasia","El niño que vivio"));
        libros.add(new LibrosModel("Principe Cruel","Holly Black",220, "Fantasia","Jud vive con hadas"));
        libros.add(new LibrosModel("Alas de Sangres","Rebeca Yarros",250, "Fantasia","Violet ingresa a la academia de dragones"));
        return libros;
    }*/
    @GetMapping("/registrar")
    public String getAllBebidas(Model model){
        model.addAttribute("libro", new LibrosModel());
        return "LibrosForm";
    }

    @PostMapping("/nuevoLibro")
    public String nuevoLibro(@ModelAttribute LibrosModel libro, Model model){
        model.addAttribute("libros", libro);
        return "ResultLibros";
    }
}
