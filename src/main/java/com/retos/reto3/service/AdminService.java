package com.retos.reto3.service;

import com.retos.reto3.model.AdminModel;
import com.retos.reto3.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;
    public List<AdminModel> obtener(){
        return adminRepository.findAll();

    }

    public String crear(AdminModel admin){
        adminRepository.save(admin);
        return "Se creo el usuario exitosamente";

    }
}
