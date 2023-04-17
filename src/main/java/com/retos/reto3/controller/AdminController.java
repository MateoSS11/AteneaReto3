package com.retos.reto3.controller;

import com.retos.reto3.dbo.AdminDbo;
import com.retos.reto3.model.AdminModel;
import com.retos.reto3.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping("/all")
    public List<AdminModel> obtener(){
        return adminService.obtener();

    }
    //Todo: corregir error DBO
    @PostMapping("/save")
    public String crear(@RequestBody AdminModel admin){
        return adminService.crear(admin);

    }
}
