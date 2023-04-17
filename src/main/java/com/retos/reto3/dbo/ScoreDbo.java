package com.retos.reto3.dbo;

import com.retos.reto3.model.CarModel;
import com.retos.reto3.model.ClientModel;
import com.retos.reto3.model.ReservationModel;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Date;

public class ScoreDbo {
    private int idScore;
    private float value;
    private ReservationModel reservation;
}
