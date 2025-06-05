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


import com.example.model.Proveedor;
import com.example.service.ProveedorService;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    @Autowired 
    private ProveedorService proveedorService;

    // Ejemplo de métodos CRUD para proveedores

    // Listar todos los proveedores
    @GetMapping
    public List<Proveedor> listarProveedores() {
        return proveedorService.listarTodosProveedores();
    }

    // Obtener un proveedor por su ID
    @GetMapping("/{id}")
    public Proveedor obtenerPorId(@PathVariable int id) {
        return proveedorService.obtenerProveedorPorId(id);
    }

    // Agregar un nuevo proveedor
    @PostMapping("/agregar")
    public void agregar(@RequestBody Proveedor proveedor) {
        proveedorService.agregarProveedor(proveedor);
    }

    // Eliminar un proveedor por su ID
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable int id) {
        proveedorService.eliminarProveedor(id);
    }

    // Actualizar un proveedor existente
    @PostMapping("/actualizar")
    public void actualizar(@RequestBody Proveedor proveedor) {
        proveedorService.actualizarProveedor(proveedor);
    }
}
