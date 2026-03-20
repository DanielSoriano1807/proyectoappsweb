package mx.edu.utez.aplicacion5c.services.course;

import mx.edu.utez.aplicacion5c.modules.course.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    private CourseRepository courseRepository;
    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }
}
