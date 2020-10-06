package GestionArchivos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class mainGestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String nombre,ruta ;
		int opcion ; 
		
		do {
			
			System.out.println("---------------------GESTOR MENU-----------------------");
			System.out.println();
			System.out.println("1. Copiar archivos multiples desde un archivo de origen");
			System.out.println("2. Crear fichero ");
			System.out.println("3. Borrar fichero ");
			System.out.println("4. Mostrar fichero");
			System.out.println("5. Salir del programa ");
			System.out.println();
			System.out.println("Introduzca una opcion a realizar : ");
			System.out.println("---------------------------------------------------------");
			
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch (opcion) {
			
			case 1 :
				
				System.out.println("introduzca la ruta del fichero que desea copiar");
				 nombre=teclado.nextLine();
				System.out.println("introduzca la ruta donde desea copiar");
				 ruta =teclado.nextLine();
				
				try {
					CopyFile copiarArchivo= new CopyFile(ruta,nombre);
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			break ; 
			
			case 2 : 
				System.out.println("Introduzca el nombre del archivo ");
				 nombre=teclado.nextLine();
				System.out.println("Introduzca la ruta del archivo");
				 ruta =teclado.nextLine();
				 
				 CreateFile crearArchivo= new CreateFile(ruta,nombre);
				
			break ; 
			
			
			case 3 :
			
				System.out.println("Introduzca el nombre del archivo ");
				 nombre=teclado.nextLine();
				System.out.println("Introduzca la ruta del archivo");
				 ruta =teclado.nextLine();
				 
				 try {
					DeleteFile borrarArchivo= new DeleteFile(ruta,nombre);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break ; 
			
			
			case 4 : 

				System.out.println("Introduzca la ruta del fichero ");
				nombre = teclado.nextLine();
				
				try {
					ReadFile leerArchivo = new ReadFile(nombre);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
			
			case 5 : 
			
				System.out.println("Saliendo del programa...");
				System.out.close();
			break ; 
			
			default:
				System.out.println("No es una opcion admitida");
				break;
			}
		} while (opcion !=5);
		
		
		
	}

}
