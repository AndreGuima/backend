package br.com.backend.todolist.holerite;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "Holerite")
public class HolteriteModel {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_cargo", nullable = false)
    private int codigo_cargo;

    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "salario_base", nullable = false)
    private double salario_base;
    @Column(name = "codigo_empresa")
    private int codigo_empresa;
}
