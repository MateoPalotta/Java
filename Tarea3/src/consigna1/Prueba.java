package consigna1;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    Persona persona = new Persona("Mateo", 17, "mateopalotta@gmail.com");
			    
			    System.out.println("Nombre: " + persona.getNombre());
			    System.out.println("Edad: " + persona.getEdad());
			    System.out.println("Email: " + persona.getEmail());
			    
			    boolean esMayor = persona.sosMayor();
			    System.out.println("Es mayor de edad?: " + esMayor);
			    
			    int repeticiones = persona.contarLetrasRepetidas();
			    System.out.println("Cantidad de letras repetidas: " + repeticiones);
			  }
	}

