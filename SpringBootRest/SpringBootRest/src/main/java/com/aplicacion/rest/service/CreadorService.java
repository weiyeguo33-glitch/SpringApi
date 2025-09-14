package com.aplicacion.rest.service;

import com.aplicacion.rest.models.Creador;
import com.aplicacion.rest.persistence.ICreadorDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreadorService {

    private final ICreadorDAO creadorDAO;

    public CreadorService(ICreadorDAO creadorDAO) {
        this.creadorDAO = creadorDAO;
    }

    public Creador save(Creador creador) {
        return creadorDAO.save(creador);
    }

    public Creador findById(Long id) {
        return creadorDAO.findById(id);
    }

    public List<Creador> findAll() {
        return creadorDAO.findAll();
    }

    public void delete(Long id) {
        creadorDAO.delete(id);
    }
}
