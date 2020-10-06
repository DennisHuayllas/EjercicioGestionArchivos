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

             if (fichero.delete())
                System.out.println("El fichero se ha creado correctamente");
              else
                System.out.println("No ha podido ser creado el fichero");

        }

}