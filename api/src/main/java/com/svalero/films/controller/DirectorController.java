package com.svalero.films.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("directors")
public class DirectorController {

    @Autowired
    private DirectorService directorService
}
