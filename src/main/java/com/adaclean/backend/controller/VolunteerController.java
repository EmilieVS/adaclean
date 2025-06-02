package com.adaclean.backend.controller;
import com.adaclean.backend.tables.Volunteer;
import com.adaclean.backend.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping
    public Volunteer createVolunteer(@RequestBody Volunteer volunteer) {
        return VolunteerRepository.save(volunteer);
    }
}

