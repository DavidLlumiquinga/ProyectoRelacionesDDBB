package ec.edu.uce.ProyectRelation.demo.Interfaz;

import ec.edu.uce.ProyectRelation.demo.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ISubject extends JpaRepository<Subject, Integer> {
}
