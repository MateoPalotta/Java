package modelo;

public class Caballero extends Personaje {
    private static final int VITALIDAD_INICIAL = 800;
    private static final double DISTANCIA_ATAQUE = 5;
    private static final int DANIO_ATAQUE = 10;
    private static final int ARMADURA_INICIAL = 500;

    private int nivelArmadura;

    public Caballero(String nombre, Posicion posicion) {
        super(nombre, VITALIDAD_INICIAL, posicion);
        this.nivelArmadura = ARMADURA_INICIAL;
    }

    public int getNivelArmadura() {
        return nivelArmadura;
    }

    public void setNivelArmadura(int nivelArmadura) {
        this.nivelArmadura = nivelArmadura;
    }

    @Override
    public boolean ataca(Personaje adversario) {
        double distancia = calcularDistancia(adversario);
        if (distancia <= DISTANCIA_ATAQUE) {
            adversario.recibeDanio(DANIO_ATAQUE);
            return true;
        }
        return false;
    }

    @Override
    public void recibeDanio(int cantidad) {
        if (nivelArmadura > 0) {
            nivelArmadura -= cantidad;
            if (nivelArmadura < 0) {
                nivelArmadura = 0;
            }
        } else {
            setVitalidad(getVitalidad() - cantidad);
        }
    }
}
