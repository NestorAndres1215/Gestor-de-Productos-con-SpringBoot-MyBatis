package com.example.mapper;

import com.example.model.Proveedor;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProveedorMapper {

    @Select("SELECT * FROM proveedor")
    List<Proveedor> findAll();

    @Select("SELECT * FROM proveedor WHERE id = #{id}")
    Proveedor findById(int id);

    @Insert("INSERT INTO proveedor(nombre, contacto) VALUES(#{nombre}, #{contacto})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Proveedor proveedor);

    @Update("UPDATE proveedor SET nombre = #{nombre}, contacto = #{contacto} WHERE id = #{id}")
    void update(Proveedor proveedor);

    @Delete("DELETE FROM proveedor WHERE id = #{id}")
    void delete(int id);
}