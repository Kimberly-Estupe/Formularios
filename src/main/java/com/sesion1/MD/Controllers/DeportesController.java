package com.sesion1.MD.Controllers;

import com.sesion1.MD.Models.BebidasModel;
import com.sesion1.MD.Models.DeportesModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/deportes")
public class DeportesController {
    private List<DeportesModel> deportes = new ArrayList<>();

    @GetMapping("/registrar")
    public String getAllBebidas(Model model){
        model.addAttribute("deporte", new DeportesModel());
        return "DeportesForm";
    }

    @PostMapping("/nuevoDeporte")
    public String nuevoDeporte(@ModelAttribute DeportesModel deportes, Model model){
        model.addAttribute("deportes", deportes);
        return "ResultDeportes";
    }
}
