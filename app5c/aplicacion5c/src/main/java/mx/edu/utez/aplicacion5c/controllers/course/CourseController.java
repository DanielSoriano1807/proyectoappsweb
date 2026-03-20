package mx.edu.utez.aplicacion5c.controllers.course;

import mx.edu.utez.aplicacion5c.services.course.CourseService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/course")
@CrossOrigin
public class CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

}
