package clases;

public class Personaje extends ElementoConNombre{
	
	private byte vida;
	private Arma arma;
	private ObjetoDefensivo escudo;
	
	public Personaje(byte dinero, String nombre, byte vida, Arma arma, ObjetoDefensivo escudo) {
		super(dinero, nombre);
		this.vida = vida;
		this.arma = arma;
		this.escudo = escudo;
	}
	public byte getVida() {
		return vida;
	}
	public void setVida(byte vida) {
		this.vida = vida;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public ObjetoDefensivo getEscudo() {
		return escudo;
	}
	public void setEscudo(ObjetoDefensivo escudo) {
		this.escudo = escudo;
	}
	@Override
	public String toString() {
		return "Personaje [vida=" + vida + ", arma=" + arma + ", escudo=" + escudo + "]";
	}
	
	

}
