import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Funciones {
    public String  CreateDirectory(String name) {

        File file = new File("data\\" + name );

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

                    BufferedWriter writer = new BufferedWriter(new FileWriter("data\\Metadata.txt",true));
                    writer.append(name + ',' + '0');
                    writer.newLine();
                    writer.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }



                System.out.println("La base de datos "+name+" fue creada.");
                return "La base de datos "+name+" fue creada.";
            } else {
                System.out.println(" El directorio no pudo ser creado");
                return "ERROR: La base de datos "+name+" no pudo ser creada.";

            }
        }
        else {
            System.out.println("El directorio o nombre de su Base de Datos ya existe");
            return "El directorio o nombre de su Base de Datos "+name+" ya existe.";

        }
    }

    public void CreateMetadata(){
        try {
            File file = new File("data\\Metadata.txt");

            /*
            Metodo createNewFile devuelve un booleano
            True si el archivo nombrado no existe y se creó correctamente, de lo contrario False
            */

            if (!file.exists()){
                file.createNewFile();
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

    public String ModifyNameDirectory(String nameDB, String newNameDB){
        File file = new File("data\\" + nameDB );

        // Comprueba si el directoria  existe
        if (!file.exists()) {

            // Mensaje para mostrar en consola y a usuario
            String mensaje = "La Base de Datos  o directorio no existe";
            System.out.println(mensaje);
            return mensaje;

        } else{
            // Renombra el directorio y DB dentro del archivo Metadata.txt
            File filerename = new File ("data\\" + newNameDB);
            file.renameTo(filerename);
            RenameDBMetadata(nameDB, newNameDB);

            // Mensaje para mostrar en consola y a usuario
            String mensaje = "El cambio de nombre se realizo con exito";
            System.out.println(mensaje);
            return mensaje;

        }
    }

    public void RenameDBMetadata (String nameDB, String newNameDB){

        Path path = Paths.get("data\\Metadata.txt");
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

    public String DeleteDirectory(String nameDB){

        File directory = new File("data\\" + nameDB );

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
    
    /*
        Muestra los documentos existentes en un fichero. Si no hay, devuelve mensaje de que no existen bases de datos
    */
    public String showDB (){
        String mensaje="";
        String sDirectorio = "C:\\Users\\JoiceAndrea\\Documents\\Joice Miranda\\7mo Semestre\\Progra";
        File f = new File(sDirectorio);
        if (f.exists()){
            mensaje=mensaje+"Las bases de datos actuales son: \n ";
            File[] ficheros = f.listFiles();

            if (ficheros.length==0){
                mensaje="No existen bases de datos";
                return mensaje;
            }

            for (int x=0;x<ficheros.length;x++){
                mensaje= mensaje+ ficheros[x].getName() +"\n";
            }
        }
        else{
            mensaje="No existen bases de datos";
        }

        return mensaje;
    }
    
    
        /*
        Verifica que exista la base de datos en el directorio principal.
        Si existe, cambia la variable BDActual al nombre ingresado. 
     */
    public String UseDB(String nombreBD){
        String mensaje ="";
        String sDirectorio = "data\\"+nombreBD;
        File f = new File(sDirectorio);
        if (f.exists()){
            BDActual= nombreBD;
            mensaje="La base de datos actual es " +nombreBD;
            
        }
        else {
            mensaje="La base de datos "+nombreBD+" no existe";
            
        }
        return mensaje;
    }
    
    public String CreateTable(String name){
        String mensaje = CreateDirectoryTable( BDActual, name);
        return mensaje;


    }

    public String  CreateDirectoryTable(String BDActual, String name) {
        String mensaje="";

        File file = new File("data\\" +BDActual+"\\"+name );

        // Comprueba si el directoria ya existe
        if (!file.exists()) {

            /*
            Metodo mkdir devuelve un booleano
            True si el directorio fue creado, de lo contrario False
            */
            if (file.mkdir()) {
                // Intenta Crear el archivo .txt de Metadata
                mensaje = CreateMetadataTabla(BDActual,name);

                // Escribe en el archivo Metadata la nueva DB
                try  {

                    BufferedWriter writer = new BufferedWriter(new FileWriter("data\\Metadata.txt",true));
                    writer.append(name + ',' + '0');
                    writer.newLine();
                    writer.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }



                System.out.println("La Tabla "+name+" fue creada.");
                return mensaje +"\n La Tabla "+name+" fue creada.";
            } else {
                System.out.println(" El directorio no pudo ser creado");
                return mensaje +"\n ERROR: La Tabla "+name+" no pudo ser creada.";

            }
        }
        else {
            System.out.println("El directorio o nombre de su Tabla ya existe");
            return mensaje +"\n El directorio o nombre de su Tabla "+name+" ya existe.";

        }
    }

    public String CreateMetadataTabla(String BDActual, String nombreTabla){
        try {
            File file = new File("data\\"+BDActual+"\\"+nombreTabla+"\\Metadata.txt");

            /*
            Metodo createNewFile devuelve un booleano
            True si el archivo nombrado no existe y se creó correctamente, de lo contrario False
            */

            if (!file.exists()){
                file.createNewFile();
                return "El archivo de texto 'Metadata' fue creado correctamente";
            }
            else{
                return"Ya existe un archivo Metadata";
            }
        }

        catch (IOException e){
            return "Ocurrió una excepción: No se pudo crear archivo Metadata o este no se pudo encontrar";

        }
    }
    
    /*
    Muestra los ficheros existentes en la Base de datos actual
     */
    public String showTable (String BDActual){
        String mensaje="";
        String sDirectorio = "data\\"+BDActual;
        File f = new File(sDirectorio);
        if (f.exists()){
            mensaje=mensaje+"Las tablas actuales de la base de datos"+ BDActual+ "son: \n ";
            File[] ficheros = f.listFiles();

            if (ficheros.length==0){
                mensaje="No existen tablas";
                return mensaje;
            }

            for (int x=0;x<ficheros.length;x++){
                mensaje= mensaje+ ficheros[x].getName() +"\n";
            }
        }
        else{
            mensaje="No existen tablas";
        }

        return mensaje;
    }

    public String ModifyTable (String nameTable, String newNameTable, String ActualDB){

        File file = new File("C:\\Users\\Jose Ramirez\\Downloads\\Test\\" + ActualDB + "\\" + nameTable);

        // Comprueba que la tabla exista dentro de la DB actual.
        if (!file.exists()) {

            // Mensaje para mostrar en consola y a usuario
            String mensaje = "La tabla que desea modificar no existe.";
            System.out.println(mensaje);
            return mensaje;

        } else{
            // Renombra la tabla y el nombre de la tabla dentro de su archivo Metadata (Nombre de Tabla).txt
            File filerename = new File ("C:\\Users\\Jose Ramirez\\Downloads\\Test\\" + ActualDB + "\\" + newNameTable);
            file.renameTo(filerename);
            RenameTableMetadata(nameTable, newNameTable, ActualDB);

            // Mensaje para mostrar en consola y a usuario
            String mensaje = "El cambio de nombre se realizo con exito";
            System.out.println(mensaje);
            return mensaje;
        }

    }
    public void RenameTableMetadata(String nameTable, String newNameTable, String ActualDB){
        Path path = Paths.get("C:\\Users\\Jose Ramirez\\Downloads\\Test\\" + ActualDB + "\\Metadata.txt");
        Charset charset = StandardCharsets.UTF_8;

        try{
            /*
            Se va a buscar dentro de contenido del archivo.
            Si se encuentra el nombre de la tabla (nameTable), se realizara el remplazo a newNameTable.
             */

            String content = new String(Files.readAllBytes(path), charset);
            content = content.replace(nameTable, newNameTable);
            Files.write(path, content.getBytes(charset));

        } catch(IOException e) {
            System.out.println("Ocurrió una IOexception: No se pudo realizar el renombre la tabla " +
                    " en el archivo Metadata.txt correspondiente.");
            e.printStackTrace();
        }
    }

    
}
