package interfaces;

/**
 * Acciones que debe poder realizar cualquier Personaje, ya sea Jugador o
 * enemigo.
 * 
 * @author Miguel Páramos
 *
 */
public interface AccionesPersonaje {

	/**
	 * Función que indica si un personaje está vivo o no. Estará vivo si su variable
	 * interna vida tiene un valor superior a cero.
	 * 
	 * @return boolean que valdrá true si el personaje está vivo, y false si no lo
	 *         está.
	 */
	public boolean estaVivo();

	/**
	 * función que se utiliza para indicar que un Personaje está atacando. Devuelve
	 * un número aleatorio entre cero y los puntos de ataque de su arma (Todos los
	 * puntos de ataque, no los puntos de ataque-1)
	 * 
	 * @return byte que indica la potencia, entre cero y los puntos de ataque del
	 *         arma del personaje, de un ataque que éste realiza.
	 */
	public byte atacar();

}
