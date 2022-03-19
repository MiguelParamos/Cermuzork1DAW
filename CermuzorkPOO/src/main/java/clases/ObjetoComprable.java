package clases;

import clases.ElementoConDinero;

/**
 * Represntará un objeto que se puede comprar, el cual será una pocion, un arma o un objeto defensivo
 * 
 * @author Berta
 * @author Miguel Páramos
 *
 */
public abstract class ObjetoComprable extends ElementoConDinero {

	/**
	 * Representa un objeto extiende de ElementoConDinero
	 * 
	 * @param nombre nombre del objeto comprable
	 * @dinero dinero que cuesta el objeto comprable
	 */
	public ObjetoComprable(String nombre, byte dinero) {
		super(nombre, dinero);
	}

}
