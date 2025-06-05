package com.example.service;

import com.example.mapper.ProductoMapper;
import com.example.model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoMapper productoMapper;

    public ProductoService(ProductoMapper productoMapper) {
        this.productoMapper = productoMapper;
    }

    public List<Producto> obtenerTodos() {
        return productoMapper.findAll();
    }

    public Producto obtenerPorId(int id) {
        return productoMapper.findById(id);
    }

    public void agregar(Producto producto) {
        productoMapper.insert(producto);
    }

    public void eliminar(int id) {
        productoMapper.delete(id);
    }

    public void actualizar(Producto producto) {
        productoMapper.update(producto);
    }

    public List<Producto> buscarPorNombre(String nombre) {
        return productoMapper.findByName(nombre);
    }
}