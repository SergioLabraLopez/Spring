package com.ejemplo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonaRepository extends MongoRepository<Persona, String> {
    // Puedes agregar consultas personalizadas si es necesario
}
