package clases;

import java.util.ArrayList;

public class Tienda {
	
	private ArrayList<ObjetoComprable>objetosVenta;

	public Tienda(ArrayList<ObjetoComprable> objetosVenta) {
		super();
		this.objetosVenta = objetosVenta;
	}

	public ArrayList<ObjetoComprable> getObjetosVenta() {
		return objetosVenta;
	}

	public void setObjetosVenta(ArrayList<ObjetoComprable> objetosVenta) {
		this.objetosVenta = objetosVenta;
	}

	@Override
	public String toString() {
		return "Tienda [objetosVenta=" + objetosVenta + "]";
	}
	
	

}
