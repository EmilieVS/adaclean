package com.adaclean.backend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/com")
public class WasteController {
    @Autowired

    private WasteRepository wasteRepository;
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Waste> getWaste_type() {
        // This returns a JSON or XML with the waste_type
        return wasteRepository.findAll();
    }

}
