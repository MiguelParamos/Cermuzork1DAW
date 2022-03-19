package clases;

/**
 * Clase que modela un combate entre un jugador y un enemigo.
 * @author Berta 
 * @author Miguel Páramos
 * 
 *
 */
public class Combate {

	/** jugador que participará en el combate **/
	private Jugador jugador;
	/** enemigo que participará en el combate **/
	private Enemigo enemigo;
	/** Quién de los dos (enemigo o jugador) ha ganado el combate, una vez luchado **/
	private Personaje ganador;
	/** turno actual del combate. Último turno jugado una vez que el combate acaba **/
	private short turno;
	
	/**
	 * Constructor con todos los campos de combate menos ganador, que empieza siempre a null,
	 * y turno que empieza siempre en 1
	 * @param jugador jugador que participará en el combate
	 * @param enemigo enemigo que participará en el combate
	 */
	public Combate(Jugador jugador, Enemigo enemigo) {
		super();
		this.jugador = jugador;
		this.enemigo = enemigo;
		this.ganador = null;
		this.turno = 1;
	}
	
	/**
	 * getter de jugador
	 * @return el jugador que participa en el combate
	 */
	public Jugador getJugador() {
		return jugador;
	}
	
	/**
	 * getter de enemigo
	 * @return el enemigo que participa en el combate
	 */
	public Enemigo getEnemigo() {
		return enemigo;
	}
	
	/**
	 * obtiene al ganador del combate. Debe de ejecutarse solo después de combatir.
	 * @return ganador del combate una vez este ha tenido lugar. Null si aún no ha tenido lugar.
	 */
	public Personaje getGanador() {
		return ganador;
	}
	
	/**
	 * getter de turno
	 * @return obtiene el turno actual del juego, o el último turno jugado si el combate ha finalizado
	 */
	public short getTurno() {
		return turno;
	}
	
	
	
	
}
