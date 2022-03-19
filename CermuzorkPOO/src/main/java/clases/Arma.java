package clases;

import clases.ObjetoComprable;

/**
 * Representa un arma con unos puntos de ataque y un nombre, que los jugadores y
 * enemigos usarán para atacar
 * 
 * @author Berta
 * @author Miguel Páramos
 *
 */
public class Arma extends ObjetoComprable {

	/** representa los puntos de ataque del arma **/
	private byte puntosAtaque;

	/**
	 * Constructo de arma con todos sus campos
	 * 
	 * @param nombre       nombre del arma
	 * @param dinero       lo que cuesta el arma
	 * @param puntosAtaque puntos maximos que inflinge el arma al atacar
	 */
	public Arma(String nombre, byte precio, byte puntosAtaque) {
		super(nombre, precio);
		this.puntosAtaque = puntosAtaque;
	}

	/**
	 * Getter de puntosAtaque
	 * 
	 * @return puntosAtaque de la clase arma
	 */
	public byte getPuntosAtaque() {
		return puntosAtaque;
	}

	/**
	 * setter de puntosAtaque
	 * 
	 * @param puntosAtaque de la clase arma
	 */
	public void setPuntosAtaque(byte puntosAtaque) {
		this.puntosAtaque = puntosAtaque;
	}

	/**
	 * función toString, que muestra la información del objeto
	 * 
	 * @return String con la información del objeto en una sola línea
	 */
	public String toString() {
		return "Arma: " + this.getNombre() + " | Ataque: " + this.puntosAtaque + " | Precio: " + this.getDinero();
	}

}
