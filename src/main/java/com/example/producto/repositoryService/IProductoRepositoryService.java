package com.example.producto.repositoryService;

import java.util.List;
import java.util.Optional;

import com.example.producto.modelo.Producto;

public interface IProductoRepositoryService {
	public List<Producto>listar();
	public Optional<Producto>buscarbyId(int id);
	public int save(Producto producto);
	public void delete (int id);
}
