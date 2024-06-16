package ec.edu.uce.ProyectRelation.demo.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_teacher")
    @SequenceGenerator(name = "seq_teacher", sequenceName = "seq_teacher", allocationSize = 1)
    private int id;

    @Column
    private String name;

    @Column
    private String lastName;

    @OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
    private List<Subject> subjects;

    public Teacher(){

    }

    public Teacher(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public List<Subject> getSubjects() { return subjects; }
    public void setSubjects(List<Subject> subjects) { this.subjects = subjects; }
}
