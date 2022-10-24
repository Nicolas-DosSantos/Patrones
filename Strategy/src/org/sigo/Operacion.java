package org.sigo;

public class Operacion {

	private EstrategiaOperacion operacion;

	public void setOperacion(EstrategiaOperacion operacion) {
		this.operacion = operacion;
	}

	public void ejecutar(Computadora equipo) {
		this.operacion.ejecutar(equipo);
	}
}
