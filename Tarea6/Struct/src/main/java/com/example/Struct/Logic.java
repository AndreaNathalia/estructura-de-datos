package com.example.Struct;

public class Logic {
    //Atributos
    int CoordX;
    int CoordY;

    //Constructor (Struct)
    Logic(int x, int y){
        CoordX = x;
        CoordY = y;
    }

    //Método para verificar en que cuadrante está
    public static String verificarCuadrante(int x, int y){
        if(x >= 0 && y >= 0){
            return ("El punto está en el CUADRANTE 1" + Cuadrante1());

        }else if(x < 0 && y >= 0){
            return "El punto está en el CUADRANTE 2" + Cuadrante2();

        }else if(x < 0 && y < 0){
            return "El punto está en el CUADRANTE 3" +  Cuadrante3();

        }else if(x >= 0 && y < 0){
            return "El punto está en el CUADRANTE 4" + Cuadrante4();
        }

        return "hola";
    }

    //Métodos para mostrar graficamente donde está el punto

    //CUADRANTE 1
    public static String Cuadrante1(){

        return "\n\n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |       (+ , +)     \n" +
                "                   |       AQUÍ :)      \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "-------------------|-------------------\n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   ";
    }

    //CUADRANTE 2
    public static String Cuadrante2(){

        return "\n\n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "      (- , +)      |                   \n" +
                "      AQUÍ :)      |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "-------------------|-------------------\n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   ";

    }

    //CUADRANTE 3
    public static String Cuadrante3(){

        return "\n\n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "-------------------|-------------------\n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "      (- , -)      |                   \n" +
                "      AQUÍ :)      |                   \n" +
                "                   |                   \n" +
                "                   |                   ";

    }

    //CUADRANTE 4
    public static String Cuadrante4(){

        return "\n\n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "-------------------|-------------------\n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |                   \n" +
                "                   |      (+ , -)      \n" +
                "                   |      AQUÍ :)      \n" +
                "                   |                   \n" +
                "                   |                   ";

    }

}
