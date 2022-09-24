package com.zuanjc.zuanjcFrontend.repository;

import com.zuanjc.zuanjcFrontend.entidades.MovDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovDineroRepository extends JpaRepository<MovDinero, Integer> {
}
