package com.adaclean.backend.controller;

import com.adaclean.backend.tables.Waste;
import com.adaclean.backend.repository.WasteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/waste")
public class WasteController {

    @Autowired
    private WasteRepository wasteRepository;

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Waste> getWaste_type() {
        return wasteRepository.findAll();
    }
}
