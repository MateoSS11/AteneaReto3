package com.retos.reto3.service;

import com.retos.reto3.model.ClientModel;
import com.retos.reto3.model.GamaModel;
import com.retos.reto3.repository.ClientRepository;
import com.retos.reto3.repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {

    @Autowired
    GamaRepository gamaRepository;
    public List<GamaModel> obtener(){
        return gamaRepository.findAll();

    }

    public String crear(GamaModel gama){
        gamaRepository.save(gama);
        return "Se creo la gama exitosamente";

    }
}
