import java.io.*;

public class CreateDB {

    public void  CreateDirectory(String name) {

        File file = new File("C:\\Users\\Jose Ramirez\\Downloads\\Test\\" + name );

        // Comprueba si el directoria ya existe
        if (!file.exists()) {

            /*
            Metodo mkdir devuelve un booleano
            True si el directorio fue creado, de lo contrario False
            */
            if (file.mkdir()) {
                // Intenta Crear el archivo .txt de Metadata
                CreateMetadata();

                // Escribe en el archivo Metadata la nueva DB
                try  {

                    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Jose Ramirez\\Downloads\\Test\\Metadata.txt"));
                    writer.append(name + ',' + '0');
                    writer.append('\n');
                    writer.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }



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
            File file = new File("C:\\Users\\Jose Ramirez\\Downloads\\Test\\Metadata.txt");

            /*
            Metodo createNewFile devuelve un booleano
            True si el archivo nombrado no existe y se creó correctamente, de lo contrario False
            */

            if (file.createNewFile()){
                System.out.println("El archivo de texto 'Metadata' fue creado correctamente");
            }
            else{
                System.out.println("Ya existe un archivo Metadata");

            }
        }

        catch (IOException e){
            System.out.println("Ocurrió una excepción: No se pudo crear archivo Metadata o este no se pudo encontrar");
            e.printStackTrace();

        }
    }
}
