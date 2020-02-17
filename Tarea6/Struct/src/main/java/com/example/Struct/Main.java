package com.example.Struct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
    @RequestMapping(value = {"/punto"})
    public String main (@RequestParam int x, int y){
        //Creo el punto
        Logic punto = new Logic(x, y);

        //Verifico el cuadrante
        Logic.verificarCuadrante(x, y);

        return Logic.verificarCuadrante(x,y);
    }
}
