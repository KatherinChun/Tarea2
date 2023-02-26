
package tareas;
import java.util.ArrayList;
import java.util.Scanner;


public class Listado {
	
	private ArrayList <Alumno> datos; 
	tarea2 men = new tarea2();
	
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
		Alumno existe = buscar(datos, carnet);
	    if (existe != null) {
	        System.out.println(existe.toString());
	    }
		Alumno alumno = new Alumno(nombre,edad,carnet,genero);
		datos.add(alumno);
		
		
		
		
		
		
		
		
	}
	
	public void devolverinformacion() {
		
		
		for(int i=0; i<datos.size(); i++) {
			System.out.println(datos.get(i).toString());
		}
		
		
	}
	
	
	
	public static Alumno buscar(ArrayList<Alumno> datos, String carnet) {
	    for (int i = 0; i < datos.size(); i++) {
	        if (carnet.equals(datos.get(i).getCarnet())) {
	            System.out.println("Carnet repetido, eliminando alumno anterior");
	            Alumno alumno = datos.get(i);
	            datos.remove(i);
	            return alumno;
	        }
	    }
	    return null;
	}

	
	

	

	
	
}
