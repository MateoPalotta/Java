package futbol;

import java.util.Iterator;

public class Prueba{
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Ac Milanesa");

        System.out.println(equipo.agregaDelantero("Villaluca", 0.7, 0.9));
        System.out.println(equipo.agregaDefensor("Rodriguez", 0.8, 0.5));
        System.out.println(equipo.agregaArquero("Bolonqui", 0.6, 0.8, 1));

        Iterator<Jugador> iterador = equipo.getJugadores();
        while (iterador.hasNext()) {
            Jugador jugador = iterador.next();
            System.out.println(jugador);
        }

        double indiceDefensa = equipo.indiceDefensa();
        double indiceAtaque = equipo.indiceAtaque();

        System.out.println("Indice de defensa del equipo: " + indiceDefensa);
        System.out.println("Indice de ataque del equipo: " + indiceAtaque);
    }
}