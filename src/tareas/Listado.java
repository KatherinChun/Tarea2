
package tareas;
import java.util.ArrayList;
import java.util.Scanner;
public class Listado {
	
	private ArrayList <Alumno> datos; 
	 
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void creararray() {
		 datos = new ArrayList();
	}
	
	public void insertarnombres() {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese los datos del alumno");
		System.out.println("Ingrese el nombre: ");
		String nombre=entrada.next();
		System.out.println("Ingrese la edad: ");
		String edad=entrada.next();
		System.out.println("Ingrese el carnet: ");
		String carnet=entrada.next();
		System.out.println("Ingrese el genero: ");
		String genero=entrada.next();
		Alumno alumno = new Alumno(nombre,edad,carnet,genero);
		datos.add(alumno);
		System.out.println("Agregado con exito");
	}
	
	public void devolverinformacion() {
		
		
		for(int i=0; i<datos.size(); i++) {
			System.out.println(datos.get(i).toString());
		}
		
		
	}

	
	
}
