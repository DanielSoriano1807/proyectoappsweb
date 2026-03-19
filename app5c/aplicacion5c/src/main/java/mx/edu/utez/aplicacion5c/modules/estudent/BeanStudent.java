package mx.edu.utez.aplicacion5c.modules.estudent;

import jakarta.persistence.*;
import mx.edu.utez.aplicacion5c.modules.course.BeanCourse;
import mx.edu.utez.aplicacion5c.modules.user.BeanUser;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "student")
public class BeanStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private ENUM_GENDER gender;

    private String matricula;
    private LocalDate birthDate;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] image;

    @OneToOne
    @JoinColumn(name = "user_id")
    private BeanUser user;

    @ManyToMany
    @JoinTable(
            name = "student_has_courses",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<BeanCourse> courses;
}
