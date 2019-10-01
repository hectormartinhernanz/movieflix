package main;

import movieflix.control.ControlMenu;

/**
 * El m�todo principal, aqu� comienza todo
 * @author H�ctor Mart�n 
 *@version 01/10/2019
 */

import movieflix.datos.Datos;
public class Main {
	public static void main(String[] args) {
		new Datos().cargarInicial();
		ControlMenu.mostrarMenu();
	}

}
