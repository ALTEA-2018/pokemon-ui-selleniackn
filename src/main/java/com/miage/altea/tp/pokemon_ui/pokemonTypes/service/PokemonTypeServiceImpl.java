package com.miage.altea.tp.pokemon_ui.pokemonTypes.service;

import com.miage.altea.tp.pokemon_ui.pokemonTypes.bo.PokemonType;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

// TODO
public class PokemonTypeServiceImpl implements PokemonTypeService {

    public List<PokemonType> listPokemonsTypes() {
        // TODO
    }

    void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;}

    void setPokemonTypeServiceUrl(String pokemonServiceUrl) {
        // TODO
    }
}
// TODO
public class PokemonTypeController {

    // TODO
    public ModelAndView pokedex(){
        // TODO
    }

}