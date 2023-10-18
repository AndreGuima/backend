package br.com.backend.todolist.empresa;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IEmpresaRepository extends JpaRepository<EmpresaModel, UUID>{
    
}
