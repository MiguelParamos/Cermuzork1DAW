package clases;

public class Combate {

	private Jugador jugador;
	private Enemigo enemigo;
	private Personaje ganador;
	private short turno;
	public Combate(Jugador jugador, Enemigo enemigo, Personaje ganador, short turno) {
		super();
		this.jugador = jugador;
		this.enemigo = enemigo;
		this.ganador = ganador;
		this.turno = turno;
	}
	public Jugador getJugador() {
		return jugador;
	}
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	public Enemigo getEnemigo() {
		return enemigo;
	}
	public void setEnemigo(Enemigo enemigo) {
		this.enemigo = enemigo;
	}
	public Personaje getGanador() {
		return ganador;
	}
	public void setGanador(Personaje ganador) {
		this.ganador = ganador;
	}
	public short getTurno() {
		return turno;
	}
	public void setTurno(short turno) {
		this.turno = turno;
	}
	@Override
	public String toString() {
		return "Combate [jugador=" + jugador + ", enemigo=" + enemigo + ", ganador=" + ganador + ", turno=" + turno
				+ "]";
	}
	
	
}
