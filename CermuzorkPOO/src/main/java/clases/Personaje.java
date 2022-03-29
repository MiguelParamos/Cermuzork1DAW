package clases;

import excepciones.GeneroInvalidoException;

/**
 * Representa el nombre de un personaje que puede ser jugador o enemigo, su
 * vida, arma y objetoDefensivo
 * 
 * @author Berta
 * @author Miguel Páramos
 */
public class Personaje extends ElementoConDinero {
	/**
	 * Representa los puntos de vida del personaje
	 */
	private short vida;
	/**
	 * Almacena el Arma que tiene actualmente el Personaje.
	 */
	private Arma arma;
	/**
	 * Almacena el ObjetoDefensivo que tiene actualmente el Personaje.
	 */
	private ObjetoDefensivo objetoDefensivo;

	/**
	 * Representa el género del personaje: 'm' para masculino, y 'f' para femenino.
	 * Ningún otro valor es válido
	 */
	private char genero;

	/**
	 * Constructor de personaje con todos sus campos
	 * 
	 * @param nombre     nombre del personaje
	 * @param genero     género del enemigo. Solo puede ser 'm' (masculino) o 'f'
	 *                   (femenino)
	 * @param dinero     dinero inicial del personaje
	 * @param vida       cantidad inicial de vida del personaje
	 * @param arma       arma inicial del personaje
	 * @param objetoDefensivo  objetoDefensivo inicial del personaje
	 * @throws GeneroInvalidoException 
	 */
	public Personaje(String nombre, char genero, byte dinero, short vida, Arma arma, ObjetoDefensivo objetoDefensivo) throws GeneroInvalidoException {
		super(nombre, dinero);
		this.vida = vida;
		this.arma = arma;
		this.setGenero(genero);
		this.objetoDefensivo = objetoDefensivo;
	}

	/**
	 * obtiene el género del personaje, devolverá 'm' (masculino) o 'f' (femenino)
	 * 
	 * @return género del personaje, solo puede devolver 'm' (masculino) o 'f'
	 *         (femenino)
	 */
	public char getGenero() {
		return genero;
	}

	/**
	 * cambia el género del personaje. Solo puede ser 'm' (masculino) o 'f' (femenin
	 * 
	 * @param genero nuevo genero del personaje. Solo puede ser 'm' (masculino) o
	 *               'f' (femenino)
	 * @throws GeneroInvalidoException 
	 */
	public void setGenero(char genero) throws GeneroInvalidoException {
		if(genero!='m'&&genero!='f') {
			throw new GeneroInvalidoException("El genero "+genero+" no es válido, debe ser m o f");
		}
		this.genero = genero;
	}

	
	/**
	 * devuelve el arma actual del personaje
	 * 
	 * @return arma actual del personaje
	 */
	public Arma getArma() {
		return arma;
	}

	/**
	 * establece el arma actual del personaje, descartando la anterior
	 * 
	 * @param arma nueva arma que tendrá el personaje
	 */
	public void setArma(Arma arma) {
		this.arma = arma;
	}

	/**
	 * devuelve el objetoDefensivo actual del personaje
	 * 
	 * @return objetoDefensivo actual del personaje
	 */
	public ObjetoDefensivo getobjetoDefensivo() {
		return objetoDefensivo;
	}

	/**
	 * establece el objetoDefensivo actual del personaje, descartando la anterior
	 * 
	 * @param objetoDefensivo nuevo objetoDefensivo que tendrá el personaje
	 */
	public void setobjetoDefensivo(ObjetoDefensivo objetoDefensivo) {
		this.objetoDefensivo = objetoDefensivo;
	}

	/**
	 * función toString, que muestra la información del objeto
	 * 
	 * @return String con la información del personaje en varias líneas
	 */
	@Override
	public String toString() {
		return this.getNombre() + " " + (genero == 'm' ? "(hombre)" : "(mujer)") + "\n\t" + "Vida: " + this.vida
				+ "\n\t" + "Dinero: " + this.getDinero() + "\n\t" + this.arma + "\n\t" + this.objetoDefensivo + "\n";
	}

}
