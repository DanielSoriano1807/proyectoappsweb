package mx.edu.utez.aplicacion5c.modules.course;

import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class BeanCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
}
