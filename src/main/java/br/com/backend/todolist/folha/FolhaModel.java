package br.com.backend.todolist.folha;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "Folha")
public class FolhaModel {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_folha", nullable = false)
    private int codigo_folha;

    @Column(name = "codigo_empresa", nullable = false)
    private int codigo_empresa;
    @Column(name = "codigo_funcionario", nullable = false)
    private int codigo_funcionario;
    
}
