package mx.edu.utez.aplicacion5c.modules.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<BeanCourse, Long> {
}
