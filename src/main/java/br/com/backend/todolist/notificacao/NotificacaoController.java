package br.com.backend.todolist.notificacao;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/notificacao")
public class NotificacaoController {

    @Autowired
    private INotificacaoRepository notificacaoRepository;

    @GetMapping("/")
    public List<NotificacaoModel> list(HttpServletRequest httpServletRequest) {        
        List<NotificacaoModel> notificacao = this.notificacaoRepository.findAll();
        return notificacao;
    }

    @GetMapping("/{id}")
    public NotificacaoModel list(HttpServletRequest httpServletRequest, @PathVariable UUID id) {
        
        var notificacao = this.notificacaoRepository.findById(id).orElse(null);
        if (notificacao == null){            
            return null;
        }

        return notificacao;
    }
       
}
