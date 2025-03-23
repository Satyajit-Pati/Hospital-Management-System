package com.hms.controller;

import com.hms.entity.Doctor;
import com.hms.repository.DoctorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v4")
public class DoctorController {

    private DoctorRepository doctorRepository;

    public DoctorController(DoctorRepository doctorRepository) {
        super();
        this.doctorRepository = doctorRepository;
    }

    @PostMapping("/insert")
    public Doctor createDoctor(@RequestBody Doctor doctor){
        return doctorRepository.save(doctor);
    }

    @GetMapping
    public List<Doctor>getAllDoctor(){
        return doctorRepository.findAll();
    }
}
