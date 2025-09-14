package com.aplicacion.rest.repository;

import com.aplicacion.rest.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    // Buscar productos por nombre exacto
    List<Producto> findByNombre(String nombre);

    // Buscar productos por nombre parcial (ignora mayúsculas/minúsculas)
    List<Producto> findByNombreContainingIgnoreCase(String nombre);

    // Buscar productos por id del creador
    List<Producto> findByCreadorId(Long creadorId);

    // Buscar productos cuyo precio esté en un rango
    List<Producto> findByPrecioBetween(BigDecimal min, BigDecimal max);

    // Buscar productos más baratos que un valor
    List<Producto> findByPrecioLessThan(BigDecimal precio);

    // Buscar productos más caros que un valor
    List<Producto> findByPrecioGreaterThan(BigDecimal precio);
}
