package com.retos.reto3.controller;

import com.retos.reto3.dbo.CarDbo;
import com.retos.reto3.dbo.ClientDbo;
import com.retos.reto3.model.CarModel;
import com.retos.reto3.model.ClientModel;
import com.retos.reto3.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/all")
    public List<ClientModel> obtener(){
        return clientService.obtener();
    }
    //Todo: corregir error DBO
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public String crear(@RequestBody ClientModel client){
        return clientService.crear(client);
    }
}
