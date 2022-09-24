package com.zuanjc.zuanjcFrontend.controller;

import com.zuanjc.zuanjcFrontend.entidades.Empleado;
import com.zuanjc.zuanjcFrontend.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/empleado")
    private String verEmpleado(Model model){
        model.addAttribute("empleados",empleadoService.verEmpleado());
        return "empleado";
    }

    @GetMapping("/agregar-empleado")
    private String verFormularioDeRegistroEmpleado(Empleado empleado){
        return "agregar-empleado";
    }

    @PostMapping("/empleado")
    private String crearEmpleado(Empleado empleado){
        empleadoService.crearYActualizarEmpleado(empleado);
        return "redirect:/empleado";
    }

    @GetMapping("/empleado/borrar/{id}")
    private String eliminarEmpleado(@PathVariable("id") Integer id){
        empleadoService.eliminarEmpleado(id);
        return "redirect:/empleado";
    }

    @GetMapping("/empleado/editar/{id}")
    private String verEmpleadoPorId(@PathVariable("id")Integer id, Model model){
        Empleado empleado = empleadoService.verEmpleadoPorId(id);
        model.addAttribute("empleado", empleado);
        return "actualizar-empleado";
    }

    @PostMapping("/empleado/actualizar/{id}")
    private String editarEmpleado(@PathVariable("id") Integer id, Empleado empleado){
        empleadoService.crearYActualizarEmpleado(empleado);
        return "redirect:/empleado";
    }
}
