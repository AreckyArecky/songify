package com.songify.song.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SongViewController {

    Map<Integer, String> database = new HashMap<>();

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/view/songs")
    public String songs(Model model){
        database.put(1, "Bonobo - Kota");
        database.put(2, "Radiohead - Creep");
        database.put(3, "Pendulum - Blood Sugar");
        database.put(4, "Red Hot Chilli Peppers - Under The Bridge");

        model.addAttribute("songMap", database);
        return "songs";
    }
}
