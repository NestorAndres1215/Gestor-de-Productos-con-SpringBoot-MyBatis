 package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Categoria;
import com.example.service.CategoriaService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    // Lista todas las categorías
    @GetMapping
    public List<Categoria> listarCategorias() {
        return categoriaService.listarTodasCategorias();
    }

    // Obtiene una categoría por su ID
    @GetMapping("/{id}")
    public Categoria obtenerPorId(@PathVariable int id) {
        return categoriaService.obtenerCategoriaPorId(id);
    }

    // Agrega una nueva categoría
    @PostMapping("/agregar")
    public void agregar(@RequestBody Categoria categoria) {
        categoriaService.agregarCategoria(categoria);
    }

    // Elimina una categoría por su ID
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable int id) {
        categoriaService.eliminarCategoria(id);
    }

    // Actualiza una categoría existente
    @PostMapping("/actualizar")
    public void actualizar(@RequestBody Categoria categoria) {
        categoriaService.actualizarCategoria(categoria);
    }
}
