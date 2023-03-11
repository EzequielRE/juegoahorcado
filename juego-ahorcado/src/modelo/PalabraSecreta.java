package modelo;

/*
 * PalabraSecreta
 * 
 * Representa la palabra secreta que tiene que descubrir el jugador
 * y cuánto de ella se ha descubierto.
 * 
 * La palabra descubierta tendra guion bajo "_" en las posiciones de letras
 * que no se han descubierto, y la propia letra en las posisciones que se han 
 * descubierto.
 */

public class PalabraSecreta {
	private String palabraSecreta; //Contiene la palabra secreta a descubrir
	private String palabraDescubierta; //Contiene cuanto ha descubierto de la palabra secreta 
	
	public PalabraSecreta() {
		this.palabraDescubierta= null;
		this.palabraSecreta= null;
	}
	public String getPalabraDescubierta(){
		return this.palabraDescubierta;
	}
	
	/*
	 * Metodo iniciar:
	 * 		Inicia la palabra secreta con una nueva palabra
	 * 		y por tanto la palabra descubierta con todas las letras
	 * 		con "_".
	 * Entrada:
	 * 		String (palabraSecreta: la nueva palabra introducida)
	 * Salida:
	 * 		-
	 */
	public void iniciar(String palabraSecreta) {
		this.palabraSecreta = palabraSecreta; // Se asigna la nueva palabra a la palabra secreta
		this.palabraDescubierta = "_".repeat(palabraSecreta.length());  // Y se inicializa la palabra a descubrir todo a "_" como tantas letras tenga la nueva palabra.
	}
	
	/*
	 * Metodo seHaDescubierto
	 * 		Indica al usuario si se ha descubierto la palabra secreta.
	 * Entrada:
	 * 		-
	 * Salida:
	 * 		boolean (false: si no se ha descubierto. true: si sí se ha descubierto)
	 */
	public boolean seHaDescubierto() {
		return this.palabraSecreta.equals(this.palabraDescubierta); //Se comprueba si la palabra secreta y descubierta son iguales
	}
	
	/*
	 * Metodo contieneLaLetra
	 * 		Indica al usuario si la palabra secreta contiene la letra que se le ha pasado.
	 * 		Y que en cuyo caso, se descubren en la palabra descubierta.
	 * Entrada:
	 * 		char (letra: es la letra que creemos que contiene la palabra secreta y que tratamos de descubrir)
	 * Salida:
	 * 		boolean (false: si no contiene la letra. true: si sí la contiene)
	 */
	public boolean contieneLaLetra(char letra) {
		if(this.palabraSecreta.contains(String.valueOf(letra))){  // Se comprueba si la palabra secreta contiene la nueva letra
			char arrayChar[] = this.palabraDescubierta.toCharArray();
			for (int i = 0; i < this.palabraSecreta.length(); i++) {  // Colocamos en la palabra descubierta la letra en las mismas posiciones que la palabra secreta
				if(this.palabraSecreta.charAt(i)==letra) {
					arrayChar[i] = letra;
				}
			}
			this.palabraDescubierta = new String(arrayChar);
			return true;
		}else {
			return false;
		}
	}
}
