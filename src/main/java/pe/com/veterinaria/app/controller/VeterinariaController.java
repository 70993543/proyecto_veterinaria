package pe.com.veterinaria.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.com.veterinaria.app.services.VeterinariaServices;

@Controller
@RequestMapping("/veterinarias")
public class VeterinariaController {

    @Autowired
    VeterinariaServices veterinariaservicio;

    @GetMapping("/listarveterinarias")
    public String obtenerVeterinarias(Model model){
        model.addAttribute("veterinarias", veterinariaservicio.buscarTodos());
        return "veterinaria/listarveterinarias";
    }
}



