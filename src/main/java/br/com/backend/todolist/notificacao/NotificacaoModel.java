package br.com.backend.todolist.notificacao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "Notificacao")
public class NotificacaoModel {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_usuario", nullable = false)
    private int cod_usuario;

    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "senhahash", nullable = false)
    private double senhahash;
    @Column(name = "Nivel")
    private int Nivel;
}
