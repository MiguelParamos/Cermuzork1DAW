package clases;

/**
 * Representa el lugar donde encontraremos una descripcion, enemigos, tiendas y
 * pociones
 * 
 * @author Berta
 * @author Miguel Páramos
 *
 */
public class Lugar extends ElementoConDinero {
	/** representa el tipo de pocion **/
	private Pocion pocion;
	/** representa a los enemigos ubicados en el lugar **/
	private Enemigo enemigo;
	/** representa las tiendas ubicadas en el lugar **/
	private Tienda tienda;
	/** representa una descripcion del lugar **/
	private String descripcion;

	/**
	 * Constructor de lugar con todos sus campos
	 * 
	 * @author erico
	 * @param nombre      nombre del lugar
	 * @param dinero      dinero que deja el enemigo en el lugar
	 * @param pocion      pociones que encontraremos en el lugar
	 * @param enemigo     enemigos del lugar
	 * @param tienda      tiendas que hay en el lugar
	 * @param descripcion peque�a descripcion del lugar
	 */
	public Lugar(String nombre, byte dinero, Pocion pocion, Enemigo enemigo, Tienda tienda, String descripcion) {
		super(nombre, dinero);
		this.pocion = pocion;
		this.enemigo = enemigo;
		this.tienda = tienda;
		this.descripcion = descripcion;
	}

	/**
	 * Constructor de lugar que recibe solo el nombre y la descripción. El resto de
	 * elementos valdrá null
	 * 
	 * @param nombre      nombre del lugar
	 * @param descripcion descripción del lugar
	 */
	public Lugar(String nombre, String descripcion) {
		super(nombre, (byte) 0);
		this.pocion = null;
		this.enemigo = null;
		this.tienda = null;
		this.descripcion = descripcion;
	}

	/**
	 * getter de Pocion
	 * 
	 * @return pocion que hay en el lugar, null si no la hay
	 */
	public Pocion getPocion() {
		return pocion;
	}

	/**
	 * setter de Pocion
	 * 
	 * @param coloca una poción en este lugar
	 */

	public void setPocion(Pocion pocion) {
		this.pocion = pocion;
	}

	/**
	 * getter de Eemigo
	 * 
	 * @return devuelve el enemigo que hay en este lugar, null si no lo hay
	 */
	public Enemigo getEnemigo() {
		return enemigo;
	}

	/**
	 * setter de Enemigo
	 * 
	 * @param establece un enemigo en este lugar.
	 */
	public void setEnemigo(Enemigo enemigo) {
		this.enemigo = enemigo;
	}

	/**
	 * getter de tienda
	 * 
	 * @return obtiene la tienda que hay en este lugar, null si no la hay
	 */
	public Tienda getTienda() {
		return tienda;
	}

	/**
	 * setter de tienda
	 * 
	 * @param coloca aquí una tienda
	 */
	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	/**
	 * getter de descripcion
	 * 
	 * @return te devuelve la descripcion del lugar
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * setter de descripcion
	 * 
	 * @param cambia la descripción del lugar
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * función toString, que muestra la información del lugar
	 * 
	 * @return String con la información del lugar y de todo lo que contiene, si
	 *         contiene algo.
	 */
	@Override
	public String toString() {
		String ret = "\n---------------------------------\n" + this.getNombre()
				+ "\n---------------------------------\n" + this.getDescripcion()
				+ "\n---------------------------------\n";
		if (this.enemigo == null && this.pocion == null && this.tienda == null && this.getDinero() == 0) {
			ret += "No encuentras nada de interés aquí.\n";
		} else {
			if (this.getDinero() > 0) {
				ret += "Encuentras " + this.getDinero() + " monedas de oro.\n";
			}
			if (this.getPocion() != null) {
				ret += "Encuentras una poción aquí: \n\t" + this.getPocion() + "\n";
			}
			if (this.getTienda() != null) {
				ret += "Encuentras aquí la tienda. Pero la compra aún no está implementada en el juego :(\n";
			}
			if (this.getEnemigo() != null) {
				ret += "¡ENCUENTRAS UN ENEMIGO!\n" + this.getEnemigo() + "\n";
			}
		}

		return ret;
	}

}
