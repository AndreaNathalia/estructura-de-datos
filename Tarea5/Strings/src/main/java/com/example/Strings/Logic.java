package com.example.Strings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

import java.util.Collections;

@Controller
public class Logic {

    @RequestMapping(value = {"/parrafo"})
    @ResponseBody
    //Método para verificar los polindromos
    public String verificar(@RequestParam String parrafo){

        //Lista: separa el parrafo en palabras y las guarda en la lista
        String PalabrasPorSeparado[] = parrafo.split(" ");

        //Imprime la 1era lista
        System.out.println("\nLISTA ORIGINAL:");
        for(int i = 0; i < PalabrasPorSeparado.length; i++){
            System.out.println(PalabrasPorSeparado[i]);

        }

        //Uso un SBuffer para poder darle vuelta a cada palabra
        StringBuffer NewlistB = new StringBuffer();

        //Agrego las palabras del parrafo al SBuffer
        for(int palabra = 0; palabra < PalabrasPorSeparado.length; palabra++){
            NewlistB.append(PalabrasPorSeparado[palabra]);
            NewlistB.append(" ");
        }

        //Le doy vuelta a las palabras
        NewlistB.reverse();

        //Convierto el SBuffer a String
        String listReverse = NewlistB.toString();

        //Creo una nueva lista y le agrego el string con las palabras al reves
        String NewList[] = listReverse.split(" ");


        //Ordeno los elementos de la lista (LISTA FINAL PARA COMPARAR CON LA ORIGINAL)
        String aux;
        for(int invert = 0; invert < NewList.length/2; invert++){
            aux = NewList[invert];
            NewList[invert] = NewList[NewList.length-1-invert];
            NewList[NewList.length-1-invert] = aux;
        }

        //Imprimo la lista final
        System.out.println("\nLISTA INVERTIDA:");
        for(int y = 0; y < NewList.length; y ++){
            System.out.println(NewList[y]);
        }

        //Comparo las listas para verificar si cada palabra es polindromo

        //Creo una lista para guardar las palabras que si son polindromos
        String polindromos[] = new String[PalabrasPorSeparado.length];
        //ArrayList<String> polindromos = new ArrayList<String>();
        int contador = 0;
        int posicion = 0;
        for(int normal = 0; normal < PalabrasPorSeparado.length; normal++){
            for(int invertida = 0; invertida < NewList.length; invertida++){
                if(PalabrasPorSeparado[normal].equals(NewList[invertida])){
                    polindromos[posicion] = PalabrasPorSeparado[normal];
                    posicion++;
                    contador++;
                }
            }
        }

        String NewContador = Integer.toString(contador);

        //Imprimo los que si son
        System.out.println("POLINDROMOS:");
        for (int show = 0; show < polindromos.length; show++){
            System.out.println(polindromos[show]);
        }
        System.out.println("Cantidad de palabras Políndromos: " + NewContador);


        //Para poder mostrar la lista de polindromos en el return:
        StringBuffer palabras = new StringBuffer();

        //Agrego las palabras de la lista al SBuffer
        for(int r = 0; r < polindromos.length; r++){
            palabras.append(polindromos[r]);
            palabras.append(", ");
        }


        return "Texto: " + parrafo  + "\nCantidad de políndromos en el texto: " + NewContador  + "\nPolíndromos: " + palabras;
    }

    @RequestMapping(value = {"/csv"})
    @ResponseBody
    //Método para verificar los polindromos
    public String csv(@RequestParam String palabras){

        //Lista: separa el parrafo en palabras y las guarda en la lista
        String listaCSV[] = palabras.split(" ");

        //Imprime la 1era lista
        System.out.println("\nLISTA ORIGINAL:");
        for(int i = 0; i < listaCSV.length; i++){
            System.out.println(listaCSV[i]);

        }

        //Uso un SBuffer para poder darle vuelta a cada palabra
        StringBuffer NewlistBuf = new StringBuffer();

        //Agrego las palabras del parrafo al SBuffer
        for(int palabra = 0; palabra < listaCSV.length; palabra++){
            NewlistBuf.append(listaCSV[palabra]);
            NewlistBuf.append(" ");
        }

        //Le doy vuelta a las palabras
        NewlistBuf.reverse();

        //Convierto el SBuffer a String
        String listReverse = NewlistBuf.toString();

        //Creo una nueva lista y le agrego el string con las palabras al reves
        String NewList[] = listReverse.split(" ");


        //Ordeno los elementos de la lista (LISTA FINAL PARA COMPARAR CON LA ORIGINAL)
        String aux;
        for(int invert = 0; invert < NewList.length/2; invert++){
            aux = NewList[invert];
            NewList[invert] = NewList[NewList.length-1-invert];
            NewList[NewList.length-1-invert] = aux;
        }

        //Imprimo la lista final
        System.out.println("\nLISTA INVERTIDA:");
        for(int y = 0; y < NewList.length; y ++){
            System.out.println(NewList[y]);
        }

        //Comparo las listas para verificar si cada palabra es polindromo

        //Creo una lista para guardar las palabras que si son polindromos
        String polindromos[] = new String[listaCSV.length];
        String NoPolindromos[] = new String[65];
        int contador = 0;
        int posicion = 0;
        int contadorNo = 0;
        int posisionNo = 0;
        for(int normal = 0; normal < listaCSV.length; normal++){
            for(int invertida = 0; invertida < NewList.length; invertida++){
                if(listaCSV[normal].equals(NewList[invertida])){
                    polindromos[posicion] = listaCSV[normal];
                    posicion++;
                    contador++;
                }else {
                    NoPolindromos[posisionNo] = listaCSV[normal];
                    posisionNo++;
                    contadorNo++;
                }
            }
        }

        //Imprimo los que si son
        System.out.println("POLINDROMOS:");
        for (int show = 0; show < polindromos.length; show++){
            System.out.println(polindromos[show]);
        }

        //Imprimo los que no son
        System.out.println("\nNO POLINDROMOS");
        for(int no = 0; no < NoPolindromos.length; no++){
            System.out.println(NoPolindromos[no]);
        }

        String NewContador = Integer.toString(contador);
        System.out.println("Cantidad de palabras Políndromos: " + NewContador);

        //Los que no son
        int ContadorNoP = polindromos.length - contador;
        String Contadorstr = Integer.toString(ContadorNoP);
        System.out.println("Cantidad de palabras NO Políndromos: " + Contadorstr);

        //Para poder mostrar la lista de polindromos en el return:
        StringBuffer palabras_si = new StringBuffer();


        //Agrego las palabras de la lista al SBuffer
        for(int r = 0; r < polindromos.length; r++){
            palabras_si.append(polindromos[r]);
            palabras_si.append(", ");
        }

        return "Lista CSV: " + palabras  + "\nCantidad de NO políndromos en el texto: " + Contadorstr;

    }

}
