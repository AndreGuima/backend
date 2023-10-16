package br.com.backend.todolist.cargo;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/cargo")
public class CargoController {

    @Autowired
    private ICargoRepository cargoRepository;

    @GetMapping("/")
    public List<CargoModel> list(HttpServletRequest httpServletRequest) {        
        List<CargoModel> cargos = this.cargoRepository.findAll();
        return cargos;
    }

    @GetMapping("/{id}")
    public CargoModel list(HttpServletRequest httpServletRequest, @PathVariable UUID id) {
        
        var cargo = this.cargoRepository.findById(id).orElse(null);
        if (cargo == null){            
            return null;
        }

        return cargo;
    }
       
}
