package mx.edu.utez.aplicacion5c.modules.phones;

import jakarta.persistence.*;
import mx.edu.utez.aplicacion5c.modules.estudent.BeanStudent;

@Entity
@Table(name = "phone")
public class BeanPhones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private BeanStudent student;
}
