package com.example.producto.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	@Id
private Integer id;
private String nombre;
private String descripcion;

public Producto() {
	
}

public Producto(Integer id, String nombre, String descripcion) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.descripcion = descripcion;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

}
