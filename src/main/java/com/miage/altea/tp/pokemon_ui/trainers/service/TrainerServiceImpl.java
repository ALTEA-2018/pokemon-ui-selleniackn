package com.miage.altea.tp.pokemon_ui.trainers.service;

import com.miage.altea.tp.pokemon_ui.pokemonTypes.bo.PokemonType;
import com.miage.altea.tp.pokemon_ui.trainers.bo.Trainer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public  abstract class TrainerServiceImpl implements TrainerService {
    private RestTemplate restTemplate;
    private String trainerServiceUrl;
    private Arrays trainers;
    private TrainerService trainerService;

    public List<Trainer> getTrainers() {

        var trainer = restTemplate.getForObject(trainerServiceUrl+"/trainers/", Trainer[].class);
        return trainers.asList(trainer);

    }


    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate=restTemplate;
    }

    @Value("${trainer.service.url}")
    public void setPokemonTypeServiceUrl(String trainerServiceUrl) {
        this.trainerServiceUrl = trainerServiceUrl;
    }

}
