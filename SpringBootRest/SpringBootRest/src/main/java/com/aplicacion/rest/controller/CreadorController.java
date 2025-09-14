package com.aplicacion.rest.controller;

import com.aplicacion.rest.models.Creador;
import com.aplicacion.rest.service.CreadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/creadores")
public class CreadorController {

    private final CreadorService creadorService;

    public CreadorController(CreadorService creadorService) {
        this.creadorService = creadorService;
    }


    @PostMapping
    public ResponseEntity<Creador> crearCreador(@RequestBody Creador creador) {
        return ResponseEntity.ok(creadorService.save(creador));
    }


    @GetMapping
    public ResponseEntity<List<Creador>> listarCreadores() {
        return ResponseEntity.ok(creadorService.findAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Creador> obtenerCreador(@PathVariable Long id) {
        Creador creador = creadorService.findById(id);
        return (creador != null) ? ResponseEntity.ok(creador) : ResponseEntity.notFound().build();
    }


    @PutMapping("/{id}")
    public ResponseEntity<Creador> actualizarCreador(@PathVariable Long id, @RequestBody Creador creador) {
        Creador existente = creadorService.findById(id);
        if (existente == null) {
            return ResponseEntity.notFound().build();
        }
        creador.setId(id);
        return ResponseEntity.ok(creadorService.save(creador));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCreador(@PathVariable Long id) {
        creadorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
