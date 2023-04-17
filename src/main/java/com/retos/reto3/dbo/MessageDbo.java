package com.retos.reto3.dbo;

import com.retos.reto3.model.CarModel;
import com.retos.reto3.model.ClientModel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class MessageDbo {
    private int idMessage;
    private String messageText;
    private CarModel car;
    private ClientModel client;
}
