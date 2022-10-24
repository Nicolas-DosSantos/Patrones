package org;

public class Main {

	public static void main(String[] args) {
		Operacion operaciones = new Operacion();
		
		operaciones.setOperacion(new Reparar());
		operaciones.ejecutar(new Computadora("DELL-400"));
		
		operaciones.setOperacion(new Descartar());
		operaciones.ejecutar(new Computadora("DELL-401"));
	}

}
