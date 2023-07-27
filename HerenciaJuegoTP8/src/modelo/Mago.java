package modelo;

public class Mago extends Personaje {

	private int magia;

	public Mago(String nombre, int vitalidad, Posicion posicion) {
		super(nombre, vitalidad, posicion);
		this.magia=500;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ataca(Personaje adversario) {
		// TODO Auto-generated method stub
		return super.ataca(adversario);
	}
	public void incrementaMagia(int cantidad) {
		this.magia+=cantidad;
	}
	
	public void teletransportarse(Posicion p) {
		this.posicion=p;
	}
	
}
