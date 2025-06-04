package com.adaclean.backend.controller;
import com.adaclean.backend.tables.Volunteer;
import com.adaclean.backend.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/volunteer")
@CrossOrigin(origins = "*")
public class VolunteerController {
    @Autowired

    private VolunteerRepository volunteerRepository;
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Volunteer> getName() {
        // This returns a JSON or XML with the volunteer
        return volunteerRepository.findAll();
    }

    @PostMapping
    public Volunteer createVolunteer(@RequestBody Volunteer volunteer) {

        return volunteerRepository.save(volunteer);
    }

    @DeleteMapping(path="/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Integer id ) {
       volunteerRepository.deleteById(id);
    }

    @PutMapping(path="/{id}")
    public void updateVolunteer(@PathVariable("id") Integer id, @RequestBody Volunteer volunteer)
                                             {
        volunteer.setId(id);
        volunteerRepository.save(volunteer);

    }
}

