package com.aplicacion.rest.persistence;

import com.aplicacion.rest.models.Producto;
import java.util.List;

public interface IProductoDAO {
    Producto save(Producto producto);
    Producto findById(Long id);
    List<Producto> findAll();
    void delete(Long id);
    List<Producto> findByCreadorId(Long creadorId);
}
