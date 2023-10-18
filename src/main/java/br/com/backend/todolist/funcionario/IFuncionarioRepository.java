package br.com.backend.todolist.funcionario;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IFuncionarioRepository extends JpaRepository<FuncionarioModel, UUID>{
    
}
