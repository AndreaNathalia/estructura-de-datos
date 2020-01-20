package com.example.tarea1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Tarea1 {

    @RequestMapping("/")
    public static String index(){

        //Objeto para leer
        //Scanner leer = new Scanner(System.in);

        System.out.println("\n ----- Suma de los primeros N números (ej.1) ----- \n");

        //Declaración de variables
        int n, i, suma;

        //Input del número
        //System.out.println("Ingrese un número: ");
        n = 10;

        //for para ir sumando los números
        suma = 0;
        for (i = 0; i <= n; i ++){
            suma = suma + i;
        }
        System.out.println("SUMA = " + suma);

        //Parcear el resultado de la suma a String para poder retornarlo
        String sumastr = Integer.toString(suma);
        String nstr = Integer.toString(n);

        return ("Ejercicio 1: N = " + nstr + "  SUMA = " + sumastr);

    }

    //public static void main(String[] args){
      //  index();
    //}
}
