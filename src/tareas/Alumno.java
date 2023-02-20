package tareas;

class Alumno {
	private String Nombre;
	private String Edad;
	private String Carnet;
	private String Genero;



	public Alumno(String Nombre, String Edad, String Carnet, String Genero) {
		// TODO Auto-generated constructor stub
		this.Nombre = Nombre;
		this.Edad = Edad;
		this.Carnet = Carnet;
		this.Genero = Genero;
	}


	public String getNombre() {
		return Nombre;
	}
	
	
	public String getEdad() {
		return Edad;
	}
	
	
	
	public String getCarnet() {
		return Carnet;
	}
	

	
	public String getGenero() {
		return Genero;
	}
	
	
	public String toString() {
		return "Nombres: " + Nombre + " " + "Edad: " + Edad +  " " + "Carnet: " + Carnet + " " + "Genero: " + Genero + "\n";
	}

	
		
}

	