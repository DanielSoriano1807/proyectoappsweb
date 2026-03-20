package mx.edu.utez.aplicacion5c.controllers.course;

import mx.edu.utez.aplicacion5c.services.course.CourseService;
import mx.edu.utez.aplicacion5c.services.phones.PhoneService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/course")
@CrossOrigin({"*"})

public class CourseController {
    private CourseService courseService;
    public CourseController(CourseService courseService){
        this.courseService=courseService;
    }
}
