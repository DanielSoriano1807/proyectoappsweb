package mx.edu.utez.aplicacion5c.services.user;

import mx.edu.utez.aplicacion5c.modules.user.BeanUser;
import mx.edu.utez.aplicacion5c.modules.user.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    //servicio para traer todos mis usuarios
    public List<BeanUser> getUsers(){
        return userRepository.findAll();
    }
}

