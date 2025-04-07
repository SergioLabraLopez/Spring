package com.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    // Crear o actualizar persona
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    // Obtener todas las personas
    public List<Persona> obtenerTodasLasPersonas() {
        return personaRepository.findAll();
    }

    // Obtener persona por ID
    public Optional<Persona> obtenerPersonaPorId(String id) {
        return personaRepository.findById(id);
    }

    // Eliminar persona por ID
    public void eliminarPersona(String id) {
        personaRepository.deleteById(id);
    }
}
