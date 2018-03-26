import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ModifyDB {

    public String ModifyNameDirectory(String nameDB, String newNameDB){
        File file = new File("C:\\Users\\Jose Ramirez\\Downloads\\Test\\" + nameDB );

        // Comprueba si el directoria  existe
        if (!file.exists()) {

            // Mensaje para mostrar en consola y a usuario
            String mensaje = "La Base de Datos  o directorio no existe";
            System.out.println(mensaje);
            return mensaje;

        } else{
            // Renombra el directorio y DB dentro del archivo Metadata.txt
            File filerename = new File ("C:\\Users\\Jose Ramirez\\Downloads\\Test\\" + newNameDB);
            file.renameTo(filerename);
            RenameDBMetadata(nameDB, newNameDB);

            // Mensaje para mostrar en consola y a usuario
            String mensaje = "El cambio de nombre se realizo con exito";
            System.out.println(mensaje);
            return mensaje;

        }
    }

    public void RenameDBMetadata (String nameDB, String newNameDB){

        Path path = Paths.get("C:\\Users\\Jose Ramirez\\Downloads\\Test\\Metadata.txt");
        Charset charset = StandardCharsets.UTF_8;

        try{
            /*
            Se va a buscar dentro de contenido del archivo.
            Si se encuentra el nombre de la DB, se realizara el remplazo.
             */
            String content = new String(Files.readAllBytes(path), charset);
            content = content.replace(nameDB, newNameDB);
            Files.write(path, content.getBytes(charset));

        } catch(IOException e) {
            System.out.println("Ocurrió una IOexception: No se pudo realizar el renombre de la DB" +
                    " en el archivo Metadata.txt");
            e.printStackTrace();

        }
    }
}
