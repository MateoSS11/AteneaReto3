package com.retos.reto3.dbo;

import com.retos.reto3.model.GamaModel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class CarDbo {
    private int idCar;

    private String name;

    private String brand;

    private int year;

    private String description;

    private GamaModel gama;
}
