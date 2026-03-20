package mx.edu.utez.aplicacion5c.modules.estudent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<BeanStudent, Long> {
}
