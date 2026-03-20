package mx.edu.utez.aplicacion5c.controllers.user;

import mx.edu.utez.aplicacion5c.services.user.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
}
