package org;

public class Reparar implements EstrategiaOperacion{

	public void ejecutar(Computadora equipo) {
		System.out.println("La computadora " + equipo.getId() + " ha sido reparado");
	}
}
