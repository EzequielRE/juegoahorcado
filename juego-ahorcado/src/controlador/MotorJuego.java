package controlador;

import modelo.GeneradorDePalabras;
import modelo.PalabraSecreta;
import vista.Consola;

/*
 * MotorJuego
 * Establece el algoritmo o mecanica del juego
 * 
 */
public class MotorJuego {
	private PalabraSecreta palabraSecreta;
	private Consola consola;
	private GeneradorDePalabras generadorDePalabras;
	private int fallos;
	private final int FALLOSMAX = 6;
	
	public MotorJuego() {
		this.generadorDePalabras = new GeneradorDePalabras();
		this.palabraSecreta = new PalabraSecreta();
		this.consola = new Consola();
		this.fallos = 0;
	}
	
	/*
	 * Metodo iniciar:
	 * 		Inicia el juego estableciendo una palabra secreta y la palabra a descubrir con guiones bajos
	 * Entrada:
	 *		-
	 * Salida:
	 *		-
	 */
	public void iniciar() {
		String palabraSecreta = this.generadorDePalabras.genera(); //Obtenemos una palabra al azar del listado
		this.palabraSecreta.iniciar(palabraSecreta);  //Establecemos la palabra secreta
	}
	
	
	/*
	 * Metodo iterar:
	 * 		Realiza una iteracion del juego donde 
	 * 		1 se pide una letra al usuario
	 * 		2 se comprueba si la letra se encuentra en la palabra secreta o no
	 * 		  añadiendo un fallo si no ha acertado
	 * 		3 se comprueba si el usuario ha ganado o perdido
	 * 		4 se muestra el resultado y avance en el juego
	 * Entrada:
	 * 		-
	 * Salida:
	 * 		boolean (false: si el juego se ha acabado true: si el juego continua)
	 */
	public boolean iterar() {
		
		char letra = this.consola.leerLetra(); //se pide letra al usuario
		if(this.palabraSecreta.contieneLaLetra(letra)) { //se comprueba si la palabra secreta cotiene la letra introducida
			if(this.palabraSecreta.seHaDescubierto()) {  //En caso de acierto comprobamos si ya ha descubierto la palabra secreta
				this.consola.escribirResultado(this.fallos, this.palabraSecreta.getPalabraDescubierta()); //Se procede a escribir el resultado e indiciar que ha ganado.
				this.consola.hasGanado();
				return false; //Se para el juego
			}
		}else { 
			this.fallos++; //En caso de fallo aumentamos en 1 los fallos
		}
		if(this.fallos >= this.FALLOSMAX) { // Se comprueba si ha llegado al tope de fallos permitidos
			this.consola.escribirResultado(this.fallos, this.palabraSecreta.getPalabraDescubierta());  //Se procede a escribir el resultado e indicar que se ha perdido.
			this.consola.hasPerdido();
			return false; //Se para el juego
		}
		this.consola.escribirResultado(this.fallos, this.palabraSecreta.getPalabraDescubierta());  // Escribimos el resultado
		return true;  //El juego continua
	}
	
	
}
