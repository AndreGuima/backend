package br.com.backend.todolist.holerite;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/holerite")
public class HolteriteController {

    @Autowired
    private IHolteriteRepository holeriteRepository;

    @GetMapping("/")
    public List<HolteriteModel> list(HttpServletRequest httpServletRequest) {        
        List<HolteriteModel> holerite = this.holeriteRepository.findAll();
        return holerite;
    }

    @GetMapping("/{id}")
    public HolteriteModel list(HttpServletRequest httpServletRequest, @PathVariable UUID id) {
        
        var holerite = this.holeriteRepository.findById(id).orElse(null);
        if (holerite == null){            
            return null;
        }

        return holerite;
    }
       
}
