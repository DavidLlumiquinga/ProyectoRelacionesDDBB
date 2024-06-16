package ec.edu.uce.ProyectRelation.demo;

import ec.edu.uce.ProyectRelation.demo.Interfaz.IProfile;
import ec.edu.uce.ProyectRelation.demo.Interfaz.IStudent;
import ec.edu.uce.ProyectRelation.demo.Interfaz.ISubject;
import ec.edu.uce.ProyectRelation.demo.Interfaz.ITeacher;
import ec.edu.uce.ProyectRelation.demo.model.Profile;
import ec.edu.uce.ProyectRelation.demo.model.Student;
import ec.edu.uce.ProyectRelation.demo.model.Subject;
import ec.edu.uce.ProyectRelation.demo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ProyectoRelacionesDdbbApplication implements CommandLineRunner {

	@Autowired
	IStudent iStudent;
	@Autowired
	ITeacher iTeacher;
	@Autowired
	ISubject iSubject;
	@Autowired
	IProfile iProfile;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoRelacionesDdbbApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {

		Teacher teacher1 = new Teacher();
		teacher1.setName("John");
		teacher1.setLastName("Doe");


		Teacher teacher2 = new Teacher();
		teacher2.setName("Jane");
		teacher2.setLastName("Smith");

	iTeacher.saveAll(Arrays.asList(teacher1, teacher2));

		// Crear instancias de Subject
		Subject subject1 = new Subject();
		subject1.setName("Mathematics");
		subject1.setTeacher(teacher1);

		Subject subject2 = new Subject();
		subject2.setName("History");
		subject2.setTeacher(teacher2);

		Subject subject3 = new Subject();
		subject3.setName("Science");
		subject3.setTeacher(teacher1);

		iSubject.saveAll(Arrays.asList(subject1, subject2, subject3));

		// Crear instancias de Profile
		Profile profile1 = new Profile();
		profile1.setBio("Bio of Student 1");
		profile1.setAddress("Address 1");

		Profile profile2 = new Profile();
		profile2.setBio("Bio of Student 2");
		profile2.setAddress("Address 2");

		iProfile.saveAll(Arrays.asList(profile1, profile2));

		// Crear instancias de Student
		Student student1 = new Student();
		student1.setName("Alice");
		student1.setLastName("Johnson");
		student1.setProfile(profile1);
		student1.setSubjects(Arrays.asList(subject1, subject2));

		Student student2 = new Student();
		student2.setName("Bob");
		student2.setLastName("Williams");
		student2.setProfile(profile2);
		student2.setSubjects(Arrays.asList(subject2, subject3));


	}
}
