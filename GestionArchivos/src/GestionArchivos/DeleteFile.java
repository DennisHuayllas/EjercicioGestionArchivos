package GestionArchivos;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

    File fichero ;


    protected DeleteFile() {

        fichero = null ; 
    }
     protected DeleteFile(String nruta,String nfichero) throws IOException {


            fichero = new File (nruta,nfichero);

             if ( fichero.exists() && fichero.delete())
                System.out.println("El fichero se ha borrado correctamente");
              else
                System.out.println("No ha podido ser borrar el fichero");

        }

}