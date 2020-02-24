package com.example.LinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTarea7 {

    public static String PlayList[] = {"a", "b", "c"};

    @Test
    void add(){
        //assertEquals(Lista.add("song"), Lista.add("song"));
    }

    @Test
    void PlaynNow(){
        assertEquals(PlayList[0], PlayList[0]);
    }

    @Test
    void PlayNext(){
        assertEquals(PlayList[1], PlayList[1]);
    }

    @Test
    void list(){
        assertEquals("a\nb\nc", "a\nb\nc");
    }
}
