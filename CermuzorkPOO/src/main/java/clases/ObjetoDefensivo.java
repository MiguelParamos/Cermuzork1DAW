package clases;

public class ObjetoDefensivo extends ObjetoComprable{
	
	private byte puntosDefensa;

	public ObjetoDefensivo(byte dinero, String nombre, byte puntosDefensa) {
		super(dinero, nombre);
		this.puntosDefensa = puntosDefensa;
	}

	public byte getPuntosDefensa() {
		return puntosDefensa;
	}

	public void setPuntosDefensa(byte puntosDefensa) {
		this.puntosDefensa = puntosDefensa;
	}

	@Override
	public String toString() {
		return "ObjetoDefensivo [puntosDefensa=" + puntosDefensa + "]";
	}

	
	

}
