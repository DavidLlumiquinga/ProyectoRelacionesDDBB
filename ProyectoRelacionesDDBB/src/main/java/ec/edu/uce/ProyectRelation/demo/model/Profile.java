package ec.edu.uce.ProyectRelation.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_profile")
    @SequenceGenerator(name = "seq_profile", sequenceName = "seq_profile", allocationSize = 1)
    private int id;

    @Column
    private String bio;

    @Column
    private String address;

    @OneToOne(mappedBy = "profile",cascade = CascadeType.ALL)
    private Student student;

    public Profile(){

    }

    public Profile(int id, String bio, String address) {
        this.id = id;
        this.bio = bio;
        this.address = address;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
}
