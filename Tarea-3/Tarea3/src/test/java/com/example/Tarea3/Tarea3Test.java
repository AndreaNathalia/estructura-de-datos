package com.example.Tarea3;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

class Tarea3Test {

    @Test
    void pop(){
        ArrayList<String> banco = new ArrayList<>();
        ArrayList<String> bancoT = new ArrayList<>();
        bancoT.add("deposit 100");
        banco.add("withdraw 200");
        banco.add("deposit 100");
        assertThat(Tarea3.pop(banco), is (bancoT));
    }

    @Test
    void push(){
        ArrayList<String> banco = new ArrayList<>();
        ArrayList<String> bancoT = new ArrayList<>();
        bancoT.add("deposit 100");
        assertThat(Tarea3.push("deposit 100", banco), is (bancoT));
    }

    @Test
    void clear(){
        ArrayList<String> banco = new ArrayList<>();
        ArrayList<String> bancoT = new ArrayList<>();
        banco.add("deposit 100");
        banco.add("withdraw 200");
        banco.add("deposit 300");
        assertThat(Tarea3.clear(banco), is (bancoT));
    }



}
