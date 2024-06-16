package ec.edu.uce.ProyectRelation.demo.Interfaz;

import ec.edu.uce.ProyectRelation.demo.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ITeacher extends JpaRepository<Teacher,Integer> {
}
