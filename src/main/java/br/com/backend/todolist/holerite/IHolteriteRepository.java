package br.com.backend.todolist.holerite;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IHolteriteRepository extends JpaRepository<HolteriteModel, UUID>{
    
}
