package com.example.LinkedList;


public class Logic {

    //Cada objeto de la clase Logic representa un nodo (Logic = nodo)

    //Atributos
    String dato;
    Logic siguiente; //PUNTERO

    //Constructor
    public Logic(String data, Logic sig){
        dato = data;
        siguiente = sig;
    }


}
