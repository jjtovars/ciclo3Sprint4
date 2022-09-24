package com.zuanjc.zuanjcFrontend.service;

import com.zuanjc.zuanjcFrontend.entidades.Empleado;
import com.zuanjc.zuanjcFrontend.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public void crearYActualizarEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);
    }

    public List<Empleado> verEmpleado(){
        return empleadoRepository.findAll();
    }

    public Empleado verEmpleadoPorId(Integer id){
        return empleadoRepository.findById(id).get();
    }

    public void eliminarEmpleado(Integer id){
        empleadoRepository.deleteById(id);
    }
}
