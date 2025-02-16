package com.springkanth.app.repo;

import com.springkanth.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {

    public void save(Laptop lap){

        System.out.println("saved in the Database...");

    }


}
