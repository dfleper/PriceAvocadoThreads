package com.dlfeper.precioaguacate;

public class App {
	public static void main(String[] args) {

		System.out.println(" ");
		System.out.println("Iniciando la Simulación");
		System.out.println(" ");

		Producto producto = new Producto("Aguacate", 7.5);

		for (int i = 1; i <= 5; i++) {
			Especulador especulador = new Especulador("Especulador " + i, producto);
			especulador.start();
		}
	}
}