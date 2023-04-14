package com.example.saladapp.services;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.HashMap;
//import com.example.saladapp.Ingredients;
//import com.example.saladapp.Ingredients.Type;


@Component
public class IngredientsConverter implements Converter<String, Ingredients>{

    private Map<String, Ingredients> ingredientMap = new HashMap<>();

    public IngredientsConverter() {
        ingredientMap.put("FLTO", new Ingredients("FLTO", "Flour Tortilla", Ingredients.Type.WRAP));
        ingredientMap.put("COTO", new Ingredients("COTO", "Corn Tortilla", Ingredients.Type.WRAP));
        ingredientMap.put("GRBF", new Ingredients("GRBF", "Ground Beef", Ingredients.Type.PROTEIN));
        ingredientMap.put("CARN", new Ingredients("CARN", "Carnitas", Ingredients.Type.VEGGIES));
    }

    @Override
    public Ingredients convert(String id){
        return ingredientMap.get(id);
    }

}