package br.com.backend.todolist.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "Usuarios")
public class UserModel {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_usuario", nullable = false)
    private Integer cod_usuario;

    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "senhahash", nullable = false)
    private String senhahash;
    @Column(name = "Nivel")
    private int Nivel;
}
