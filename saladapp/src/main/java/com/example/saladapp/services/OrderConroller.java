package com.example.saladapp.services;

import jakarta.validation.Valid;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.stereotype.Controller;

//import com.example.saladapp.SaladOrder;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("tacoOrder")
public class OrderConroller {
    @GetMapping("/current")
    public String orderForm(){
        return "orderForm";
    }

    @PostMapping
    public String processOrder(
            @Valid SaladOrder order, Errors errors, SessionStatus sessionStatus
    ){
        if (errors.hasErrors()){
            return "orderForm";
        }

        log.info("Order submitted {}", order);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}

