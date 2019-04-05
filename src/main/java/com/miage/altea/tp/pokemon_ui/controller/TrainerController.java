package com.miage.altea.tp.pokemon_ui.controller;

import com.miage.altea.tp.pokemon_ui.trainers.service.TrainerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TrainerController {
    private TrainerService trainerService;
    @GetMapping("/trainers")
    public ModelAndView trainers() {



        var  model=  new ModelAndView("trainers");

        return model.addObject("trainers",trainerService.getTtrainers());
    }

    public void setTrainerService(TrainerService trainerService) {
        this.trainerService = trainerService;
    }
}
