package com.sesion1.MD.Controllers;

import com.sesion1.MD.Models.BebidasModel;
import com.sesion1.MD.Models.LibrosModel;
import com.sesion1.MD.Models.PeliculasModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@RestController
@Controller
@RequestMapping("/peliculas")
public class PeliculasController {
    private List<PeliculasModel> peliculas = new ArrayList<>();

    /*@GetMapping
    public List<PeliculasModel> getAllPeliculas(){
        peliculas.add(new PeliculasModel("Iron Man",126, "Accion, Aventuras, Ciencia Ficcion","Muy buena"));
        peliculas.add(new PeliculasModel("Como entrenar a tu dragon",98, "Animacion, Fantacia, Avenruras", "Preciosa"));
        peliculas.add(new PeliculasModel("Historias Cruzadas",146, "Drama", "Me encanta la parte del pastel!"));
        return peliculas;
    }*/
    @GetMapping("/registrar")
    public String getAllBebidas(Model model){
        model.addAttribute("pelicula", new PeliculasModel());
        return "PeliculasForm";
    }

    @PostMapping("/nuevaPelicula")
    public String nuevaPelicuala(@ModelAttribute PeliculasModel peliculas, Model model){
        model.addAttribute("peliculas", peliculas);
        return "ResultPeliculas";
    }
}
