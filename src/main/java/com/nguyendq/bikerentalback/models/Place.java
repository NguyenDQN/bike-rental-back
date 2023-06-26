package com.nguyendq.bikerentalback.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Place {
    private String label;
    private int id;
}
