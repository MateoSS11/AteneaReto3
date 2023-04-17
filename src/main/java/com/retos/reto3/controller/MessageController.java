package com.retos.reto3.controller;

import com.retos.reto3.dbo.GamaDbo;
import com.retos.reto3.dbo.MessageDbo;
import com.retos.reto3.model.GamaModel;
import com.retos.reto3.model.MessageModel;
import com.retos.reto3.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Message")
public class MessageController {
    @Autowired
    MessageService messageService;

    @GetMapping("/all")
    public List<MessageModel> obtener(){
        return messageService.obtener();

    }
    //Todo: corregir error DBO
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public String crear(@RequestBody MessageModel message){
        return messageService.crear(message);
    }
}
