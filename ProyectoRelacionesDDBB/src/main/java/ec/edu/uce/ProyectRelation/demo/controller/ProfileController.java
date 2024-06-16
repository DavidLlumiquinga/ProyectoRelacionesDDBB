package ec.edu.uce.ProyectRelation.demo.controller;

import ec.edu.uce.ProyectRelation.demo.model.Profile;
import ec.edu.uce.ProyectRelation.demo.services.ServiceProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    private ServiceProfile serviceProfile;

    @Autowired
    public ProfileController(ServiceProfile serviceProfile) {
        this.serviceProfile = serviceProfile;
    }

    @PostMapping
    public List<Profile> getAllProfile() {
        return serviceProfile.getAllProfile();
    }

    @GetMapping
    public Profile createProfile(@RequestBody Profile profile) {
        return serviceProfile.save(profile);
    }

    @DeleteMapping("/id")
    public void deleteProfile(@PathVariable("id") int id) {
        serviceProfile.deleteProfile(id);
    }
}
