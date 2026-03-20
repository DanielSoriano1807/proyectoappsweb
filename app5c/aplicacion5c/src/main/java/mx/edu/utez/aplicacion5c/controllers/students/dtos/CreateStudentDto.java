package mx.edu.utez.aplicacion5c.controllers.students.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudentDto {
    private String firstNames;
    private String lastNames;
    private String gender;
    private String matricula;
    private LocalDate birthDate;

    private String username;
    private String passqord;
}
