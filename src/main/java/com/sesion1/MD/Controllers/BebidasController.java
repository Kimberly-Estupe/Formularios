package com.sesion1.MD.Controllers;

import com.sesion1.MD.Models.BebidasModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//Al enviar datos se vuelve un controlador normal
//@RestController
@Controller
@RequestMapping("/bebidas")
public class BebidasController {
    private List<BebidasModel> bebidas = new ArrayList<>();

    /*@GetMapping
    public List<BebidasModel> getAllBebidas(){
        bebidas.add(new BebidasModel("Coca-cola","Gaseosa",354,"08/10/2024"));
        bebidas.add(new BebidasModel("Gatorade","Energetica",600,"01/09/2024"));
        bebidas.add(new BebidasModel("Pepsi","Gaseosa",1500,"09/10/2005"));
        return bebidas;
    }*/

    @GetMapping("/registrar")
    public String getAllBebidas(Model model){
        model.addAttribute("bebida", new BebidasModel());
        return "BebidasForm";//Retorna la pagina html
    }

    @PostMapping("/nuevaBebida")
    public String nuevaBebida(@ModelAttribute BebidasModel bebidas, Model model){
        model.addAttribute("bebidas", bebidas);
        return "ResultBebidas";
    }



}
