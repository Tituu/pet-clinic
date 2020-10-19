package com.tituuuu.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class IndexVetController {
    @GetMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String getVets(){
        return "vets/index";
    }
}
