package clases;

import java.util.Arrays;

public class Mapa {
	
	private Lugar [][] mapa;

	public Mapa(Lugar[][] mapa) {
		super();
		this.mapa = mapa;
	}

	public Lugar[][] getMapa() {
		return mapa;
	}

	public void setMapa(Lugar[][] mapa) {
		this.mapa = mapa;
	}

	@Override
	public String toString() {
		return "Mapa [mapa=" + Arrays.toString(mapa) + "]";
	}
	
	
	
}
