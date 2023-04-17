package com.retos.reto3.service;

import com.retos.reto3.model.CarModel;
import com.retos.reto3.model.ClientModel;
import com.retos.reto3.repository.CarRepository;
import com.retos.reto3.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;
    public List<ClientModel> obtener(){
        return clientRepository.findAll();

    }

    public String crear(ClientModel client){
        clientRepository.save(client);
        return "Se creo el cliente exitosamente";

    }
}
