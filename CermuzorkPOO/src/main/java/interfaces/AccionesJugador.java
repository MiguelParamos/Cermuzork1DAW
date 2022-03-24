package interfaces;

/**
 * Clase que modela las acciones específicas que un Jugador debe poder hacer
 * 
 * @author Miguel Páramos
 *
 */
public interface AccionesJugador {

	/**
	 * Función que hace que un Jugador cambie su posicionFila y posicionCol en el
	 * mapa, a partir de la dirección de movimiento que se le indica por argumentos.
	 * En caso de estar en un caso extremo de la matriz de 4x4, simplemente no
	 * avanzará en ninguna dirección
	 * 
	 * @param direccion dirección del movimiento. Solo puede ser uno de estos cuatro
	 *                  valores: 'n' para el norte (una fila arriba), 's' para el
	 *                  sur (una fila abajo), 'e' para el este (una columna más) y
	 *                  'o' para el oeste (una columna menos). Cualquier otro valor
	 *                  de char se ignorará.
	 * @return boolean que indica si se ha podido mover el personaje (true), o si no
	 *         ha podido (false) porque estaba en un valor extremo y no puede
	 *         avanzar en esa dirección.
	 */
	public boolean moverse(char direccion);

}
