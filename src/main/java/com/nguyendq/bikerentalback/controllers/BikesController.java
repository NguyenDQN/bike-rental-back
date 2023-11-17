package com.nguyendq.bikerentalback.controllers;

import com.nguyendq.bikerentalback.models.Bike;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class BikesController {
    @CrossOrigin(origins = "*")
    @GetMapping("/bikes")
    public List<Bike> getBikes() throws Exception {
        log.info("Getting bikes from server: {}", InetAddress.getLocalHost().getHostName());
        Bike bike = Bike.builder().id(1L).name("Wave @").price(100f).build();
        Bike bike2 = Bike.builder().id(2L).name("Air blade").price(150f).build();
        Bike bike3 = Bike.builder().id(3L).name("Exciter").price(150f).build();
        Bike bike4 = Bike.builder().id(4L).name("Vision").price(150f).build();
        Bike bike5 = Bike.builder().id(5L).name("Blade v2").price(150f).build();
        return Arrays.asList(bike, bike2, bike3, bike4, bike5);
    }
}
