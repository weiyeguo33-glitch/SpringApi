package com.aplicacion.rest.persistence;

import com.aplicacion.rest.models.Producto;

import com.aplicacion.rest.repository.ProductoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductoDAOImpl implements IProductoDAO {

    private final ProductoRepository productoRepository;

    public ProductoDAOImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto findById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public List<Producto> findByCreadorId(Long creadorId) {
        return productoRepository.findByCreadorId(creadorId);
    }
}
