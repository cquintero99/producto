package com.example.producto.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.producto.modelo.Producto;
import com.example.producto.repository.IProductoRepository;
import com.example.producto.repositoryService.IProductoRepositoryService;

@Service
public class ProductoService implements IProductoRepositoryService  {
	@Autowired
	private IProductoRepository data;

	@Override
	public List<Producto> listar() {
		return (List<Producto>) data.findAll();
	}

	@Override
	public Optional<Producto> buscarbyId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Producto producto) {
		int res = 0;
		Producto p = data.save(producto);
		if (p.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

	

	

}
