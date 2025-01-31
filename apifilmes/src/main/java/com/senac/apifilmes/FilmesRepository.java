package com.senac.apifilmes;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmesRepository extends MongoRepository<filmes, ObjectId> {

}
