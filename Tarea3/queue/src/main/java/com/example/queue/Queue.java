package com.example.queue;

public class Queue {

    public static String[] lista(int capacidad){
        String banco_no[] = new String[capacidad];

        return banco_no;

    }

    //Declaración de variables
    public static int capacidad = 0;
    static int tail = 0;
    public static String banco[] = lista(capacidad);


    //static int head = 0;
    //static int size = 0;

    //Queue(){
        //this.capacidad = sizeOfQueue;
        //sizeOfQueue = 5;
        //head = 0;
      //  tail = -1;
        //banco = new String[this.capacidad];
    //}


    //-----------------------------------------
    //private int size;
    //private int head;
    //private int tail;
    //-----------------------------------------


    //Método para agregar elementos al array
    public static void push(String data){

        String banco_OtraVezNo[] = banco;
        capacidad++;
        banco = new String[capacidad];

        for(int x = 0; x <= capacidad-2 ;x++){
            banco[x] = banco_OtraVezNo[x];

        }

        banco[tail] = data;
        tail++;

    }

    //Método para eliminar elementos del array
    public static void pop(){
        int head = 0;
        for(int i = 0; i < (banco.length - 1); i++){
            banco[i] = banco[i+1];
        }

        banco[banco.length - 1] = null;
    }

    public static String[] show(){

        String pretyprint = "";
       for(int i = 0; i < banco.length; i ++){
           pretyprint = banco[i];
            //System.out.println(banco[i] + "\n");
        }

        return (banco);
    }
}
