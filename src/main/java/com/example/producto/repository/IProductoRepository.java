package com.example.producto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.producto.modelo.Producto;
@Repository
public interface IProductoRepository extends CrudRepository<Producto,Integer>{

}
