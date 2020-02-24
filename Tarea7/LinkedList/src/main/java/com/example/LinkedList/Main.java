package com.example.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    @RequestMapping(value = {"/add"})
    @ResponseBody
    public String add(@RequestParam String data){
        Lista.add(data);

        return ("Added to your PlayList!");
    }

    @RequestMapping(value = {"/playnow"})
    @ResponseBody
    public String PlayNow(){
        Lista.PlayNow();

        return Lista.PlayNow();
    }

    @RequestMapping(value = {"/playnext"})
    @ResponseBody
    public String PlayNext(){
        Lista.PlayNext();

        return Lista.PlayNext();
    }

    @RequestMapping(value = {"/playprev"})
    @ResponseBody
    public String PlayPrev(){
        Lista.PlayPrevious();

        return Lista.PlayPrevious();
    }

    @RequestMapping(value = {"/list"})
    @ResponseBody
    public StringBuffer ListS(){
        Lista.ListSongs();

        return Lista.ListSongs();
    }

}
