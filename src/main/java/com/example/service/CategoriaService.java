package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.CategoriaMapper;
import com.example.model.Categoria;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaMapper categoriaMapper;

    // Metodo para listar todas as categorias
    public List<Categoria> listarTodasCategorias() {
        return categoriaMapper.findAll();
    }

    // Metodo para obtener una categoria por su ID
    public Categoria obtenerCategoriaPorId(int id) {
        return categoriaMapper.findById(id);
    }

    // Metodo para agregar una nueva categoria
    public void agregarCategoria(Categoria categoria) {
        categoriaMapper.insert(categoria);
    }

    // Metodo para eliminar una categoria por su ID
    public void eliminarCategoria(int id) {
        categoriaMapper.delete(id);
    }

    // Metodo para actualizar una categoria existente
    public void actualizarCategoria(Categoria categoria) {
        categoriaMapper.update(categoria);
    }
}
