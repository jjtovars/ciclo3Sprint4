package com.zuanjc.zuanjcFrontend.repository;

import com.zuanjc.zuanjcFrontend.entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}
