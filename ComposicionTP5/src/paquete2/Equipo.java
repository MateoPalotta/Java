package paquete2;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
	private String nombre;
    private int anoCreacion;
    private List<Jugador> jugadores;

    public Equipo(String nombre, int anoCreacion) {
        this.nombre = nombre;
        this.anoCreacion = anoCreacion;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnoCreacion() {
        return anoCreacion;
    }

    public int getCantidadJugadores() {
        return jugadores.size();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void quitarJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }

    public double getPromedioEdadGeneral() {
        if (jugadores.isEmpty()) {
            return 0.0;
        }

        int sumaEdades = 0;
        for (Jugador jugador : jugadores) {
            sumaEdades += jugador.getEdad();
        }

        return (double) sumaEdades / jugadores.size();
    }

    public double getPromedioEdadMayores() {
        if (jugadores.isEmpty()) {
            return 0.0;
        }

        int sumaEdadesMayores = 0;
        int cantidadMayores = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getEdad() >= 18) {
                sumaEdadesMayores += jugador.getEdad();
                cantidadMayores++;
            }
        }

        if (cantidadMayores == 0) {
            return 0.0;
        }

        return (double) sumaEdadesMayores / cantidadMayores;
    }

    public double getPromedioEdadMenores() {
        if (jugadores.isEmpty()) {
            return 0.0;
        }

        int sumaEdadesMenores = 0;
        int cantidadMenores = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getEdad() < 18) {
                sumaEdadesMenores += jugador.getEdad();
                cantidadMenores++;
            }
        }

        if (cantidadMenores == 0) {
            return 0.0;
        }

        return (double) sumaEdadesMenores / cantidadMenores;
    }

    public double getEfectividadEquipo() {
        double sumaEfectividad = 0.0;
        for (Jugador jugador : jugadores) {
            sumaEfectividad += jugador.getEfectividad();
        }
        return sumaEfectividad;
    }

    @Override
    public String toString() {
        return "Equipo [nombre=" + nombre + ", anoCreacion=" + anoCreacion + ", jugadores=" + jugadores + "]";
    }
}
