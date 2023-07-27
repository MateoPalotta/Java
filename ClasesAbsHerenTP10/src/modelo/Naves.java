package modelo;

public abstract class Naves {
	protected String nombre;
	protected int energia;
	protected Posicion posicion;
	protected Faccion faccion;
	
	public Naves(String nombre, int energia, Posicion posicion, Faccion faccion) {
		this.nombre = nombre;
		this.energia = energia;
		this.posicion = posicion;
		this.faccion = faccion;
	}
	
	public abstract void atacar(Naves objetivo);
	public void recibeDanio(int cantidad) {
		if(cantidad <= 0) {
			return;
		}
		
	 if (this instanceof DestructorEstelar) {
         DestructorEstelar destructor = (DestructorEstelar) this;
         if (destructor.getNivelDeEscudo() > 0) {
             if (destructor.getNivelDeEscudo() >= cantidad) {
                 destructor.setNivelDeEscudo(destructor.getNivelDeEscudo() - cantidad);
             } else {
                 int escudoRestante = destructor.getNivelDeEscudo();
                 destructor.setNivelDeEscudo(0);
                 destructor.setEnergia(destructor.getEnergia() - (cantidad - escudoRestante));
             }
         } else {
             destructor.setEnergia(destructor.getEnergia() - cantidad);
         }
     } else {
         this.energia -= cantidad;
     }
 }

	public String getNombre() {
		return nombre;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public Faccion getFaccion() {
		return faccion;
	}

	public void setFaccion(Faccion faccion) {
		this.faccion = faccion;
	}
	
	protected abstract double getAlcance();
    protected boolean puedeAtacar(Naves objetivo) {
        double distancia = posicion.distancia(objetivo.getPosicion());
        return distancia <= getAlcance();
    }
    
    
    
    
    
}
