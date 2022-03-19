package clases;

import clases.ObjetoDefensivo;

/**
 * Representa el objeto defensivo de los jugadores y enemigos mediante puntos de
 * defensa
 * 
 * @author Berta
 * @author Miguel Páramos
 *
 */

public class ObjetoDefensivo extends ObjetoComprable {
	/** Representan los puntos de defensa que otorga este objeto defensivo */
	private byte puntosDefensa;

	/**
	 * Constructor con todos los campos del ObjetoDefensivo
	 * 
	 * @param nombre        nombre de el objeto defensivo
	 * @param precio        precio de el objeto defensivo
	 * @param puntosDefensa puntos de defensa que otorga el objeto defensivo
	 */
	public ObjetoDefensivo(String nombre, byte precio, byte puntosDefensa) {
		super(nombre, precio);
		this.puntosDefensa = puntosDefensa;
	}

	/**
	 * getter de Puntos de defensa
	 * 
	 * @return puntos de defensa de la clase ObjetoDefensivo
	 */
	public byte getPuntosDefensa() {
		return puntosDefensa;
	}

	/**
	 * setter de puntos de defensa
	 * 
	 * @param puntosDefensa nueva cantidad de puntos de defensa que otorga el
	 *                      ObjetoDefensivo
	 */
	public void setPuntosDefensa(byte puntosDefensa) {
		this.puntosDefensa = puntosDefensa;
	}

	/**
	 * función toString, que muestra la información del objeto
	 * 
	 * @return String con la información del objeto en una sola línea
	 */
	public String toString() {
		return "Objeto Defensivo: " + this.getNombre() + " | Defensa: " + this.puntosDefensa + " | Precio: "
				+ this.getDinero();
	}

}
