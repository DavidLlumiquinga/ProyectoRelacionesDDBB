package ec.edu.uce.ProyectRelation.demo.services;

import ec.edu.uce.ProyectRelation.demo.Interfaz.IProfile;
import ec.edu.uce.ProyectRelation.demo.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProfile {

    private IProfile iProfile;

    @Autowired
    public ServiceProfile(IProfile iProfile){
        this.iProfile=iProfile;
    }
    public Profile save(Profile profile){
        iProfile.save(profile);
        return profile;
    }
    public List<Profile> getAllProfile(){
        return (List<Profile>) iProfile.findAll();
    }
    public void deleteProfile(int id){
        iProfile.deleteById(id);
    }
}
