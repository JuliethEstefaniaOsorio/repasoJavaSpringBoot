package com.repaso.repasojavaspringboot.controller;

import com.repaso.repasojavaspringboot.model.entity.Venta;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VentaController {

    @GetMapping("/nuevaventa")
    public String nuevaVenta(Model model){
        model.addAttribute("titulo", "Nueva venta");
        model.addAttribute("accion", "Guardar");

        Venta venta = new Venta();

        model.addAttribute("Venta", venta);
        return "venta/venta_nueva";
    }

    @PostMapping("/procesarventa")
    public String procesarVenta(@ModelAttribute("venta") Venta venta, Model model){
        System.out.println(venta);
        return "venta/consulta_venta";
    }
}
