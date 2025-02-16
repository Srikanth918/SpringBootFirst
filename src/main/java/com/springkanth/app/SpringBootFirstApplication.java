package com.springkanth.app;

import com.springkanth.app.model.Laptop;
import com.springkanth.app.model.alien;
import com.springkanth.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {

//		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class);

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);



//		alien obj = context.getBean(alien.class);
//		System.out.println(obj.getAge());
//		obj.code();

	}

}
