package clases;

public abstract class ElementoConNombre extends ElementoConDinero {
	private String nombre;

	public ElementoConNombre(byte dinero, String nombre) {
		super(dinero);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ElementoConNombre [nombre=" + nombre + "]";
	}

}
