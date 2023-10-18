package br.com.backend.todolist.funcionario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "Funcionarios")
public class FuncionarioModel {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_funcionario", nullable = false)
    private int codigo_funcionario;

    @Column(name = "codigo_empresa")
    private int codigo_empresa;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "cpf", nullable = false)
    private String cpf;
    @Column(name = "rg", nullable = false)
    private String rg;
    @Column(name = "rua", nullable = false)
    private String rua;
    @Column(name = "cep", nullable = false)
    private String cep;
    @Column(name = "cidade", nullable = false)
    private String cidade;
    @Column(name = "numero", nullable = false)
    private int numero;
    @Column(name = "estado", nullable = false)
    private int estado;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "telefone", nullable = false)
    private String telefone;
    @Column(name = "vale_alimentacao", nullable = false)
    private double vale_alimentacao;
    @Column(name = "vale_transporte", nullable = false)
    private double vale_transporte;
    @Column(name = "vale_refeicao", nullable = false)
    private double vale_refeicao;
    @Column(name = "INSS", nullable = false)
    private double INSS;
    @Column(name = "PLANO_DE_SAUDE", nullable = false)
    private double PLANO_DE_SAUDE;
    @Column(name = "DESCONTO_SINDICAL", nullable = false)
    private double DESCONTO_SINDICAL;
    @Column(name = "salario", nullable = false)
    private double salario;
    @Column(name = "codigo_usuario", nullable = false)
    private int codigo_usuario;
    @Column(name = "codigo_cargo", nullable = false)
    private int codigo_cargo;
    
}
