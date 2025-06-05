package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Producto;
import com.example.service.ProductoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    // Aqui puedes agregar los endpoints para manejar las operaciones CRUD de
    // productos

    // lista todos los productos
    @GetMapping
    public List<Producto> listar() {
        return productoService.obtenerTodos();
    }

    // Obtiene un producto por su ID
    @GetMapping("/{id}")
    public Producto obtenerPorId(int id) {
        return productoService.obtenerPorId(id);
    }

    // Agrega un nuevo producto
    @PostMapping("/agregar")
    public void agregar(@RequestBody Producto producto) {
        productoService.agregar(producto);
    }

    // Elimina un producto por su ID
    @DeleteMapping("/eliminar")
    public void eliminar(int id) {
        productoService.eliminar(id);
    }

    // Actualiza un producto existente
    @PostMapping("/actualizar")
    public void actualizar(@RequestBody Producto producto) {
        productoService.actualizar(producto);
    }

    // Busca productos por nombre
    @GetMapping("/buscar")
    public List<Producto> buscarPorNombre(String nombre) {
        return productoService.buscarPorNombre(nombre);
    }

}
