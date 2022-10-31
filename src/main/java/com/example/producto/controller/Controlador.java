package com.example.producto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.producto.modelo.Producto;
import com.example.producto.repository.IProductoRepository;
import com.example.producto.repositoryService.IProductoRepositoryService;

@RequestMapping
@Controller
public class Controlador {

	@Autowired
	private IProductoRepositoryService service;

	@GetMapping("/listar")
	public String listar(Model model) {
		List<Producto> productos = service.listar();
		model.addAttribute("productos", productos);
		return "index.html";

	}

	@GetMapping("/nuevo")
	public String agregar(Model model) {
		model.addAttribute("producto", new Producto());
		return "form.html";
	}

	@PostMapping("/save")
	public String save(@Validated Producto producto, Model model) {
		service.save(producto);
		return "redirect:/listar";
	}

	@GetMapping("/editar/{id}")
	public String editar(Model model, @PathVariable int id) {
		Optional<Producto> producto = service.buscarbyId(id);
		model.addAttribute("producto", producto);
		return "form.html";
	}

	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);

		return "redirect:/listar";
	}
	@GetMapping("/buscar/{id}")
	public String buscar(Model model,@PathVariable int id) {
		
		Optional<Producto>producto=service.buscarbyId(id);
		model.addAttribute("producto", producto);
		return "form.html";
	}

}
