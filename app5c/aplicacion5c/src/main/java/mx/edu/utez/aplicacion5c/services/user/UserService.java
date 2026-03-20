package mx.edu.utez.aplicacion5c.services.user;

import mx.edu.utez.aplicacion5c.modules.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
}

