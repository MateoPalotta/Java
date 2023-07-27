package Paquete;

public class Persona {
    private final String nombre;
    private int edad;
    private String email;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean sosMayor() {
        return edad >= 18;
    }

    public int repeticionesDeLetra(char letra) {
        int contador = 0;
        for (char c : nombre.toCharArray()) {
            if (Character.toLowerCase(c) == Character.toLowerCase(letra)) {
                contador++;
            }
        }
        return contador;
    }

    @Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
	}
}
