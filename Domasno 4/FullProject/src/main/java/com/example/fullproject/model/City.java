package com.example.fullproject.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
@Data
@Entity
public class City {
    @Id
    String name;
    private List<Bar> bars;
}
