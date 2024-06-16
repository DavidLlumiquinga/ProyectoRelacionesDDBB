package ec.edu.uce.ProyectRelation.demo.controller;

import ec.edu.uce.ProyectRelation.demo.model.Subject;
import ec.edu.uce.ProyectRelation.demo.services.ServiceSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/subject")
public class SubjectController {

    private ServiceSubject subjectService;

    @Autowired
    public SubjectController(ServiceSubject subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping
    public List<Subject> getAllSubject() {
        return subjectService.getAllSubject();
    }

    @GetMapping
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectService.save(subject);
    }

    @DeleteMapping("/id")
    public void deleteSubject(@PathVariable("id") int id) {
        subjectService.deleteSubject(id);
    }
}
