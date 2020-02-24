package com.example.LinkedList;


public class Lista {
    //Declaración de variables
    private static int head = 0;
    private static int rear = 0;
    private static int size = 0;
    public static int contador;

    //Declaración del arreglo
    public static String PlayList[] = new String[size];


    //Método para agregar
    public static void add(String data){
        String aux[] = PlayList;

        size++;
        PlayList = new String[size];
        for(int i = 0; i < size -1; i++){
            PlayList[i] = aux[i];
        }

        PlayList[rear] = data;
        rear++;
    }


    //Método para Play Now (la primera en la lista)
    public static String PlayNow(){
        //contador = 0;
        if(head == rear){
            System.out.println("Your Play List is empty");
            return ("Your Play List is empty");

        }else{
            contador = 0;
            System.out.println(PlayList[contador]);
            return (PlayList[contador]);
        }

    }

    //Método para Play Next
    public static String PlayNext(){

        contador ++;
        //System.out.println(PlayList[contador]);
        return (PlayList[contador]);


    }

    //Método para Play Previous
    public static String PlayPrevious(){
        contador--;
        System.out.println(PlayList[contador]);
        return (PlayList[contador]);
    }

    //Método para listar las canciones
    public static StringBuffer ListSongs(){
        //Para poder mostrar la lista de canciones en el return:
        StringBuffer songs = new StringBuffer();

        //Agrego las canciones de la lista al SBuffer
        for(int s = 0; s < PlayList.length; s++){
            songs.append(PlayList[s]);
            songs.append("\n");
        }
        System.out.println(songs);

        return songs;
    }


    //---------------------------------------------------------------------------------------------------------------------------
    //Para saber/acceder a la cabeza y al final
    static Logic inicio;
    static Logic fin;
    static int contadorr = 0;
    static String playNow;


    //Constructor
    public Lista(){
        inicio = null;
        fin = null;

    }

    //Método para saber si está vacía
    public static boolean IsEmpty(){
        return inicio == null;
    }

    //Logic PlayList[];
    //Método para agregar (al inico)
    public static void Add(String data){

        if(IsEmpty()){
            inicio = new Logic(data, inicio);
            fin = inicio;

        }else {
            inicio = new Logic(data, inicio);
        }
    }

    //Método para play now
    public static String PlayNoww(){
        //contador ++;


        return "hola";

    }

}
