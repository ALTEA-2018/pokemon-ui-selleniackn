package com.miage.altea.tp.pokemon_ui.trainers.service;

import com.miage.altea.tp.pokemon_ui.trainers.bo.Trainer;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public interface TrainerService {
    List<Trainer> getTtrainers();
    void setRestTemplate(RestTemplate restTemplate);

}
