package com.retos.reto3.service;

import com.retos.reto3.model.AdminModel;
import com.retos.reto3.model.CarModel;
import com.retos.reto3.repository.AdminRepository;
import com.retos.reto3.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;
    public List<CarModel> obtener(){
        return carRepository.findAll();

    }

    public String crear(CarModel car){
        carRepository.save(car);
        return "Se creo el carro exitosamente";

    }
}
