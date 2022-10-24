package org.sigo;

public class Descartar implements EstrategiaOperacion {

	public void ejecutar(Computadora equipo) {
		System.out.println("La computadora " + equipo.getId() + " ha sido descartada");
	}
}
