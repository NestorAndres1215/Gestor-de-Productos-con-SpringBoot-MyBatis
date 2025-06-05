package com.example.mapper;

import com.example.model.Producto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductoMapper {

        @Select("SELECT * FROM producto")
        List<Producto> findAll();

        // Listar todos los productos
        @Select("SELECT * FROM producto WHERE id = #{id}")
        Producto findById(int id);

        // Listar productos por nombre
        @Select("SELECT * FROM producto WHERE nombre LIKE CONCAT('%', #{nombre}, '%')")
        List<Producto> findByName(String nombre);


        @Insert("INSERT INTO producto(nombre, descripcion, precio, stock, categoria_id, proveedor_id) " +
                        "VALUES(#{nombre}, #{descripcion}, #{precio}, #{stock}, #{categoriaId}, #{proveedorId})")
        @Options(useGeneratedKeys = true, keyProperty = "id")
        void insert(Producto producto);

        @Delete("DELETE FROM producto WHERE id = #{id}")
        void delete(int id);

        @Update("UPDATE producto SET nombre=#{nombre}, descripcion=#{descripcion}, precio=#{precio}, " +
                        "stock=#{stock}, categoria_id=#{categoriaId}, proveedor_id=#{proveedorId} WHERE id=#{id}")
        void update(Producto producto);
       

}
