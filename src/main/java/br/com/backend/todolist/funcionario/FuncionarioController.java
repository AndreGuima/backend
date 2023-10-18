package br.com.backend.todolist.funcionario;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private IFuncionarioRepository funcionarioRepository;

    @GetMapping("/")
    public List<FuncionarioModel> list(HttpServletRequest httpServletRequest) {        
        List<FuncionarioModel> funcionarios = this.funcionarioRepository.findAll();
        return funcionarios;
    }

    @GetMapping("/{id}")
    public FuncionarioModel list(HttpServletRequest httpServletRequest, @PathVariable UUID id) {
        
        var funcionario = this.funcionarioRepository.findById(id).orElse(null);
        if (funcionario == null){            
            return null;
        }

        return funcionario;
    }
       
}
