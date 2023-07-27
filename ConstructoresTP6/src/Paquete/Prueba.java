package Paquete;

public class Prueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Mateo", 17, "Mateo@gmail.com");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Email: " + persona1.getEmail());

        System.out.println("Persona1 es mayor de edad?: " + persona1.sosMayor());

        char letra = 'a';
        int repeticiones = persona1.repeticionesDeLetra(letra);
        System.out.println("Repeticiones de la letra '" + letra + "' en el nombre de persona1: " + repeticiones);
        
        System.out.println(persona1.toString());

    }
}
