package clases;

public class Pocion extends ObjetoComprable {
	
	private byte vida;

	public Pocion(byte dinero, String nombre, byte vida) {
		super(dinero, nombre);
		this.vida = vida;
	}

	public byte getVida() {
		return vida;
	}

	public void setVida(byte vida) {
		this.vida = vida;
	}

	@Override
	public String toString() {
		return "Pocion [vida=" + vida + "]";
	}

	
}
