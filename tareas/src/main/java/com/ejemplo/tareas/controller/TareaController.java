package com.ejemplo.tareas.controller;

import com.ejemplo.tareas.model.Tarea;
import com.ejemplo.tareas.repository.TareaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    private final TareaRepository tareaRepository;

    public TareaController(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    @GetMapping
    public List<Tarea> listarTareas() {
        return tareaRepository.findAll();
    }

    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable String id) {
        tareaRepository.deleteById(id);
    }
}
