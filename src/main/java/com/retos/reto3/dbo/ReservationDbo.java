package com.retos.reto3.dbo;

import com.retos.reto3.model.CarModel;
import com.retos.reto3.model.ClientModel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

public class ReservationDbo {
    private int idReservation;
    private Date startDate;
    private Date devolutionDate;
    private CarModel car;
    private ClientModel client;
}
