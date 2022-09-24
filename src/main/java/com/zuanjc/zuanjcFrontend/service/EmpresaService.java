package com.zuanjc.zuanjcFrontend.service;

import com.zuanjc.zuanjcFrontend.entidades.Empresa;
import com.zuanjc.zuanjcFrontend.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public void crearYActualizarEmpresa(Empresa empresa){
        empresaRepository.save(empresa);
    }

    public List<Empresa> verEmpresa(){
        return empresaRepository.findAll();
    }

    public Empresa verEmpresaPorId(Integer id){
        return empresaRepository.findById(id).get();
    }

    public void eliminarEmpresa(Integer id){
        empresaRepository.deleteById(id);
    }

}
