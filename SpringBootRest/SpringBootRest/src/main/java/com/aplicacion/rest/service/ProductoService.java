package com.aplicacion.rest.service;

import com.aplicacion.rest.models.Producto;
import com.aplicacion.rest.persistence.IProductoDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final IProductoDAO productoDAO;

    public ProductoService(IProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }

    public Producto save(Producto producto) {
        return productoDAO.save(producto);
    }

    public Producto findById(Long id) {
        return productoDAO.findById(id);
    }

    public List<Producto> findAll() {
        return productoDAO.findAll();
    }

    public void delete(Long id) {
        productoDAO.delete(id);
    }

    public List<Producto> findByCreadorId(Long creadorId) {
        return productoDAO.findByCreadorId(creadorId);
    }
}
