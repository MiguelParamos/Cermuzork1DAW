package clases;

public class Lugar extends ElementoConDinero {
	
	private String descripcion;
	private Tienda tienda;
	private Enemigo enemigo;
	private byte pocion;
	
	public Lugar(byte dinero, String descripcion, Tienda tienda, Enemigo enemigo, byte pocion) {
		super(dinero);
		this.descripcion = descripcion;
		this.tienda = tienda;
		this.enemigo = enemigo;
		this.pocion = pocion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Tienda getTienda() {
		return tienda;
	}
	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}
	public Enemigo getEnemigo() {
		return enemigo;
	}
	public void setEnemigo(Enemigo enemigo) {
		this.enemigo = enemigo;
	}
	public byte getPocion() {
		return pocion;
	}
	public void setPocion(byte pocion) {
		this.pocion = pocion;
	}
	@Override
	public String toString() {
		return "Lugar [descripcion=" + descripcion + ", tienda=" + tienda + ", enemigo=" + enemigo + ", pocion="
				+ pocion + "]";
	}
	
	

}
