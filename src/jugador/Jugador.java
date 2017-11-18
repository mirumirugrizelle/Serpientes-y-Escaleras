/*
 * Clase que nos permite manejar objetos de tipo jugador
 */
package jugador;

public class Jugador {
	private String nombre;
	private int posicion;
	public Jugador(String vNombre) {
		nombre=vNombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setPosicion(int vPosicion) {
		posicion=vPosicion;
	}
	public int getPosicion() {
		return posicion;
	}
	public String toString() {
		return nombre+" 	"+posicion;
	}
}
