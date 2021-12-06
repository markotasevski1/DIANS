package com.example.diansjava.service;

import com.example.diansjava.model.Kafic;
import com.example.diansjava.repository.KaficRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaficService {
    private final KaficRepository kaficRepository;

    public KaficService(KaficRepository kaficRepository) {
        this.kaficRepository = kaficRepository;
    }
    public List<Kafic> findAll(String type)
    {
        return kaficRepository.findAll(type);
    }
}
