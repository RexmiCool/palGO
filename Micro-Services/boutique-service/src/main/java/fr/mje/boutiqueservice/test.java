package fr.mje.boutiqueservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping("/messages")
    public String getMessage() {
        return "Hello from Docker V2!";
    }
}
