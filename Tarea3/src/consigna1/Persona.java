package consigna1;

public class Persona {

		  private String nombre;
		  private int edad;
		  private String email;
		  
		  public Persona(String nombre, int edad, String email) {
		    this.nombre = nombre;
		    this.edad = edad;
		    this.email = email;
		  }
		  
		  public String getNombre() {
		    return this.nombre;
		  }
		  public void setNombre(String nombre) {
			 this.nombre = nombre;
		  }
		  public int getEdad() {
		    return this.edad;
		  }
		  public void setEdad(int edad) {
			this.edad = edad;
		  }
		  public String getEmail() {
		    return this.email;
		  }
		  public void setEmail(String email) {
			this.email = email;
		  }

		public boolean sosMayor() {
		    return this.edad >= 18;
		  }
		  
		public int contarLetrasRepetidas() {
			  int[] repeticiones = new int[26];
			  int repeticion = 0;
			  
			  for (int i = 0; i < this.nombre.length(); i++) {
			    char letra = Character.toLowerCase(this.nombre.charAt(i));
			    if (letra >= 'a' && letra <= 'z') {
			      repeticiones[letra - 'a']++;
			    }
			  }
			  
			  for (int i = 0; i < repeticiones.length; i++) {
			    if (repeticiones[i] > 1) {
			      repeticion++;
			    }
			  }
			  
			  return repeticion;
		}
}

