package mx.edu.utez.aplicacion5c.services.phones;

import mx.edu.utez.aplicacion5c.modules.phones.PhoneRepository;
import org.springframework.stereotype.Service;

@Service
public class PhoneService {
    private PhoneRepository phoneRepository;

    public PhoneService (PhoneRepository phoneRepository) {
        this.phoneRepository = PhonesRepository;
    }
}
