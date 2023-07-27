package modelo;

public class Guerrero extends Personaje {
    private static final int VITALIDAD_INICIAL = 500;
    private static final double DISTANCIA_ATAQUE = 10;
    private static final int DANIO_ATAQUE = 10;

    public Guerrero(String nombre, Posicion posicion) {
        super(nombre, VITALIDAD_INICIAL, posicion);
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
        setVitalidad(getVitalidad() - cantidad);
    }
}
