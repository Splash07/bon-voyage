package com.dylan.bonvoyage;

import com.dylan.bonvoyage.manager.api.CreateHotelDTO;
import com.dylan.bonvoyage.manager.internal.service.HotelService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BonVoyageApplication {

    public static void main(String[] args) {
        SpringApplication.run(BonVoyageApplication.class, args);
    }
}
