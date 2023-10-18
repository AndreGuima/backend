package br.com.backend.todolist.empresa;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private IEmpresaRepository empresaRepository;

    @GetMapping("/")
    public List<EmpresaModel> list(HttpServletRequest httpServletRequest) {        
        List<EmpresaModel> empresas = this.empresaRepository.findAll();
        return empresas;
    }

    @GetMapping("/{id}")
    public EmpresaModel list(HttpServletRequest httpServletRequest, @PathVariable UUID id) {
        
        var empresa = this.empresaRepository.findById(id).orElse(null);
        if (empresa == null){            
            return null;
        }

        return empresa;
    }
       
}
