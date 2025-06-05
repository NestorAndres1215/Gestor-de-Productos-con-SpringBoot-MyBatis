package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.ProveedorMapper;
import com.example.model.Proveedor;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorMapper proveedorMapper;

    // Metodo para listar todos los proveedores
    public List<Proveedor> listarTodosProveedores() {
        return proveedorMapper.findAll();
    }

    // Metodo para obtener un proveedor por su ID
    public Proveedor obtenerProveedorPorId(int id) {
        return proveedorMapper.findById(id);
    }

    // Metodo para agregar un nuevo proveedor
    public void agregarProveedor(Proveedor proveedor) {
        proveedorMapper.insert(proveedor);
    }

    // Metodo para eliminar un proveedor por su ID
    public void eliminarProveedor(int id) {
        proveedorMapper.delete(id);
    }

    // Metodo para actualizar un proveedor existente
    public void actualizarProveedor(Proveedor proveedor) {
        proveedorMapper.update(proveedor);
    }
}
