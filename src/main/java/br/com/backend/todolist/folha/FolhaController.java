package br.com.backend.todolist.folha;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/folha")
public class FolhaController {

    @Autowired
    private IFolhaRepository folhaRepository;

    @GetMapping("/")
    public List<FolhaModel> list(HttpServletRequest httpServletRequest) {        
        List<FolhaModel> Folhas = this.folhaRepository.findAll();
        return Folhas;
    }

    @GetMapping("/{id}")
    public FolhaModel list(HttpServletRequest httpServletRequest, @PathVariable UUID id) {
        
        var Folha = this.folhaRepository.findById(id).orElse(null);
        if (Folha == null){            
            return null;
        }

        return Folha;
    }
       
}
