package com.retos.reto3.controller;

import com.retos.reto3.dbo.AdminDbo;
import com.retos.reto3.dbo.CarDbo;
import com.retos.reto3.model.AdminModel;
import com.retos.reto3.model.CarModel;
import com.retos.reto3.service.AdminService;
import com.retos.reto3.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Car")
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("/all")
    public List<CarModel> obtener(){
        return carService.obtener();
    }
    //Todo: corregir error DBO
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public String crear(@RequestBody CarModel car){
        return carService.crear(car);

    }
}
