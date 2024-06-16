package ec.edu.uce.ProyectRelation.demo.services;

import ec.edu.uce.ProyectRelation.demo.Interfaz.ITeacher;
import ec.edu.uce.ProyectRelation.demo.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTeacher {


    private ITeacher iTeacher;

    @Autowired
    public ServiceTeacher(ITeacher iTeacher){
        this.iTeacher=iTeacher;
    }
    public Teacher save(Teacher teacher){
        iTeacher.save(teacher);
        return teacher;
    }
    public List<Teacher> getAllTeacher(){
        return (List<Teacher>) iTeacher.findAll();
    }
    public void deleteTeacher(int id){
        iTeacher.deleteById(id);
    }
}
