package com.adaclean.backend.controller;
import com.adaclean.backend.repository.AssociationRepository;
import com.adaclean.backend.tables.Association;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/association")
public class AssociationController {
    @Autowired

    private AssociationRepository AssociationRepository;
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Association> getName() {
        // This returns a JSON or XML with the
        return AssociationRepository.findAll();
    }










}
