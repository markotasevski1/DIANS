package com.example.fullproject.service;

import com.example.fullproject.Repository.CityRepository;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    public CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
}
