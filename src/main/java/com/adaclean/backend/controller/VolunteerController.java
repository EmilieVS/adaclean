package com.adaclean.backend.controller;
import com.adaclean.backend.tables.Volunteer;
import com.adaclean.backend.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/volunteer")
@CrossOrigin(origins = "*")
public class VolunteerController {
    @Autowired

    private VolunteerRepository VolunteerRepository;
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Volunteer> getName() {
        // This returns a JSON or XML with the volunteer
        return VolunteerRepository.findAll();
    }

    @PostMapping(path="/all")
    public Volunteer createVolunteer(@RequestBody Volunteer volunteer) {

        return VolunteerRepository.save(volunteer);
    }
    @PutMapping(path="/{id}")
    public ResponseEntity<?> updateVolunteer(@PathVariable("id") Integer id,
                                             @Valid @RequestBody UpdateVolunteer request,
                                              Volunteer currentVolunteer) {

    volunteerService.updateVolunteer(id,request,currentVolunteer);
        return ResponseEntity.ok("Utilisateur mis à jour avec succès");
    }




    @DeleteMapping(path="/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id ) {
       VolunteerRepository.deleteById(id);
    }
}

