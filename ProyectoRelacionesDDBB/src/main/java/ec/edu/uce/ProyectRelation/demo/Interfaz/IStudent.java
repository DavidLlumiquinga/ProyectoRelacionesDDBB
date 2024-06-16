package ec.edu.uce.ProyectRelation.demo.Interfaz;

import ec.edu.uce.ProyectRelation.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IStudent extends JpaRepository<Student,Integer> {
}
