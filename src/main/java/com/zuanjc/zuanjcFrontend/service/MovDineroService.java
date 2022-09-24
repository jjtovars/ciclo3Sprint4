package com.zuanjc.zuanjcFrontend.service;

import com.zuanjc.zuanjcFrontend.entidades.MovDinero;
import com.zuanjc.zuanjcFrontend.repository.MovDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovDineroService {

    @Autowired
    MovDineroRepository movDineroRepository;

    public void crearYActualizarMovDinero(MovDinero movDinero){
        movDineroRepository.save(movDinero);
    }

    public List<MovDinero> verMovDinero(){
        return movDineroRepository.findAll();
    }

    public MovDinero verMovDineroPorId(Integer id){
        return movDineroRepository.findById(id).get();
    }

    public void eliminarMovDinero(Integer id){
        movDineroRepository.deleteById(id);
    }
}
