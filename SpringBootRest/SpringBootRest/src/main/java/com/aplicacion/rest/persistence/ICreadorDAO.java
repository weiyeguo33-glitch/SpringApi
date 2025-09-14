package com.aplicacion.rest.persistence;

import com.aplicacion.rest.models.Creador;
import java.util.List;

public interface ICreadorDAO {
    Creador save(Creador creador);
    Creador findById(Long id);
    List<Creador> findAll();
    void delete(Long id);
}
