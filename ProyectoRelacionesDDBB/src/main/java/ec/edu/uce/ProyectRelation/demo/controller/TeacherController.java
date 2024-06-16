package ec.edu.uce.ProyectRelation.demo.controller;

import ec.edu.uce.ProyectRelation.demo.model.Teacher;
import ec.edu.uce.ProyectRelation.demo.services.ServiceTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private ServiceTeacher teacherService;

    @Autowired
    public TeacherController(ServiceTeacher teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping
    public List<Teacher> getAllTeacher() {
        return teacherService.getAllTeacher();
    }

    @GetMapping
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.save(teacher);
    }

    @DeleteMapping("/id")
    public void deleteTeacher(@PathVariable("id") int id) {
        teacherService.deleteTeacher(id);
    }
}
