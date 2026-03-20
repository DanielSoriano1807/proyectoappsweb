package mx.edu.utez.aplicacion5c.controllers.phone;

import mx.edu.utez.aplicacion5c.services.phones.PhoneService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/phone")
@CrossOrigin({"*"})
public class PhoneController {
    private PhoneService phoneService;
    public PhoneController(PhoneService phoneService){
        this.phoneService=phoneService;
    }
}
