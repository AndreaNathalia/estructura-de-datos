package com.example.queue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Main {
    //Declaración de variables
    //String banco[] = new String[0];
   // String banco[];

    //Objeto
    //Queue fila = new Queue(5);

    //Método para hacer push (añadir un elemento a la cola)
    @RequestMapping(value = {"/push"})
    @ResponseBody
    public String enqueue(@RequestParam String data){
        Queue.push(data);

        return ("¡Se ha añadido a la cola!");
    }

    //Método para hacer pop (eleminar un elemento)
    @RequestMapping(value = {"/pop"})
    @ResponseBody
    public String dequeue(){
        Queue.pop();

        return ("¡Se ha eliminado de la cola!");
    }

    //Método para vaciar la cola
    @RequestMapping(value = {"/clear"})
    @ResponseBody
    public String clear(){

        return ("¡Se ha vaciado la lista");
    }


    //Método para mostrar el arreglo
    @RequestMapping(value = {"/show"})
    @ResponseBody
    public String[] show(){
        Queue.show();
        //Queue.show(banco);
        //return ("banco");

        return (Queue.banco);
    }



}
