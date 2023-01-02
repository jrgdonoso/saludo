package com.jorge.donoso.saludo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo {


    @GetMapping("/saludar/{nombre}")
    public String saludar(@PathVariable String nombre){
        return "Hola "+nombre;
    }


}


