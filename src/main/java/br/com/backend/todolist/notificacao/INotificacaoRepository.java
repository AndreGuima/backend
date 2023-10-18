package br.com.backend.todolist.notificacao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface INotificacaoRepository extends JpaRepository<NotificacaoModel, UUID>{
    
}
