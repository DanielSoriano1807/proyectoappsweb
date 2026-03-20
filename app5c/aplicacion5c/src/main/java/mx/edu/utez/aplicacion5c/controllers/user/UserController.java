package mx.edu.utez.aplicacion5c.controllers.user;

import mx.edu.utez.aplicacion5c.modules.user.BeanUser;
import mx.edu.utez.aplicacion5c.services.user.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin({"*"})
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
    @GetMapping
    public List<BeanUser> getUsers(){
        return userService.getUsers();
    }
}
