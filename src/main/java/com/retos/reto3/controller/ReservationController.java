package com.retos.reto3.controller;

import com.retos.reto3.dbo.MessageDbo;
import com.retos.reto3.dbo.ReservationDbo;
import com.retos.reto3.model.MessageModel;
import com.retos.reto3.model.ReservationModel;
import com.retos.reto3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Reservation")
public class ReservationController {
    @Autowired
    ReservationService reservationService;

    @GetMapping("/all")
    public List<ReservationModel> obtener(){
        return reservationService.obtener();
    }
    //Todo: corregir error DBO
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public String crear(@RequestBody ReservationModel reservation){
        return reservationService.crear(reservation);
    }
}
