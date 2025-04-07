package com.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    // Crear una persona
    @PostMapping
    public Persona crearPersona(@RequestBody Persona persona) {
        return personaService.crearPersona(persona);
    }

    // Obtener todas las personas
    @GetMapping
    public List<Persona> obtenerTodasLasPersonas() {
        return personaService.obtenerTodasLasPersonas();
    }

    // Obtener persona por ID
    @GetMapping("/{id}")
    public Optional<Persona> obtenerPersona(@PathVariable String id) {
        return personaService.obtenerPersonaPorId(id);
    }

    // Eliminar persona por ID
    @DeleteMapping("/{id}")
    public void eliminarPersona(@PathVariable String id) {
        personaService.eliminarPersona(id);
    }
}
