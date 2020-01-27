package com.example.Tarea3;

import java.util.ArrayList;


public class Tarea3 {


    //Método dequeue para eliminar un elemento
    public static ArrayList pop(ArrayList banco){
        banco.remove(0);
        System.out.println(banco);

        return banco;
    }

    //Método enqueue para añadir un elemento
    public static ArrayList push(String op, ArrayList banco){
        banco.add(op);

        return banco;
    }

    //Método clear para vacíar la lista
    public static ArrayList clear(ArrayList banco){
        banco.clear();

        return banco;
    }

    //Método show para mostrar la lista
    public static ArrayList show(ArrayList banco){
        return banco;
    }

}
