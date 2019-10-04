package com.example.mongomusic.service;

import com.example.mongomusic.model.Song;

import java.util.List;

public interface SongService {
    public Song saveSong(Song song);

    public List<Song> listSongs();
}
