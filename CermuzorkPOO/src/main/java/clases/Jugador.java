package clases;

public class Jugador extends Personaje{
	
	private byte posFila;
	private byte posColum;
	
	public Jugador(byte dinero, String nombre, byte vida, Arma arma, ObjetoDefensivo escudo, byte posFila,
			byte posColum) {
		super(dinero, nombre, vida, arma, escudo);
		this.posFila = posFila;
		this.posColum = posColum;
	}
	public byte getPosFila() {
		return posFila;
	}
	public void setPosFila(byte posFila) {
		this.posFila = posFila;
	}
	public byte getPosColum() {
		return posColum;
	}
	public void setPosColum(byte posColum) {
		this.posColum = posColum;
	}
	@Override
	public String toString() {
		return "Jugador [posFila=" + posFila + ", posColum=" + posColum + "]";
	}
	
	
	

}
