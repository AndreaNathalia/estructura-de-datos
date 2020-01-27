package com.example.Tarea3;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class Main {

    //Lista
    ArrayList<String> banco = new ArrayList<>();

    @RequestMapping(value =  {"/push"})
    @ResponseBody
    public String enqueue(@RequestParam String var){
        Tarea3.push(var, banco);

        return ("¡Se ha añadido a la cola!");
    }

    @RequestMapping(value = {"/pop"})
    @ResponseBody
    public String dequeue(){
        Tarea3.pop(banco);

        return ("¡Se ha eliminado de la cola!");
    }

    @RequestMapping(value = {"/clear"})
    @ResponseBody
    public String clearbanco(){
        Tarea3.clear(banco);

        return ("¡Se ha vaciado la cola!");
    }

    @RequestMapping(value = {"/show"})
    @ResponseBody
    public ArrayList showbanco(){
        Tarea3.show(banco);

        return banco;
    }


}
