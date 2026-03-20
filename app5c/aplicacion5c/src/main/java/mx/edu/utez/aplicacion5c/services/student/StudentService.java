package mx.edu.utez.aplicacion5c.services.student;

import mx.edu.utez.aplicacion5c.controllers.students.dtos.CreateStudentDto;
import mx.edu.utez.aplicacion5c.modules.estudent.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public String createStudent(CreateStudentDto payload){
        // validar que nombres y apellidos no esten vacios
        if(!payload.getFirstNames().equals("")  || !payload.getLastNames().equals(""));
        return " Los nombres no deben estar vacios";
    }
}
