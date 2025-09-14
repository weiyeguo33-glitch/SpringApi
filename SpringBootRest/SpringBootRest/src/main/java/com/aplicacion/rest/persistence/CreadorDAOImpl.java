// IMPLEMENTACIÓN DE CREADOR DAO
package com.aplicacion.rest.persistence;

import com.aplicacion.rest.models.Creador;
import com.aplicacion.rest.persistence.ICreadorDAO;
import com.aplicacion.rest.repository.CreadorRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CreadorDAOImpl implements ICreadorDAO {

    private final CreadorRepository creadorRepository;

    public CreadorDAOImpl(CreadorRepository creadorRepository) {
        this.creadorRepository = creadorRepository;
    }

    @Override
    public Creador save(Creador creador) {
        return creadorRepository.save(creador);
    }

    @Override
    public Creador findById(Long id) {
        return creadorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Creador> findAll() {
        return creadorRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        creadorRepository.deleteById(id);
    }
}
