import java.io.File;
import java.io.IOException;

public class CreateDB {

    public void  CreateDirectory(String name){

        File file = new File("C:\\Users\\Jose Ramirez\\Downloads\\Test\\" + name );

        // Comprueba si el directoria ya existe
        if (!file.exists()) {

            /*
            Metodo mkdir devuelve un booleano
            True si el directorio fue creado, de lo contrario False
            */
            if (file.mkdir()) {
                System.out.println("El directorio fue creado");
            } else {
                System.out.println(" El directorio no pudo ser creado");

            }
        }
        else {
            System.out.println("El directorio o nombre de su Base de Datos ya existe");

        }
    }

    public void CreateMetadata(){
        try {
            File file = new File("C:\\Users\\Jose Ramirez\\Downloads\\Test\\Metedata.txt");

            /*
            Metodo createNewFile devuelve un booleano
            True si el archivo nombrado no existe y se creó correctamente, de lo contrario False
            */

            if (file.createNewFile()){
                System.out.println("El archivo de texto 'Metadata' fue creado correctamente");
            }
            else{
                System.out.println("Ya existe un archivo Metadata");
                // Se ha ingresa los valores de la DB a la MetaData

            }
        }

        catch (IOException e){
            System.out.println("Ocurrió una excepción: No se pudo crear archivo Metadata o este no se pudo encontrar");
            e.printStackTrace();

        }
    }
}
