package mx.edu.utez.aplicacion5c.modules.phones;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<BeanPhones, Long> {
}
