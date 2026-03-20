package mx.edu.utez.aplicacion5c.controllers.students;

import mx.edu.utez.aplicacion5c.controllers.students.dtos.BodyDto;
import mx.edu.utez.aplicacion5c.controllers.students.dtos.CreateStudentDto;
import mx.edu.utez.aplicacion5c.services.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/estudiante")
@CrossOrigin({"*"})
public class StudentController {
    @Autowired
    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    // funcion para crear estudiante

    @PostMapping
    private String CreateStudent(
            @RequestBody CreateStudentDto payload
    ){
        return this.studentService.createStudent(payload);
    }

    @GetMapping("/hola-mundo")
    private String holaMundo(){
        return "Hola Mundo";
    }

    @GetMapping("path-variable/{id}")
    private String pathVariable(@PathVariable String id){
        return "path-variable/" + id;
    }

    @GetMapping("request-param")
    public String requestParam(
            @RequestParam String name
    ){
        return "request-param" + name;
    }

    @PostMapping("body")
    public BodyDto body(
            @RequestBody BodyDto body
    ){
        return body;
    }

}
