import java.io.File;
import java.io.IOException;

/*
Clases DeleteDirectory y Delete obtenidas de:
https://www.mkyong.com/java/how-to-delete-directory-in-java/ by mkyong
 */

public class DeleteDB {
    public String DeleteDirectory(String nameDB){

        File directory = new File("C:\\Users\\Jose Ramirez\\Downloads\\Test\\" + nameDB );

        //make sure directory exists
        if(!directory.exists()){

            String mensaje = "El directorio no existe.";
            System.out.println(mensaje);
            return mensaje;

        // Si el directorio existe, entonces utiliza la funcion 'delete'.
        }else{
            try{
                Delete(directory);
                String mensaje = "El directorio fue eliminado con exito.";
                return mensaje;

            }catch(IOException e){
                String mensaje = "Se produjo un error al tratar de eliminar el directorio.";
                e.printStackTrace();
                return mensaje;
            }
        }

    }
    /*
    La funcion elimina el directorio y todos sus elementos dentro.
    Esto es porque solo se puede eliminar un directorio si este esta vacio.
     */

    public static void Delete(File file)
            throws IOException {

        if(file.isDirectory()){

            // Si el directorio se encuentra vacio, entonces se elimina
            if(file.list().length==0){

                file.delete();
                System.out.println("El directorio fue eliminado: "
                        + file.getAbsolutePath());

            }
            /*
            Si el directorio no se encuentra vacio, lista todos los elemntos del directorio
            y elimina cada uno de estos.
             */
            else{
                //list all the directory contents
                String files[] = file.list();

                for (String temp : files) {
                    //construct the file structure
                    File fileDelete = new File(file, temp);

                    //recursive delete
                    Delete(fileDelete);
                }

                //check the directory again, if empty then delete it
                if(file.list().length==0){
                    file.delete();
                    System.out.println("El directorio fue eliminado: "
                            + file.getAbsolutePath());
                }
            }

        }else{
            // Si el archivo no es un directorio, entonces lo elimina
            file.delete();
            System.out.println("El archivo fue eliminado: " + file.getAbsolutePath());
        }
    }
}
