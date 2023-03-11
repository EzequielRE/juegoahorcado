package modelo;

import java.util.Random;

/*
 * GenereadorDePalabras
 * 
 * A partir de un listado de palabras genera una palabra aleatoria.
 */
public class GeneradorDePalabras {
	private String listadoDePalabras[]= {"PYTHON", "PHP", 
			"JAVASCRIPT", "PERL", "JAVA", "TYPESCRIPT", "RUBY"};
	public GeneradorDePalabras() {
	}
	
	/*
	 * Metodo genera:
	 *     Devuelve una palabra aleatoria a partir del listado dado
	 * Entrada: 
	 * 		-
	 * Salida:
	 * 		String (palabraSecreta) 
	 */
	public String genera() {
		Random random = new Random();
		return this.listadoDePalabras[random.nextInt(this.listadoDePalabras.length)];
		
	}
	
}
