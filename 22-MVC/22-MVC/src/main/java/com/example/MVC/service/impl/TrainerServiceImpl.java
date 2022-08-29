package com.example.MVC.service.impl;

import com.example.MVC.model.Trainer;
import com.example.MVC.service.ITrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements ITrainerService {


    @Override
    public List<Trainer> trainers() {
        return Arrays.asList(new Trainer("Marcos"), new Trainer("Ana"));
    }
}
