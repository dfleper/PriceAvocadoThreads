package com.dlfeper.precioaguacate;

import java.util.Random;

public class Especulador extends Thread {

	private String Nombre;
	private Producto producto;

	public Especulador(String nombre, Producto producto) {
		this.Nombre = nombre;
		this.producto = producto;
	}

	public void run() {
		int contador = 0;
		while (true) {
			if (contador % 2 != 0) {
				double valor = producto.getPrecio();
				Random random = new Random();
				Double aleatorio = random.nextDouble(1);
				valor = valor + aleatorio;
				producto.setPrecio(valor);
				System.out.println("Soy el " + this.Nombre + " estoy modificando el valor del producto "
						+ this.producto.getNombre() + " y ahora está a un precio de " + valor);
			} else {
				double valor = producto.getPrecio();
				Random random = new Random();
				Double aleatorio = random.nextDouble(1);
				valor = valor - aleatorio;
				producto.setPrecio(valor);
				System.out.println("Soy el " + this.Nombre + " estoy modificando el valor del producto "
						+ this.producto.getNombre() + " y ahora está a un precio de " + valor);
			}
			contador++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
