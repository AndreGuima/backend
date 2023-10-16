package br.com.backend.todolist.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import at.favre.lib.crypto.bcrypt.BCrypt;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @GetMapping("/")
    public List<UserModel> list(HttpServletRequest httpServletRequest) {
        
        List<UserModel> tasks = this.userRepository.findAll();
        return tasks;
    }
   
    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel){
        
        var user = this.userRepository.findByUsername(userModel.getUsername());

        if (user != null) {            
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("usuário ja existe");
        }

        var passwordHashred = BCrypt.withDefaults().hashToString(12, userModel.getPassword().toCharArray());
        userModel.setPassword(passwordHashred);

        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED ).body(userCreated);
    }
    
}
