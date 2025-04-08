package com.ejemplo.tareas.repository;

import com.ejemplo.tareas.model.Tarea;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TareaRepository extends MongoRepository<Tarea, String> {
}
