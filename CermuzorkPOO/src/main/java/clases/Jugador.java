package clases;

import excepciones.GeneroInvalidoException;

/**
 * Representa un jugador que cuenta con unas posiciones que se usaran para
 * moverse y localizarlo.
 * 
 * @author Berta
 * @author Miguel Páramos
 * 
 */
public class Jugador extends Personaje {
	/**
	 * Representa la posicion de fila que tendran en el tablero.
	 */
	private byte posicionFila;
	/**
	 * Representa la posicion de columna que tendran en el tablero.
	 */
	private byte posicionCol;

	/**
	 * Constructor de jugador con todos los campos internos
	 * 
	 * @param nombre       nombre que tendrá el jugador
	 * @param genero       género del jugador. Solo puede ser 'm' (masculino) o 'f'
	 *                     (femenino)
	 * @param dinero       dinero inicial con el que contará el jugador
	 * @param vida         cantidad inicial de vida del jugador
	 * @param arma         arma que porta actualmente el jugador
	 * @param objetoDefensivo   ObjetoDefensivo que porta actualmente el jugador
	 * @param posicionFila número que indica la fila actual en la que el jugador se
	 *                     encuentra
	 * @param posicionCol  número que indica la columna actual en la que el jugador
	 *                     se encuentra
	 * @throws GeneroInvalidoException 
	 */
	public Jugador(String nombre, char genero, byte dinero, short vida, Arma arma, ObjetoDefensivo objetoDefensivo,
			byte posicionFila, byte posicionCol) throws GeneroInvalidoException {
		super(nombre, genero, dinero, vida, arma, objetoDefensivo);
		this.posicionFila = posicionFila;
		this.posicionCol = posicionCol;
	}

	/**
	 * obtiene la fila en la que el jugador se encuentra, junto a la columna, forma
	 * una posición
	 * 
	 * @return fila en la que el jugador se encuentra actualmente
	 */
	public byte getPosicionFila() {
		return posicionFila;
	}

	/**
	 * obtiene la columna en la que el jugador se encuentra, junto a la fila, forma
	 * una posición
	 * 
	 * @return columna en la que el jugador se encuentra actualmente
	 */
	public byte getPosicionCol() {
		return posicionCol;
	}

	/**
	 * función toString, que muestra la información del objeto
	 * 
	 * @return String con la información del jugador o jugadora, incluyendo su
	 *         posición en el tablero.
	 */
	@Override
	public String toString() {
		return "-------Jugador" + (this.getGenero() == 'f' ? "a" : "") + "-------\n" + super.toString()
				+ "\tPosición: (" + this.posicionFila + "," + this.posicionCol + ")\n";
	}

}
