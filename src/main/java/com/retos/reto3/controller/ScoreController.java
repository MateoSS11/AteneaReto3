package com.retos.reto3.controller;

import com.retos.reto3.dbo.ReservationDbo;
import com.retos.reto3.dbo.ScoreDbo;
import com.retos.reto3.model.ReservationModel;
import com.retos.reto3.model.ScoreModel;
import com.retos.reto3.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Score")
public class ScoreController {
    @Autowired
    ScoreService scoreService;

    @GetMapping("/all")
    public List<ScoreModel> obtener(){
        return scoreService.obtener();

    }
    //Todo: corregir error DBO
    @PostMapping("/save")
    public String crear(@RequestBody ScoreModel score){
        return scoreService.crear(score);
    }
}
