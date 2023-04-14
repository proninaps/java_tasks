package com.example.saladapp.services;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Salad {
    @NotNull //анотация это поле не может быть null
    @Size(min=5, message="Хотя бы 5 символов")
    private String name;

//    @NotNull
//    @Size(min=1)
//    private List<Ingredient> ingredients;
//
//}
}
