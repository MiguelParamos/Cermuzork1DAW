package clases;

import java.util.ArrayList;


/**
 * Representa una tienda en la que el jugador puede comprar armas, protecciones
 * o pociones.
 * 
 * @author Berta
 * @author Miguel Páramos
 */
public class Tienda {
	
	/** Representa una lista de objetos comprables (armas,pociones o ObjetoDefensivo) que se puede comprar **/
	private ArrayList<ObjetoComprable> articulosEnVenta;

	/**
	 * constructor de tienda que recibe todos los objetos que tendrá a la venta
	 * 
	 * @param catalogo de objetos (armas, ObjetoDefensivo o pociones) que tiene a la
	 *                 venta la tienda
	 */
	public Tienda(ArrayList<ObjetoComprable> catalogo) {
		this.articulosEnVenta = catalogo;
	}

	/**
	 * obtiene todos los artículos en venta de la tienda
	 * 
	 * @return todos los artículos que vende la tienda
	 */
	public ArrayList<ObjetoComprable> getArticulosEnVenta() {
		return articulosEnVenta;
	}

	/**
	 * cambia todos los artículos que la tienda vende, descartando todos los
	 * anteriores
	 * 
	 * @param articulosEnVenta Nuevo conjunto de Objeto (armas, ObjetoDefensivo o
	 *                         pociones) que la tienda venderá
	 */
	public void setArticulosEnVenta(ArrayList<ObjetoComprable> articulosEnVenta) {
		this.articulosEnVenta = articulosEnVenta;
	}

}
