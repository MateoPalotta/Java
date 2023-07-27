package modelo;

public class Arquero extends Personaje {
    private static final int VITALIDAD_INICIAL = 500;
    private static final double DISTANCIA_ATAQUE_FLECHA = 100;
    private static final int DANIO_ATAQUE_FLECHA = 15;
    private static final double DISTANCIA_ATAQUE_CERCA = 5;
    private static final int DANIO_ATAQUE_CERCA = 5;
    private static final int FLECHAS_INICIALES = 20;

    private int cantidadFlechas;

    public Arquero(String nombre, Posicion posicion) {
        super(nombre, VITALIDAD_INICIAL, posicion);
        this.cantidadFlechas = FLECHAS_INICIALES;
    }

    public int getCantidadFlechas() {
        return cantidadFlechas;
    }

    public void setCantidadFlechas(int cantidadFlechas) {
        this.cantidadFlechas = cantidadFlechas;
    }

    public void recuperarFlechas(int cantidadRecuperada) {
        cantidadFlechas += cantidadRecuperada;
    }

    @Override
    public boolean ataca(Personaje adversario) {
        double distancia = calcularDistancia(adversario);
        if (cantidadFlechas > 0 && distancia <= DISTANCIA_ATAQUE_FLECHA) {
            adversario.recibeDanio(DANIO_ATAQUE_FLECHA);
            cantidadFlechas--;
            return true;
        } else if (distancia <= DISTANCIA_ATAQUE_CERCA) {
            adversario.recibeDanio(DANIO_ATAQUE_CERCA);
            return true;
        }
        return false;
    }

    @Override
    public void recibeDanio(int cantidad) {
        setVitalidad(getVitalidad() - cantidad);
    }
}
