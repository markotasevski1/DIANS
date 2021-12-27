package com.example.diansjava.controller;

import com.example.diansjava.model.Kafic;
import com.example.diansjava.service.KaficService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class KaficController {
    private final KaficService kaficService;

    public KaficController(KaficService kaficService) {
        this.kaficService = kaficService;

    }
  /*  @GetMapping()
    private String findAll(@PathVariable String type)
    {
        return "barPage";
       return this.kaficService.findAll(type);
    } */
    @GetMapping()
    private String findAll()
    {
        return "barPage";
        //  return this.kaficService.findAll(type);
    }
}
