package com.aplicacion.rest.repository;

import com.aplicacion.rest.models.Creador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreadorRepository extends JpaRepository<Creador, Long> {

    // Buscar por nombre exacto
    List<Creador> findByNombre(String nombre);

    // Buscar por nombre que contenga una cadena (case-insensitive)
    List<Creador> findByNombreContainingIgnoreCase(String nombre);

    // Verificar si ya existe un creador con un nombre dado
    boolean existsByNombre(String nombre);
}
