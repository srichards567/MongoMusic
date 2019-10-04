package com.example.mongomusic.repository;

import com.example.mongomusic.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends MongoRepository <Song, String> {
}
