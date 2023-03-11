package vista;

import java.util.Scanner;

/*
 * Consola
 * 
 * Interactua con el usuario tanto para recibir como enviar informacion
 */
public class Consola {
	private Scanner lectura;

	public Consola() {
		this.lectura = new Scanner(System.in);
	}

	/*
	 * Metodo leerLetra: 
	 * Pide al usuario que introduzca una letra por consola
	 * Entrada: - Salida: char (letra: la letra introducida por el usuario)
	 */
	public char leerLetra() {
		System.out.println("Introduzca una letra para descubrir la palabra:");
		return this.lectura.next().charAt(0); // se obtiene el primer caracter de la string introducida por el usuario
	}

	/*
	 * Metodo escribirResultado: 
	 * Escribe el resultado de la iteracion del juego,
	 * mostrando el dibujo del ahorcado segun la cantidad de fallos cometidos y
	 * muestra las letras descubiertas de la palabra secreta 
	 * Entrada: 
	 * int (fallos:
	 * el numero de fallos cometidos al intentar descubrir la letra) 
	 * String (palabraDescubierta: lo que se ha descubierto de la palabra secreta)
	 */
	public void escribirResultado(int fallos, String palabraDescubierta) {
		switch (fallos) { // Segun el numero de fallos se muestra un dibujo u otro
		case 0:
			System.out.println("    -----   ");
			System.out.println("    |   |   ");
			System.out.println("    |   |   ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("------------");
			break;
		case 1:
			System.out.println("    -----   ");
			System.out.println("    |   |   ");
			System.out.println("    |   |   ");
			System.out.println("    |   0   ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("------------");
			break;
		case 2:
			System.out.println("    -----   ");
			System.out.println("    |   |   ");
			System.out.println("    |   |   ");
			System.out.println("    |   0   ");
			System.out.println("    |   |   ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("------------");
			break;
		case 3:
			System.out.println("    -----   ");
			System.out.println("    |   |   ");
			System.out.println("    |   |   ");
			System.out.println("    |   0   ");
			System.out.println("    |  /|   ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("------------");
			break;
		case 4:
			System.out.println("    -----   ");
			System.out.println("    |   |   ");
			System.out.println("    |   |   ");
			System.out.println("    |   0   ");
			System.out.println("    |  /|\\ ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("------------");
			break;
		case 5:
			System.out.println("    -----   ");
			System.out.println("    |   |   ");
			System.out.println("    |   |   ");
			System.out.println("    |   0   ");
			System.out.println("    |  /|\\ ");
			System.out.println("    |  /    ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("------------");
			break;
		case 6:
			System.out.println("    -----   ");
			System.out.println("    |   |   ");
			System.out.println("    |   |   ");
			System.out.println("    |   0   ");
			System.out.println("    |  /|\\ ");
			System.out.println("    |  / \\ ");
			System.out.println("    |       ");
			System.out.println("    |       ");
			System.out.println("------------");
			break;
		}
		// Se escribe lo que se ha descubierto de la palabra secreta
		System.out.print("<---------> ");
		for (int i = 0; i < palabraDescubierta.length() - 1; i++) {
			System.out.print(palabraDescubierta.charAt(i) + " ");
		}
		System.out.print(palabraDescubierta.charAt(palabraDescubierta.length() - 1));
		System.out.println(" <--------->");

	}

	/*
	 * Metodo hasGanado: Indica al usuario que ha ganado mediante un texto en consola
	 */
	public void hasGanado() {
		System.out.println("------------------------------   ");
		System.out.println("|    ¡¡¡  HA GANADO !!!  :)  |   ");
		System.out.println("------------------------------   ");

	}

	/*
	 * Metodo hasGanado: Indica al usuario que ha perdido mediante un texto en
	 * consola
	 */
	public void hasPerdido() {
		System.out.println("-------------------------------   ");
		System.out.println("|    ¡¡¡  HA PERDIDO !!!  :(  |   ");
		System.out.println("-------------------------------   ");

	}
}