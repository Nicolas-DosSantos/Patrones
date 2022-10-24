package com;

public class Controlador {

	private Vista vista;
	private Modelo modelo;
	
	Controlador(Vista vista, Modelo modelo){
		this.modelo = modelo;
		this.vista = vista;
	}
}
