package com.example.fullproject.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
public class Bar {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;


}
