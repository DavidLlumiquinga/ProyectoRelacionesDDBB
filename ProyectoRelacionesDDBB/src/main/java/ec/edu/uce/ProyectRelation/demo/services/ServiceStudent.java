package ec.edu.uce.ProyectRelation.demo.services;

import ec.edu.uce.ProyectRelation.demo.Interfaz.IStudent;
import ec.edu.uce.ProyectRelation.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStudent {


    private IStudent iStudent;

    @Autowired
    public ServiceStudent(IStudent iStudent){
        this.iStudent=iStudent;
    }
    public Student save(Student student){
        iStudent.save(student);
        return student;
    }
    public List<Student> getAllStudent(){
        return (List<Student>) iStudent.findAll();
    }
    public void deleteStudent(int id){
        iStudent.deleteById(id);
    }



}
