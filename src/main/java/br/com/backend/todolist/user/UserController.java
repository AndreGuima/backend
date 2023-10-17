package br.com.backend.todolist.user;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.todolist.task.TaskModel;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @GetMapping("/")
    public List<UserModel> list(HttpServletRequest httpServletRequest) {
        
        List<UserModel> tasks = this.userRepository.findAll();
        System.out.println(tasks);
        return tasks;
    }
       
}
