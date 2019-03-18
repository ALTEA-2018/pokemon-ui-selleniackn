package com.miage.altea.tp.pokemon_ui.controller;

import com.miage.altea.tp.pokemon_ui.pokemonTypes.service.PokemonTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PokemonTypeController {

    @PostMapping(value = "/pokedex")
    public ModelAndView pokedex(){

        return new ModelAndView("pokedex");

    }

    public void setPokemonTypeService(PokemonTypeService pokemonTypeService) {
    }
}