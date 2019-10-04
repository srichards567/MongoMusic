package com.example.mongomusic.controller;

import com.example.mongomusic.model.Song;
import com.example.mongomusic.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/song")
public class SongController {

    @Autowired
    SongService songService;

    @GetMapping("/list")
    public List<Song> listSongs() {
        return songService.listSongs();
    }

    @PostMapping
    public Song saveSong(@RequestBody Song song) {
        return songService.saveSong(song);
    }
}
