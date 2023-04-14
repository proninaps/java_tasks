package com.example.saladapp.services;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

//import com.example.saladapp.Ingredients;
//import com.example.saladapp.Salad;
//import com.example.saladapp.SaladOrder;
//import com.example.saladapp.Ingredients.Type;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

import org.springframework.validation.Errors;

@Slf4j
@Controller
@SessionAttributes("saladOrder")
@RequestMapping("/design")
public class DesignSaladController {

    @ModelAttribute
    public void addIngredientsToModel(Model model){
        List<Ingredients> ingredients = Arrays.asList(
                new Ingredients("LVS", "Lettuce Leaves", Ingredients.Type.WRAP),
                new Ingredients("BNS", "Beans", Ingredients.Type.WRAP),
                new Ingredients("MEAT", "Meat", Ingredients.Type.PROTEIN),
                new Ingredients("VEG", "Vegitables", Ingredients.Type.VEGGIES)

        );
        Ingredients.Type[] types = Ingredients.Type.values();
        for(Ingredients.Type type: types){
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients, type));
        }
    }

    @ModelAttribute(name="tacoOrder")
    public SaladOrder order(){
        return new SaladOrder();
    }

    @ModelAttribute(name="taco")
    public Salad salad(){
        return new Salad();
    }

    private Iterable<Ingredients> filterByType(
            List<Ingredients> ingredients, Ingredients.Type type
    ){
        return ingredients.stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }

    @PostMapping
    public String processSalad(
            @Valid Salad salad, Errors errors, @ModelAttribute SaladOrder saladOrder
    ){
        if (errors.hasErrors()){
            return "design";
        }
        saladOrder.addSalad(salad);
        log.info("Processing taco: {}", salad);
        return "redirect:/orders/current";
    }

    @GetMapping
    public String showDesignForm(){
        return "design";
    }
}
