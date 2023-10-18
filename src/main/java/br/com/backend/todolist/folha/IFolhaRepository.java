package br.com.backend.todolist.folha;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IFolhaRepository extends JpaRepository<FolhaModel, UUID>{
    
}
