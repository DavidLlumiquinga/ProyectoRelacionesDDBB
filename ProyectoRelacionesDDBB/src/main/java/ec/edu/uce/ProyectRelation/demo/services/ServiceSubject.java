package ec.edu.uce.ProyectRelation.demo.services;

import ec.edu.uce.ProyectRelation.demo.Interfaz.ISubject;
import ec.edu.uce.ProyectRelation.demo.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSubject {

    private ISubject iSubject;

    @Autowired
    public ServiceSubject(ISubject iSubject){
        this.iSubject=iSubject;
    }
    public Subject save(Subject subject){
        iSubject.save(subject);
        return subject;
    }
    public List<Subject> getAllSubject(){
        return (List<Subject>) iSubject.findAll();
    }
    public void deleteSubject(int id){
        iSubject.deleteById(id);
    }
}
