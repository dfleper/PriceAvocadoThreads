package com.dlfeper.precioaguacate;

public class Producto {

	private String Nombre;
	private Double Precio;

	public Producto(String nombre, Double precio) {
		this.Nombre = nombre;
		this.Precio = precio;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	synchronized public Double getPrecio() {
		return Precio;
	}

	synchronized public void setPrecio(Double precio) {
		Precio = precio;
	}
}
