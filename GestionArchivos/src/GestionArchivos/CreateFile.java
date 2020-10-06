package GestionArchivos;

import java.io.File;
import java.io.IOException;

public class CreateFile {


    File fichero ;

    protected CreateFile() {

        fichero = null;

    }
     protected CreateFile(String nruta,String nfichero) {

    	 
        fichero = new File (nruta,nfichero);

         try {

              if (fichero.createNewFile())
                System.out.println("El fichero se ha creado correctamente");
              else
                System.out.println("No ha podido ser creado el fichero");
            } catch (IOException ioe) {
              ioe.printStackTrace();
            }

         }

}