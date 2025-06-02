package com.adaclean.backend.controller;
import com.adaclean.backend.tables.Login;
import com.adaclean.backend.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "*")
public class LoginController {
    @Autowired

    private LoginRepository LoginRepository;
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Login> getName() {
        // This returns a JSON or XML with the login
        return LoginRepository.findAll();
    }

    @PostMapping
    public Login createLogin(@RequestBody Login login) {
        return LoginRepository.save(login);
    }
}

