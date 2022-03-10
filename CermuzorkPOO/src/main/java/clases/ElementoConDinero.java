package clases;

public abstract class ElementoConDinero {
	
	private byte dinero;

	public ElementoConDinero(byte dinero) {
		super();
		this.dinero = dinero;
	}

	public byte getDinero() {
		return dinero;
	}

	public void setDinero(byte dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		return "ElementoConDinero [dinero=" + dinero + "]";
	}
	
	

	
	
	
	

}
