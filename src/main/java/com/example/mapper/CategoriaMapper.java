package com.example.mapper;

import com.example.model.Categoria;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoriaMapper {

    @Select("SELECT * FROM categoria")
    List<Categoria> findAll();

    @Select("SELECT * FROM categoria WHERE id = #{id}")
    Categoria findById(int id);

    @Insert("INSERT INTO categoria(nombre) VALUES(#{nombre})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Categoria categoria);

    @Update("UPDATE categoria SET nombre = #{nombre} WHERE id = #{id}")
    void update(Categoria categoria);

    @Delete("DELETE FROM categoria WHERE id = #{id}")
    void delete(int id);
}