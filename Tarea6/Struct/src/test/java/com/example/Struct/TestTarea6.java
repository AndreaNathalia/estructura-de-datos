package com.example.Struct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTarea6 {

    @Test
    void verificarCuadrante1(){
        assertEquals(Logic.verificarCuadrante(4,6),"El punto está en el CUADRANTE 1" + Logic.Cuadrante1());
    }

    @Test
    void verificarCuadrante2(){
        assertEquals(Logic.verificarCuadrante(-10,3),"El punto está en el CUADRANTE 2" + Logic.Cuadrante2());
    }

    @Test
    void verificarCuadrante3(){
        assertEquals(Logic.verificarCuadrante(-3,-8),"El punto está en el CUADRANTE 3" + Logic.Cuadrante3());
    }

    @Test
    void verificarCuadrante4(){
        assertEquals(Logic.verificarCuadrante(45,-9),"El punto está en el CUADRANTE 4v" + Logic.Cuadrante4());
    }

}
