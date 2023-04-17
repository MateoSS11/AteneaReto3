package com.retos.reto3.service;

import com.retos.reto3.model.GamaModel;
import com.retos.reto3.model.MessageModel;
import com.retos.reto3.repository.GamaRepository;
import com.retos.reto3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;
    public List<MessageModel> obtener(){
        return messageRepository.findAll();

    }

    public String crear(MessageModel message){
        messageRepository.save(message);
        return "Se creo el mensaje exitosamente";

    }
}
