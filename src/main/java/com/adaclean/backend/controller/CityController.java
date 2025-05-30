package com.adaclean.backend.controller;
import com.adaclean.backend.tables.City;
import com.adaclean.backend.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired

    private CityRepository CityRepository;
    @GetMapping(path="/all")
    public @ResponseBody Iterable<City> getName() {
        // This returns a JSON or XML with the waste_type
        return CityRepository.findAll();
    }

}
