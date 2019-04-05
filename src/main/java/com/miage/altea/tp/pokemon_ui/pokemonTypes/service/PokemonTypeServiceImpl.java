package com.miage.altea.tp.pokemon_ui.pokemonTypes.service;

import com.miage.altea.tp.pokemon_ui.pokemonTypes.bo.PokemonType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


import java.util.Arrays;
import java.util.List;

@Service
public class PokemonTypeServiceImpl implements PokemonTypeService {
    private RestTemplate restTemplate;
    private String pokemonServiceUrl;
    private Arrays pokeType;



    public List<PokemonType> listPokemonsTypes() {
        var poke = restTemplate.getForObject(pokemonServiceUrl+"/pokemon-types/",PokemonType[].class);
        return pokeType.asList(poke);

    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate=restTemplate;
    }

    @Value("${pokemonType.service.url}")
    public void setPokemonTypeServiceUrl(String pokemonServiceUrl) {
        this.pokemonServiceUrl = pokemonServiceUrl;
    }
}
