package br.com.backend.todolist.cargo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ICargoRepository extends JpaRepository<CargoModel, UUID>{
    
}
