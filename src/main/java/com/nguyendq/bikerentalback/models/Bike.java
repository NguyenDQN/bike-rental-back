package com.nguyendq.bikerentalback.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bike {
    private Long id;
    private String name;
    private Float price;
    private String city;
    private String description;

}
