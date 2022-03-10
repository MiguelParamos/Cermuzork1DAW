package clases;

public class Enemigo extends Personaje{
	
	private boolean esBoss;

	public Enemigo(byte dinero, String nombre, byte vida, Arma arma, ObjetoDefensivo escudo, boolean esBoss) {
		super(dinero, nombre, vida, arma, escudo);
		this.esBoss = esBoss;
	}

	public boolean isEsBoss() {
		return esBoss;
	}

	public void setEsBoss(boolean esBoss) {
		this.esBoss = esBoss;
	}

	@Override
	public String toString() {
		return "Enemigo [esBoss=" + esBoss + "]";
	}

	
	

}
