package modelo;

public class CazaLigero extends Naves {
	private int cantidadMisiles;
	
	public CazaLigero(String nombre, int energia, Posicion posicion, Faccion faccion, int cantidadMisiles) {
		super(nombre, 500, posicion, faccion);
		this.cantidadMisiles = 5;
	}

	public int getCantidadMisiles() {
		return cantidadMisiles;
	}

	public void setCantidadMisiles(int cantidadMisiles) {
		this.cantidadMisiles = cantidadMisiles;
	}

	@Override
    public void atacar(Naves objetivo) {
		// TODO Auto-generated method stub
        if (puedeAtacar(objetivo)) {
            if (cantidadMisiles > 0) {
                objetivo.recibeDanio(500);
                cantidadMisiles--;
            } else {
                objetivo.recibeDanio(50);
            }
        }
    }

	@Override
	protected double getAlcance() {
		// TODO Auto-generated method stub
		return 20;
	}

}
