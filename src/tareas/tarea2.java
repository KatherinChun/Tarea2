package tareas;

import java.util.Scanner;


public class tarea2 {
	
	public static void main(String[] args) {
		
		
		
		
		Listado lis = new Listado();
		lis.creararray();
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int elegir;
		
		
		
		
		
		do {
			
			
			
			System.out.println("Bienvenido");
			System.out.println("1. Ingresar nuevos alumnos al listado");
			System.out.println("2. Ver todos los alumnos ingresados dentro del listado");
			System.out.println("3. Salir");
			elegir=entrada.nextInt();
			
			switch(elegir) {
			case 1:
					
					lis.insertarnombres();
				
			break;
			
			case 2:
					lis.devolverinformacion();
				break;

			
			}
			
		}while(elegir!=3);
		


	}
}
