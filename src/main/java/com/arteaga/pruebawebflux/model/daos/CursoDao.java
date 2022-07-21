package com.arteaga.pruebawebflux.model.daos;

import com.arteaga.pruebawebflux.model.documents.Curso;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoDao extends ReactiveMongoRepository <Curso, String> {
}
