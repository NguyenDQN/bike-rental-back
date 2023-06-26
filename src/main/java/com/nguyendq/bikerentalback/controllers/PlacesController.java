package com.nguyendq.bikerentalback.controllers;

import com.nguyendq.bikerentalback.models.Bike;
import com.nguyendq.bikerentalback.models.Place;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PlacesController {
    @CrossOrigin(origins = "*")
    @GetMapping("/places")
    public List<Place> getPlaces() {
        Place place = Place.builder().id(1).label("Hue").build();
        Place place2 = Place.builder().id(1).label("HCM").build();
        return Arrays.asList(place, place2);
    }
}
