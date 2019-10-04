package com.example.mongomusic.repository;

import com.example.mongomusic.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    @Query(" {'userProfile.email' : ?0} ")
    public User findByEmail(String email);
}
