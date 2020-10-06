package GestionArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class CopyFile {
	
	String ficheroacopiar;
	protected CopyFile(String rutafichero ,String nombrefichero) throws UnsupportedEncodingException {
		
		CrearFichero(rutafichero,nombrefichero);
		ficheroacopiar=nombrefichero;
		
	}
	
	protected void CrearFichero(String rutafichero,String nombrefichero) throws UnsupportedEncodingException {
		
		String cadena=null;
		FileReader f=null;
		File fichero=null;
		ArrayList<String>texto=new ArrayList();
		
		try
		{
		f= new FileReader(nombrefichero);
		BufferedReader b = new BufferedReader(f);
		fichero= new File(rutafichero,"ficherocopiado.txt");
		
		try {
			  // A partir del objeto File creamos el fichero físicamente
			  if (!fichero.exists() &&fichero.createNewFile())
			    System.out.println("Fichero copiado correctamente ");
			  else
			    System.out.println("No ha podido ser creado el fichero");
			} catch (IOException ioe) {
			  ioe.printStackTrace();
			}
		while((cadena = b.readLine())!=null)
		{
			texto.add(cadena);
		}
		b.close();
		}catch( FileNotFoundException e)
		{
		System.out.println("Fichero "+nombrefichero+" no encontrado");
		}catch( IOException e)
		{
		System.out.println("IOException :o");
		}
		
		Writer out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero),"UTF-8"));
			
			// Escribimos linea a linea en el fichero
			
				try {
					for(int i=0;i<texto.size();i++) {
							
						out.write(texto.get(i)+"\n");			
					}
				
					
				} catch (IOException ex) {
					System.out.println("Mensaje excepcion escritura: " + ex.getMessage());
				}

		} catch (FileNotFoundException ex2) {
			System.out.println("Mensaje error 2: " + ex2.getMessage());
		} finally {
			try {
				out.close();
			} catch (IOException ex3) {
				System.out.println("Mensaje error cierre fichero: " + ex3.getMessage());
			}
		}

		
  }
				

}
