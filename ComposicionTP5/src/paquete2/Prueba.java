package paquete2;

public class Prueba {
	public static void main(String[] args) {
        Equipo equipo = new Equipo("AC Milanesa", 2023);

        Jugador jugador1 = new Jugador("Antonio", 20, "Delantero", 7.0);
        Jugador jugador2 = new Jugador("Mateo", 17, "Mediocampista", 8.8);
        Jugador jugador3 = new Jugador("Lucas", 21, "Arquero", 8.0);

        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);

        System.out.println(equipo);
        System.out.println("Cantidad de jugadores: " + equipo.getCantidadJugadores());
        System.out.println("Promedio de edad general: " + equipo.getPromedioEdadGeneral());
        System.out.println("Promedio de edad de los mayores: " + equipo.getPromedioEdadMayores());
        System.out.println("Promedio de edad de los menores: " + equipo.getPromedioEdadMenores());
        System.out.println("Efectividad del equipo: " + equipo.getEfectividadEquipo());

        equipo.quitarJugador(jugador2);

        System.out.println(equipo);
        System.out.println("Cantidad de jugadores: " + equipo.getCantidadJugadores());
    }
}
