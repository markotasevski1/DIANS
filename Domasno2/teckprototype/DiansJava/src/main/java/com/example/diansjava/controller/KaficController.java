package com.example.diansjava.controller;

import com.example.diansjava.model.Kafic;
import com.example.diansjava.service.KaficService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class KaficController {
    private final KaficService kaficService;

    public KaficController(KaficService kaficService) {
        this.kaficService = kaficService;

    }
    @GetMapping("/{type}")
    private List<Kafic> findAll(@PathVariable String type)
    {
        return this.kaficService.findAll(type);
    }
}
