package GestionArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	
	protected ReadFile(String fichero) throws FileNotFoundException {
		
		String cadena=null;
		FileReader ficherolectura= new FileReader(fichero);
		BufferedReader buffer= new BufferedReader(ficherolectura);
		
		try {
			while((cadena = buffer.readLine())!=null) {
				
				System.out.println(cadena);
			}
		}catch( FileNotFoundException e)
		{
		System.out.println("Fichero "+fichero+" no encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
