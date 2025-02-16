package com.springkanth.app.service;

import com.springkanth.app.model.Laptop;
import com.springkanth.app.repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepo repo;

    public void addLaptop(Laptop lap) {
//        System.out.println("Method called");
        repo.save(lap);

    }

    public boolean isGoodForProg(Laptop lap){
        return true;
    }
}
