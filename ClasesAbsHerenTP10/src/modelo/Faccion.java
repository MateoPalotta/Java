package modelo;

public class Faccion {
	private String nombre;
	private int score;
	
	public Faccion(String nombre) {
		this.nombre = nombre;
		this.score = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public int getScore() {
		return score;
	}

	public void sumarPuntos(int cantidad){
		score += cantidad;
	}
	
	
	
	
}
