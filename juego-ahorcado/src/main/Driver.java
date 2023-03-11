package main;

import controlador.MotorJuego;

public class Driver {

	public static void main(String[] args) {
		MotorJuego juego = new MotorJuego();
		juego.iniciar();
		while(juego.iterar()) {
			
			
		}
	}

}
