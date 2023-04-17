package com.retos.reto3.controller;

import com.retos.reto3.dbo.ClientDbo;
import com.retos.reto3.dbo.GamaDbo;
import com.retos.reto3.model.ClientModel;
import com.retos.reto3.model.GamaModel;
import com.retos.reto3.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Gama")
public class GamaController {
    @Autowired
    GamaService gamaService;

    @GetMapping("/all")
    public List<GamaModel> obtener(){
        return gamaService.obtener();


    }
    //Todo: corregir error DBO
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public String crear(@RequestBody GamaModel gama){
        return gamaService.crear(gama);


    }
}
