package ec.edu.uce.ProyectRelation.demo.controller;

import ec.edu.uce.ProyectRelation.demo.model.Student;
import ec.edu.uce.ProyectRelation.demo.services.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private ServiceStudent studentService;

    @Autowired
    public StudentController(ServiceStudent studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @DeleteMapping("/id")
    public void deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
    }
}
