package com.retos.reto3.service;

import com.retos.reto3.model.MessageModel;
import com.retos.reto3.model.ReservationModel;
import com.retos.reto3.repository.MessageRepository;
import com.retos.reto3.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository reservationRepository;
    public List<ReservationModel> obtener(){
        return reservationRepository.findAll();

    }

    public String crear(ReservationModel reservation){
        reservationRepository.save(reservation);
        return "Se creo la reservacion exitosamente";

    }
}
