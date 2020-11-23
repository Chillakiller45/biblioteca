package com.init.controllers;

import com.init.entities.Libro;
import com.init.services.ILibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("libros")
public class LibrosController {

    @Autowired
    private ILibrosService librosService;

    @GetMapping
    public ResponseEntity<List<Libro>> getLibros() {
        return new ResponseEntity<>(librosService.findAll(), HttpStatus.OK);
    }

}
