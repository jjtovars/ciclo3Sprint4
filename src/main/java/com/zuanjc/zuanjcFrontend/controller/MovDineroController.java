package com.zuanjc.zuanjcFrontend.controller;

import com.zuanjc.zuanjcFrontend.entidades.Empresa;
import com.zuanjc.zuanjcFrontend.entidades.MovDinero;
import com.zuanjc.zuanjcFrontend.service.EmpresaService;
import com.zuanjc.zuanjcFrontend.service.MovDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovDineroController {

    @Autowired
    MovDineroService movDineroService;

    @GetMapping("/movDinero")
    private String verMovDinero(Model model){
        model.addAttribute("movDineros",movDineroService.verMovDinero());
        return "movDinero";
    }

    @GetMapping("/agregar-movDinero")
    private String verFormularioDeRegistroMovDinero(MovDinero movDinero){
        return "agregar-movDinero";
    }

    @PostMapping("/movDinero")
    private String crear(MovDinero movDinero){
        movDineroService.crearYActualizarMovDinero(movDinero);
        return "redirect:/movDinero";
    }

    @GetMapping("/movDinero/borrar/{id}")
    private String eliminarMovDinero(@PathVariable("id") Integer id){
        movDineroService.eliminarMovDinero(id);
        return "redirect:/movDinero";
    }

    @GetMapping("/movDinero/editar/{id}")
    private String verMovDineroPorId(@PathVariable("id")Integer id, Model model){
        MovDinero movDinero = movDineroService.verMovDineroPorId(id);
        model.addAttribute("movDinero", movDinero);
        return "actualizar-movDinero";
    }

    @PostMapping("/movDinero/actualizar/{id}")
    private String editarMovDinero(@PathVariable("id") Integer id, MovDinero movDinero){
        movDineroService.crearYActualizarMovDinero(movDinero);
        return "redirect:/movDinero";
    }
}
