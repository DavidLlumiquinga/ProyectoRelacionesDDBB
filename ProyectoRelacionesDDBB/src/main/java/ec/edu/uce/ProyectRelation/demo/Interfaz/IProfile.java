package ec.edu.uce.ProyectRelation.demo.Interfaz;

import ec.edu.uce.ProyectRelation.demo.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfile extends JpaRepository<Profile,Integer> {
}
