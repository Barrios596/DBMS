import java.io.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

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
            return "ERROR: El directorio o nombre de su Base de Datos "+name+" ya existe.";

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
                System.out.println("ERROR: Ya existe un archivo Metadata");
            }
        }

        catch (IOException e){
            System.out.println("ERROR: Ocurrió una excepción: No se pudo crear archivo Metadata o este no se pudo encontrar");
            e.printStackTrace();

        }
    }

    public String ModifyNameDirectory(String nameDB, String newNameDB){
        File file = new File("data\\" + nameDB );

        // Comprueba si el directoria  existe
        if (!file.exists()) {

            // Mensaje para mostrar en consola y a usuario
            String mensaje = "ERROR: La Base de Datos  o directorio no existe";
            System.out.println(mensaje);
            return mensaje;

        } else{
            // Renombra el directorio y DB dentro del archivo Metadata.txt
            File filerename = new File ("data\\" + newNameDB);
            file.renameTo(filerename);
            RenameDBMetadata(nameDB, newNameDB);

            // Mensaje para mostrar en consola y a usuario
            String mensaje = "El cambio de nombre se realizó con exito";
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
            System.out.println("ERROR: Ocurrió una IOexception: No se pudo realizar el renombre de la DB" +
                    " en el archivo Metadata.txt");
            e.printStackTrace();

        }
    }

    public String DeleteDirectory(String nameDB){

        File directory = new File("data\\" + nameDB );

        //make sure directory exists
        if(!directory.exists()){

            String mensaje = "ERROR: El directorio "+nameDB+" no existe.";
            System.out.println(mensaje);
            return mensaje;

            // Si el directorio existe, entonces utiliza la funcion 'delete'.
        }else{
            try{
                Delete(directory);
                String mensaje = "El directorio "+nameDB+" fue eliminado con exito.\n"+ deleteDBMetadata(nameDB);;
                return mensaje;

            }catch(IOException e){
                String mensaje = "ERROR: Se produjo un error al tratar de eliminar el directorio "+nameDB+".";
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
                    System.out.println("El directorio "+file.getName()+" fue eliminado: "
                            + file.getAbsolutePath());
                }
            }

        }else{
            // Si el archivo no es un directorio, entonces lo elimina
            file.delete();
            System.out.println("El archivo fue eliminado: " + file.getAbsolutePath());
        }
    }

    public String deleteDBMetadata(String nameDB){
        File input = new File("data\\Metadata.txt");
        File temp = new File("data\\temporal.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

            String current;
            while ((current = br.readLine()) != null){
                if(current.contains(nameDB)){
                    continue;
                }
                bw.write(current+System.getProperty("line.separator"));
            }
            br.close();
            bw.close();
            Delete(input);
            boolean successful = temp.renameTo(input);
            System.out.println(successful);
            return "Se eliminó la base de datos "+nameDB+" en el archivo de metadata.";
        }
        catch (IOException e){
            return "ERROR: No se encontró la base de datos "+nameDB+" en el archivo de metadata.";
        }

    }
    public String showDB (){
        String mensaje="";
        String sDirectorio = "data";
        File f = new File(sDirectorio);
        if (f.exists()){
            mensaje=mensaje+"Las bases de datos actuales son: \n ";
            File[] ficheros = f.listFiles();

            if (ficheros.length==0){
                mensaje="ERROR: No existen bases de datos";
                return mensaje;
            }

            for (int x=0;x<ficheros.length;x++){
                if(!ficheros[x].getName().equals("Metadata.txt")) {
                    mensaje = mensaje + ficheros[x].getName() + "\n";
                }
            }
        }
        else{
            mensaje="ERROR: No existen bases de datos";
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
            mensaje="La base de datos actual es " +nombreBD+".";
        }
        else {
            mensaje="ERROR: La base de datos "+nombreBD+" no existe.";

        }
        return mensaje;
    }

    public String CreateTable(String name,String BDActual){
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

                    BufferedWriter writer = new BufferedWriter(new FileWriter("data\\"+BDActual+"\\Metadata.txt",true));
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
            System.out.println("ERROR: El directorio o nombre de su Tabla ya existe");
            return mensaje +"\n ERROR: El directorio o nombre de su Tabla "+name+" ya existe.";

        }
    }

    public String CreateMetadataTabla(String BDActual, String nombreTabla){
        try {
            File file = new File("data\\"+BDActual+"\\"+nombreTabla+"\\Metadata.txt");
            File file1 = new File("data\\"+BDActual+"\\"+nombreTabla+"\\valores.txt");

            /*
            Metodo createNewFile devuelve un booleano
            True si el archivo nombrado no existe y se creó correctamente, de lo contrario False
            */

            if (!file.exists()){
                file.createNewFile();
                file1.createNewFile();
                return "El archivo de texto 'Metadata' fue creado correctamente";
            }
            else{
                return"ERROR: Ya existe un archivo Metadata";
            }
        }

        catch (IOException e){
            return "ERROR: Ocurrió una excepción: No se pudo crear archivo Metadata o este no se pudo encontrar";

        }
    }

    public void sumarTabla(String BDActual){
        try {
            File input = new File("data\\Metadata.txt");
            File temp = new File("data\\copia.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter("data\\copia.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("data\\Metadata.txt"));
            String current;
            while ((current = reader.readLine()) != null){
                if(current.contains(BDActual)){
                    System.out.println(current);
                    System.out.println(current.indexOf(','));
                    String inicial = current.substring(0,current.indexOf(','));
                    String indice = current.substring(current.indexOf(',')+1);
                    int cantidad = Integer.parseInt(indice);
                    cantidad++;
                    indice=String.valueOf(cantidad);
                    current=inicial+','+indice;
                }
                writer.write(current+System.getProperty("line.separator"));
            }
            reader.close();
            writer.close();
            Delete(input);
            boolean successful = temp.renameTo(input);
            System.out.println(successful);
        }catch (IOException e){
            System.out.println("ERROR: No se encontró el archivo de metadata.");
        }

    }

    public String RenameTable (String nameTable, String newNameTable, String ActualDB){

        File file = new File("data\\" + ActualDB + "\\" + nameTable);

        // Comprueba que la tabla exista dentro de la DB actual.
        if (!file.exists()) {

            // Mensaje para mostrar en consola y a usuario
            String mensaje = "ERROR: La tabla que desea modificar no existe.";
            System.out.println(mensaje);
            return mensaje;

        } else{
            // Renombra la tabla y el nombre de la tabla dentro de su archivo Metadata (Nombre de Tabla).txt
            File filerename = new File ("data\\" + ActualDB + "\\" + newNameTable);
            file.renameTo(filerename);
            RenameTableMetadata(nameTable, newNameTable, ActualDB);

            // Renombra el nombre de la tabla, en otros Metadata.txt de otras tablas.
            RenameTableOtherTableMetadata(nameTable, newNameTable, ActualDB);


            // Mensaje para mostrar en consola y a usuario
            String mensaje = "El cambio de nombre de "+nameTable+" a "+newNameTable+" se realizo con exito";
            System.out.println(mensaje);
            return mensaje;
        }

    }
    public void RenameTableMetadata(String nameTable, String newNameTable, String ActualDB){
        // Se crea un objeto file y uno temporal
        File input = new File("data\\" + ActualDB + "\\Metadata.txt");
        File temp = new File("data\\" + ActualDB + "\\temp.txt");

        try{
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

            String current;

            /*
            Se lee cada linea del archivo de texto
            Y divide la linea actual en un array de Strings
             */
            while ((current = br.readLine()) != null){
                String lineanueva = "";
                String [] parts = current.split(",");

                /*
                Se recorre el arreglo y se compara con el nombre  de DB que se desea cambiar
                Si se encuentra escribe sobre la linea el nuevo nombre
                 */
                for (int i = 0; i< parts.length;i++){
                    if (parts[i].equals(nameTable)){
                        lineanueva = lineanueva + newNameTable + ",";
                    }else {
                        lineanueva = lineanueva + parts[i] + ",";
                    }
                }
                bw.write(lineanueva.substring(0,lineanueva.length()-1) + System.getProperty("line.separator"));
            }

            br.close();
            bw.close();

            // Se sobrescribe el archivo Metadata.txt por el archivo temporal.
            Delete(input);
            boolean successful = temp.renameTo(input);
            System.out.println(successful);

            String mensaje = "Se realizo el remplazo del nombre de la tabla en el archivo Metadata.txt.";
            System.out.println(mensaje);

        }catch(IOException e){
            System.out.println("ERROR: Ocurrió una IOexception: No se pudo realizar el renombre la tabla " +
                    " en el archivo Metadata.txt correspondiente.");
        }
    }

    /*
        Muestra los ficheros existentes en la Base de datos actual
         */
    public  String showTable (String BDActual){
        String mensaje="";
        String sDirectorio = "data\\"+BDActual;
        File f = new File(sDirectorio);
        if (f.exists()){
            mensaje=mensaje+"Las tablas actuales de la base de datos"+ BDActual+ "son: \n ";
            File[] ficheros = f.listFiles();

            if (ficheros.length==0){
                mensaje="ERROR: No existen tablas";
                return mensaje;
            }

            for (int x=0;x<ficheros.length;x++){
                mensaje= mensaje+ ficheros[x].getName() +"\n";
            }
        }
        else{
            mensaje="ERROR: No existen tablas";
        }

        return mensaje;
    }


    public String AlterModifyTable (String BDActual,String nombreTable, String Accion, String nombre){
        String mensaje="";
        Accion.toLowerCase();
        String sDirectorio = "data\\"+BDActual+"\\"+nombreTable;
        File f = new File(sDirectorio);
        if (f.exists()){
            switch (Accion){
                case "addColumn":
                    String nombreColumna="";
                    String tipo="";
                    return addColumn(tipo,nombreColumna,BDActual,nombreTable);
            }
        }

        return mensaje;
    }

    public String addColumn (String tipo, String nombreColumna,String BDActual,String nombreTable ){
        String mensaje="";


        /*
        Escribe en valores,txt la nueva columna y coloca null en todos sus valores
         */

        File input = new File("data\\"+BDActual+"\\"+nombreTable+"\\valores.txt");
        File temp = new File("data\\"+BDActual+"\\"+nombreTable+"\\temporal.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

            String current = br.readLine();
            bw.write(current+','+ nombreColumna+System.getProperty("line.separator"));

            while ((current=br.readLine())  != null ){
                bw.write(current+","+ null +System.getProperty("line.separator"));
            }
            br.close();
            bw.close();
            Delete(input);
            boolean successful = temp.renameTo(input);
            mensaje=mensaje+ "\n Se actualizó la tabla "+nombreTable+" .";
        }
        catch (IOException e){
            mensaje=mensaje+ "\n ERROR: No se encontró la tabla "+nombreTable+" .";
        }


        /*
        Escribe en metadata la nueva columna
         */

        File input1 = new File("data\\"+BDActual+"\\"+nombreTable+"\\Metadata.txt");
        File temp1 = new File("data\\"+BDActual+"\\"+nombreTable+"\\temporal.txt");

        try {
            BufferedReader br1 = new BufferedReader(new FileReader(input1));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(temp1));

            String current;
            while ((current = br1.readLine()) != null){
                if(current.contains("PRIMARY KEY")){
                    bw1.write(nombreColumna+" "+tipo+System.getProperty("line.separator"));
                }
                bw1.write(current+System.getProperty("line.separator"));
            }
            br1.close();
            bw1.close();
            Delete(input1);
            boolean successful = temp1.renameTo(input1);
        }
        catch (IOException e){
            mensaje=mensaje+ "\n ERROR: No se encontró la tabla"+nombreTable+" en el archivo de metadata.";
        }

        return mensaje;

    }
    /**
     @author Joice Miranda
     @param BDActual es la base de datos que se esta usando actualmente
     @param nombreColumna nombre de la columna que se quiere eliminar
     @param nombreTable nombre de la tabla donde se encuentra la columna que se quiere elimar
     */

    public String DropColumn (String nombreColumna,String BDActual,String nombreTable ){
        String mensaje="";

        /*
        Eliminar de Valores toda la columna
         */
        File input = new File("data\\"+BDActual+"\\"+nombreTable+"\\valores.txt");
        File temp = new File("data\\"+BDActual+"\\"+nombreTable+"\\temporal.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

            String current=br.readLine();
            String[] parts = current.split(",");
            int index=0;
            boolean encontrado = false;
            String lineaNueva="";

            for (int i=0; i<parts.length;i++){
                if (parts[i].contains(nombreColumna)){
                    index=i;
                    encontrado=true;
                }
                else{
                    lineaNueva=lineaNueva+parts[i]+",";
                }
            }

            bw.write(lineaNueva.substring(0,lineaNueva.length()-1)+System.getProperty("line.separator"));

            while ((current = br.readLine()) != null){
                lineaNueva="";
                parts = current.split(",");

                for (int i=0; i<parts.length;i++){
                    //System.out.println("el i es "+i+" el index es "+index);
                    if (i!=index || !encontrado){
                        lineaNueva=lineaNueva+parts[i]+",";
                    }
                }

                bw.write(lineaNueva.substring(0,lineaNueva.length()-1)+System.getProperty("line.separator"));
            }
            br.close();
            bw.close();
            Delete(input);
            boolean successful = temp.renameTo(input);
            System.out.println(successful);
            if(!encontrado){
                return "ERROR: La columna "+nombreColumna+" no existe en la BD "+BDActual;
            }
            mensaje= "Se eliminó la columna "+nombreColumna+" de la BD"+ BDActual;
        }
        catch (IOException e){
            mensaje= "ERROR: Hubo un error al tratar de eliminar la columna "+nombreColumna+" de la Bd "+BDActual;
        }


        /*
        Eliminar el nombre y tipo de la columna en Metadata
         */

        File input1 = new File("data\\"+BDActual+"\\"+nombreTable+"\\Metadata.txt");
        File temp1 = new File("data\\"+BDActual+"\\"+nombreTable+"\\temporal1.txt");

        try {
            BufferedReader br1 = new BufferedReader(new FileReader(input1));
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(temp1));

            String current;
            while ((current = br1.readLine()) != null){
                if(!current.contains(nombreColumna)){
                    System.out.println(current);
                    bw1.write(current+System.getProperty("line.separator"));
                }

            }
            br1.close();
            bw1.close();
            Delete(input1);
            boolean successful = temp1.renameTo(input1);
        }
        catch (IOException e){
            mensaje=mensaje+ "\n ERROR: No se encontró la tabla"+nombreTable+" en el archivo de metadata.";
        }




        return mensaje;
    }

    /**
     * author:Joice Miranda
     * @param nombreTabla nombre de la tabla de donde queremos ver las columnas
     * @param nombreBD nombre de la Base de Datos donde se encuentra la tabla
     * @return un arreglo que contiene los nombres de las columnas
     */
    public String [] columnasExistentes (String nombreTabla, String nombreBD){
        String [] columnas= new String[1];
        /*
        Eliminar de Valores toda la columna
         */
        File input = new File("data\\"+nombreBD+"\\"+nombreTabla+"\\Valores.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(input));

            String current= br.readLine();
            if (current!=null){
                columnas=current.split(",");
            }
            br.close();
        }
        catch (IOException e){
            columnas[0]="ERROR: No hay elementos.";

        }
        return columnas;
    }

    /**
     * author: Joice Miranda
     * @param nombreTabla nombre de la tabla que contiene a las columnas
     * @param nombreBD nombre de la base de datos actual
     * @param nombrePK nombre de la Llave Primaria
     * @param columnas nombre de las columnas que van a ser llaves primarias
     * @return mensaje de exito o error de la accion
     */

    public String addPrimaryKey (String nombreTabla, String nombreBD, String nombrePK, String columnas) {
        String mensaje = "";
        boolean existe = false;
        /*
        Se revisan que existan las columnas ingresadas
         */

        String[] columnasReales = columnasExistentes(nombreTabla, nombreBD);
        String[] columnasIngresadas = columnas.split(",");
        for (int i = 0; i < columnasIngresadas.length; i++) {
            for (int j = 0; j < columnasReales.length; j++) {
                if (columnasIngresadas[i].equals(columnasReales[j])) {
                    existe = true;
                }
            }
        }
        if (existe==false){
            return "Columnas ingresadas son inexistentes";
        }

        /*
        Ingresar las llaves primarias
         */

        File input = new File("data\\"+nombreBD+"\\"+nombreTabla+"\\Metadata.txt");
        File temp = new File("data\\"+nombreBD+"\\"+nombreTabla+"\\temporal1.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

            String current;
            boolean primaria = false;
            while ((current = br.readLine()) != null){
                if(current.contains("FOREIGN KEY")){
                    primaria=false;
                }
                if (!primaria) {
                    bw.write(current + System.getProperty("line.separator"));
                }
                if(current.contains("PRIMARY KEY")){
                    primaria=true;
                    bw.write(nombrePK+" "+columnas+System.getProperty("line.separator"));
                }
            }
            br.close();
            bw.close();
            Delete(input);
            boolean successful = temp.renameTo(input);
            mensaje="La tabla "+nombreTabla+" ha sido actualizada";
        }
        catch (IOException e){
            mensaje="ERROR: No se encontró la tabla "+nombreTabla+" en la base de datos "+ nombreBD;

        }

        return mensaje;
    }
    /*
   Muestra los ficheros existentes en la Base de datos actual
    */

    /**
     * @author Joice Miranda
     * @param BDActual base de datos donde se encuentran las tablas
     * @return arreglo con el nombre de las tablas que existen en BDActual
     */
    public ArrayList<String> showTable2 (String BDActual){
        ArrayList<String> tablas = new ArrayList<String>();
        String sDirectorio = "data\\"+BDActual;
        File f = new File(sDirectorio);
        if (f.exists()){
            File[] ficheros = f.listFiles();

            if (ficheros.length==0){
                return tablas;
            }

            for (int x=0;x<ficheros.length;x++){
                if (!String.valueOf(ficheros[x]).contains("Metadata.txt") ){
                    tablas.add(String.valueOf(ficheros[x]));
                }
            }
        }
        else{
            return tablas;
        }

        return tablas;
    }

    /**
     * author Joice Miranda
     * @param nombreBD nombre de la base de datos que quiere ser verificada
     * @return las llaves foraneas de todas las tablas de nombreBD
     */

    public ArrayList<String> KFExistentes (String nombreBD ){
        ArrayList<String> archivos= showTable2(nombreBD);
        ArrayList<String> llaves = new ArrayList<String>();
        for (int a=0; a<archivos.size();a++){
            System.out.println(archivos.get(a));
        }

        /*
        Recorre los archivos en buscar de las llaves foraneas
         */
        for (int i=0; i<archivos.size();i++){
            String nombreTabla=archivos.get(i);
            System.out.println(nombreTabla);
            File input = new File(nombreTabla+"\\Metadata.txt");
            try {
                BufferedReader br = new BufferedReader(new FileReader(input));
                String current;
                while ((current = br.readLine()) != null ){
                    if(current.contains("FOREIGN KEY")){
                        System.out.println("encontro el titulo");
                        while (!(current = br.readLine()).contains("CHECK")){
                            if (!llaves.contains(current)){
                                System.out.println("Entra a agregar");
                                llaves.add(current);
                            }
                        }
                    }
                }
                br.close();
            }
            catch (IOException e){
                return llaves;

            }
        }
        return llaves;
    }
    public void RenameTableOtherTableMetadata (String nameTable, String newNameTable, String actualDB){

        // Se llaman a todas las tablas existentes de esa DB
        ArrayList<String> tablas = showTable2(actualDB);

        // Si existen tablas dentro de esa DB ...
        if(!tablas.isEmpty()){

            // Se obtienen todos los Metadata.txt para cada una de las tablas en la DB
            for (int i=0; i<tablas.size(); i++ ){

                // Se crea un objeto file y uno temporal
                File input = new File(tablas.get(i) + "\\Metadata.txt");
                File temp = new File(tablas.get(i) +  "\\temp.txt");

                try{
                    BufferedReader br = new BufferedReader(new FileReader(input));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
                    String current;

                    // Para el archivo Metadata.txt actual. Se recorren todas las lineas
                    while ((current = br.readLine()) != null){
                        String lineanueva = "";

                        // Si la linea es FOREIGN KEY ...
                        if(current.contains("FOREIGN KEY")) {
                            bw.write(current);
                            bw.newLine();
                            // Se obtienen las lineas siguientes mientras la linea no contenga a CHECK.
                            while (!(current = br.readLine()).contains("CHECK")){
                                // Se obtienen todas las palabras de de esa linea
                                String [] palabras = current.split(",");

                                /*
                                Si la palabra que guarda las tablas es igual a la que se desea renombrar
                                esta se renombra por la variable newNameTable.
                                */

                                if(palabras[1].equals(nameTable)){
                                    palabras[1] = newNameTable;

                                    // Se reconstruye la linea
                                    for (int j = 0; j< palabras.length;j++){
                                        lineanueva = lineanueva + palabras[j] + ",";
                                    }
                                    current=(lineanueva.substring(0,lineanueva.length()-1) + System.getProperty("line.separator"));

                                }
                                bw.write(current + System.getProperty("line.separator"));
                            }
                        }
                        bw.write(current + System.getProperty("line.separator"));
                    }

                    br.close();
                    bw.close();

                    // Se sobrescribe el archivo Metadata.txt por el archivo temporal.
                    Delete(input);
                    boolean successful = temp.renameTo(input);
                    System.out.println(successful);

                    String mensaje = "Se realizo el remplazo del nombre de la tabla en el archivo Metadata.txt.";
                    System.out.println(mensaje);

                }catch(IOException e){
                    System.out.println("ERROR: Ocurrió una IOexception: No se pudo realizar el renombre la tabla " +
                            " en el archivo Metadata.txt correspondiente.");
                }
            }
        }
    }

    /**
     * @author Joice Miranda
     * @param nombreTablaActual nombre de la columna donde se va a ingresar la llave
     * @param nombreTablaExterna nombre de la columna que tiene la llave
     * @param nombreBD nombre de la base de datos actual
     * @param nombreFK nombre de la llave foranea
     * @param columnas nombre de la columna que sera llave foranea
     * @param columnaInterna nombre de la columna que se enlazara con la llave foranea
     * @return mensaje de exito o error de la accion
     */
    public String addForeingKey (String nombreTablaActual, String nombreTablaExterna, String nombreBD, String nombreFK, String columnas, String columnaInterna) {
        String mensaje = "";
        boolean existe = false;
        /*
        Se revisan que existan klas columnas ingresadas
         */

        String[] columnasReales = columnasExistentes(nombreTablaExterna, nombreBD);
        for (int i = 0; i < columnasReales.length; i++) {
            if (columnasReales[i].equals(columnas)) {
                existe = true;
            }
        }
            if (existe == false) {
                return "ERROR: Columna ingresadas no existen en la tabla " + nombreTablaExterna;

            }

        /*
        Ingresar las llaves primarias
         */

            File input = new File("data\\" + nombreBD + "\\" + nombreTablaActual + "\\Metadata.txt");
            File temp = new File("data\\" + nombreBD + "\\" + nombreTablaActual + "\\temporal1.txt");

            try {
                BufferedReader br = new BufferedReader(new FileReader(input));
                BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

                String current;
                while ((current = br.readLine()) != null) {
                    bw.write(current + System.getProperty("line.separator"));
                    if (current.contains("FOREIGN KEY")) {
                        bw.write(nombreFK + " " + columnaInterna + "," + nombreTablaExterna + "," + columnas + System.getProperty("line.separator"));
                    }
                }
                br.close();
                bw.close();
                Delete(input);
                boolean successful = temp.renameTo(input);
                mensaje = "La tabla " + nombreTablaActual + " ha sido actualizada";
            } catch (IOException e) {
                mensaje = "ERROR: No se encontró la tabla " + nombreTablaActual + " en la base de datos" + nombreBD;

            }


        return mensaje;
    }
    public String addCheck(String nombreBD, String nombreTabla, String nombreChk, String exp){
        String mensaje="";
        /*
        Ingresar las llaves primarias
         */

        File input = new File("data\\" + nombreBD + "\\" + nombreTabla + "\\Metadata.txt");
        File temp = new File("data\\" + nombreBD + "\\" + nombreTabla + "\\temporal1.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

            String current;
            while ((current = br.readLine()) != null) {
                bw.write(current + System.getProperty("line.separator"));
                if (current.contains("CHECK")) {
                    bw.write(nombreChk + " " + exp + System.getProperty("line.separator"));
                }
            }
            br.close();
            bw.close();
            Delete(input);
            boolean successful = temp.renameTo(input);
            mensaje = "La tabla " + nombreTabla + " ha sido actualizada";
        } catch (IOException e) {
            mensaje = "ERROR: No se encontró la tabla " + nombreTabla + " en la base de datos" + nombreBD;

        }
        return mensaje;
    }
    public String DeleteDirectoryTable(String nameTable, String actualDB){

        File directory = new File("data\\" + actualDB + "\\" + nameTable );

        //make sure directory exists
        if(!directory.exists()){

            String mensaje = "El tabla que desea eliminar no existe.";
            System.out.println(mensaje);
            return mensaje;

            // Si el directorio existe, entonces utiliza la funcion 'delete'.
        }else {

            if (!IsTableColumnFK(actualDB,nameTable)) {
                try {
                    // Elimina el directorio de la tabla.
                    Delete(directory);

                    // Elimina la tabla del archivo Metadata dentro de la actualDB.
                    String mensaje2 = DeleteTableMetadata(nameTable, actualDB);

                    // Resta 1 al indice que lleva la cuenta de cuantas tablas existen en esa DB.
                    RestarTabla(actualDB, nameTable);

                    String mensaje = "El directorio de la tabla fue eliminada con exito y eliminado del archivo. \n" +
                            mensaje2;
                    return mensaje;

                } catch (IOException e) {
                    String mensaje = "ERROR: Se produjo un error al tratar de eliminar el directorio de la tabla.";
                    e.printStackTrace();
                    return mensaje;
                }
            } else{
                String mensaje = "ERROR: No se pudo eliminar la tabla. Esta tabla tiene una columna FK en otra tabla";
                return mensaje;
            }
        }
    }

    public String DeleteTableMetadata(String nameTable, String actualDB) {

        File input = new File("data\\" + actualDB +"\\Metadata.txt");
        File temp = new File("data\\" + actualDB +"\\temporal.txt");

        if (input.exists()) {

            try {
                BufferedReader br = new BufferedReader(new FileReader(input));
                BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

                String current;

                /*
                Se escriben todas las lineas en un archivo temporal, exceptuando la que contiene el nombre de la tabla
                Se elimina el archivo inicial y se renombra el archivo temporal como inicial.
                 */

                while ((current = br.readLine()) != null) {
                    if (current.contains(nameTable)) {
                        continue;
                    }
                    bw.write(current + System.getProperty("line.separator"));
                }
                br.close();
                bw.close();
                Delete(input);

                boolean successful = temp.renameTo(input);

                System.out.println(successful);
                String mensaje = "Se eliminó la tabla: (" + nameTable + ") del archivo de Metadata.txt" +
                        "de la DB ";
                return mensaje;

            } catch (IOException e) {
                String mensaje = "ERROR: No se encontró la tabla: (" + nameTable + ") del archivo de Metadata.txt";
                return mensaje;
            }

        }else {
            String mensaje = "ERROR: La DB esta siendo manejada incorrectamente " +
                    "No existe archivo Metadata.txt dentro del directorio o DB";
            return mensaje;
        }
    }

    public void RestarTabla(String actualDB, String nameTable ){

        try {
            File input = new File("data\\" + "Metadata.txt");
            File temp = new File("data\\" + "temp.txt");


            BufferedReader reader = new BufferedReader(new FileReader(input));
            BufferedWriter writer = new BufferedWriter(new FileWriter(temp));

            String current;


            while ((current = reader.readLine()) != null){
                if(current.contains(actualDB)){

                    String inicial = current.substring(0,current.indexOf(','));
                    String indice = current.substring(current.indexOf(',')+1);

                    int cantidad = Integer.parseInt(indice);
                    cantidad--;

                    indice=String.valueOf(cantidad);
                    current=inicial+','+indice;
                }
                writer.write(current+System.getProperty("line.separator"));
            }

            reader.close();
            writer.close();

            Delete(input);
            boolean successful = temp.renameTo(input);
            System.out.println(successful);

        }catch (IOException e){
            System.out.println("ERROR: No se encontró el archivo de Metadata.txt");
        }

    }


    public Boolean IsTableColumnFK (String actualDB, String nameTable ){

        // Se llaman a todas las tablas existentes de esa DB
        ArrayList<String> tablas = showTable2(actualDB);
        Boolean tablasFK = Boolean.FALSE;


        // Si existen tablas dentro de esa DB ...
        if(!tablas.isEmpty()){

            // Se obtienen todos los Metadata.txt para cada una de las tablas en la DB
            for (int i = 0; i<tablas.size(); i++ ){

                // Se crea un objeto file
                File input = new File(tablas.get(i) + "\\Metadata.txt");

                try{
                    BufferedReader br = new BufferedReader(new FileReader(input));
                    String current;

                    // Para el archivo Metadata.txt actual. Se recorren todas las lineas
                    while ((current = br.readLine()) != null){
                        String lineanueva = "";

                        // Si la linea es FOREIGN KEY ...
                        if(current.contains("FOREIGN KEY")) {

                            // Se obtienen las lineas siguientes mientras la linea no contenga a CHECK.
                            while (!(current = br.readLine()).contains("CHECK")){
                                // Se obtienen todas las palabras de de esa linea
                                String [] palabras = current.split(",");

                                /*
                                Si en la posicion 1 de nuestro arreglo se encuentra el
                                nombre de la tabla (Es decir: Esta tiene una columna  es referenciada).
                                */

                                if(palabras[1].equals(nameTable)){
                                    tablasFK = Boolean.TRUE;

                                }
                            }
                        }
                    }

                    br.close();

                    String mensaje = "Se chequeo el archivo Metadata.tx de \n" + tablas.get(i) + " con exito" ;
                    System.out.println(mensaje);

                }catch(IOException e){
                    System.out.println("ERROR: Ocurrio IOException: No se pudo chequear el archivo Metadata.txt");
                }
            }
        }
        return tablasFK;
    }

    public String showColumns(String bd,String tabla){
        String salida = "";

        File input = new File("data\\"+bd+"\\"+tabla+"\\Metadata.txt");
        try{
            BufferedReader br = new BufferedReader(new FileReader(input));
            String current;

        }
        catch (IOException e){

        }

        return salida;
    }
    /**
     * author Joice Miranda
     * @param nombreBD nombre de la base de datos actual
     * @param nombreTabla nombre de la tabla que tiene la llave primaria
     * @return true si elimina algo, false si no.
     */
    public boolean dropPrimaryKey(String nombreBD, String nombreTabla, String nombreConstraint){
        boolean salida=false;
        /*
        Ingresar las llaves primarias
         */

        File input = new File("data\\" + nombreBD + "\\" + nombreTabla + "\\Metadata.txt");
        File temp = new File("data\\" + nombreBD + "\\" + nombreTabla + "\\temporal1.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

            String current;
            while ((current = br.readLine()) != null) {
                bw.write(current + System.getProperty("line.separator"));
                if (current.contains("PRIMARY KEY")) {
                    current= br.readLine();
                    if (current.contains("FOREIGN KEY")){
                        salida=false;
                        bw.write(current + System.getProperty("line.separator"));
                    }
                    if (current.contains(nombreConstraint)){
                        salida=true;
                    }
                }
            }
            br.close();
            bw.close();
            Delete(input);
            boolean successful = temp.renameTo(input);
        } catch (IOException e) {
            salida=false;

        }
        return salida;

    }

    /**
     * author Joice Miranda
     * @param nombreBD nombre de la base de datos
     * @param nombreTabla nombre de la tabla
     * @param nombreConstraint nombre de la contraint a eliminar
     * @return true si elimina, false si no
     */

    public boolean dropForeignKey(String nombreBD, String nombreTabla, String nombreConstraint){
        boolean salida = false;
        /*
        Ingresar las llaves primarias
         */

        File input = new File("data\\" + nombreBD + "\\" + nombreTabla + "\\Metadata.txt");
        File temp = new File("data\\" + nombreBD + "\\" + nombreTabla + "\\temporal1.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

            String current;
            while ((current = br.readLine()) != null) {
                bw.write(current + System.getProperty("line.separator"));
                if (current.contains("FOREIGN KEY")) {
                    current= br.readLine();
                    while (!current.contains("CHECK")){
                        if (current.contains(nombreConstraint)){
                            String []part=current.split(" ");
                            if (part[0].equals(nombreConstraint)){
                                salida=true;
                            }
                            else{
                                bw.write(current+System.getProperty("line.separator"));
                                salida=false;
                            }

                        }
                        else{
                            salida=false;
                            bw.write(current + System.getProperty("line.separator"));
                        }
                        current=br.readLine();
                    }
                    bw.write(current+System.getProperty("line.separator"));
                }
            }
            br.close();
            bw.close();
            Delete(input);
            boolean successful = temp.renameTo(input);
        } catch (IOException e) {
            salida=false;
        }
        return salida;

    }

    /**
     * author Joice Miranda
     * @param nombreBD nombre de la base de datos
     * @param nombreTabla nombre de la tabla
     * @param nombreConstraint nombre de la contraint a eliminar
     * @return true si elimina, false si no
     */

    public boolean dropCheck(String nombreBD, String nombreTabla, String nombreConstraint){
        boolean salida = false;
        /*
        Ingresar las llaves primarias
         */

        File input = new File("data\\" + nombreBD + "\\" + nombreTabla + "\\Metadata.txt");
        File temp = new File("data\\" + nombreBD + "\\" + nombreTabla + "\\temporal1.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

            String current;
            while ((current = br.readLine()) != null) {
                bw.write(current + System.getProperty("line.separator"));
                if (current.contains("CHECK")) {
                    current= br.readLine();
                    while (current!= null){
                        if (current.contains(nombreConstraint)){
                            String []part=current.split(" ");
                            if (part[0].equals(nombreConstraint)){
                                salida=true;
                            }
                            else{
                                bw.write(current);
                                salida=false;
                            }

                        }
                        else{
                            salida=false;
                            bw.write(current + System.getProperty("line.separator"));
                        }
                        current=br.readLine();
                    }
                    //bw.write(current+System.getProperty("line.separator"));
                }
            }
            br.close();
            bw.close();
            Delete(input);
            boolean successful = temp.renameTo(input);
        } catch (IOException e) {
            salida=false;
        }
        return salida;

    }

}


