package com.retos.reto3.service;

import com.retos.reto3.model.MessageModel;
import com.retos.reto3.model.ScoreModel;
import com.retos.reto3.repository.MessageRepository;
import com.retos.reto3.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    ScoreRepository scoreRepository;
    public List<ScoreModel> obtener(){
        return scoreRepository.findAll();

    }

    public String crear(ScoreModel score){
        scoreRepository.save(score);
        return "Se creo el puntaje exitosamente";

    }
}
