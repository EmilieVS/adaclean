package com.adaclean.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/waste")
public class WasteController {

    @Autowired
    private WasteRepository wasteRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Waste> getWaste_type() {
        return wasteRepository.findAll(); // Note le 'w' minuscule ici
    }
}
