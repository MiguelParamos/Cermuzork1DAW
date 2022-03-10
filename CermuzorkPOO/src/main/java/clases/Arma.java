package clases;

public class Arma extends ObjetoComprable{
	
	private byte puntosAtaque;

	public Arma(byte dinero, String nombre, byte puntosAtaque) {
		super(dinero, nombre);
		this.puntosAtaque = puntosAtaque;
	}

	public byte getPuntosAtaque() {
		return puntosAtaque;
	}

	public void setPuntosAtaque(byte puntosAtaque) {
		this.puntosAtaque = puntosAtaque;
	}

	@Override
	public String toString() {
		return "Arma [puntosAtaque=" + puntosAtaque + "]";
	}

	
	
	

}
