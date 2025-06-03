package com.adaclean.backend.controller;
import com.adaclean.backend.tables.Waste;
import com.adaclean.backend.repository.WasteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/waste")
@CrossOrigin(origins = "*")
public class WasteController {
    @Autowired

    private WasteRepository WasteRepository;
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Waste> getWaste_name() {
        return WasteRepository.findAll();
    }

    @PostMapping
    public Waste createWaste(@RequestBody Waste waste) {
        return WasteRepository.save(waste);
    }
}
