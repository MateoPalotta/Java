package modelo;

public class DestructorEstelar extends Naves {
	private int nivelDeEscudo;
	
	public DestructorEstelar(String nombre, int energia, Posicion posicion, Faccion faccion, int nivelDeEscudo) {
		super(nombre, 1000, posicion, faccion);
		this.nivelDeEscudo = 1500;
	}
	
	public int getNivelDeEscudo() {
		return nivelDeEscudo;
	}

	public void setNivelDeEscudo(int nivelDeEscudo) {
		this.nivelDeEscudo = nivelDeEscudo;
	}

	@Override
	public void atacar(Naves objetivo) {
		// TODO Auto-generated method stub
		if (puedeAtacar(objetivo)) {
			objetivo.recibeDanio(200);
		}
	}

	@Override
	protected double getAlcance() {
		// TODO Auto-generated method stub
		return 40;
	}
	
}
