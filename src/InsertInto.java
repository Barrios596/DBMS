import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Stack;

/**
 * Descripcion: Esta clase maneja cada uno de los metodos para ingresar valores a un archivos de texto que es utilizada
 * como una tabla en un formato csv.
 */

public class InsertInto {

    /**
     * Descripcion: El metodo maneja cada una de las formas en que se va a ingresar los datos, segun la composicion
     * de las columnas que ingrese el usuario.
     *
     * @param dbActual
     * @param nombreTabla: La tabla donde se van a ingresar los valores.
     * @param columnas: Son nombres que indican donde se va a posicionar un valor dado.
     * @param valores: Son los valores que se desean guardar.
     * @return Retorna un String que sirve como mensaje para la UI del usuario.
     */

    public String Insertar(String dbActual, String nombreTabla, ArrayList<String> columnas, ArrayList<String> valores) {

        // Inicializacion de Mensaje a UI
        String mensaje = "No hizo nada";

        // Se obtiene la cantidad de columnas ingresadas para saber de que forma trabajar.
        Integer cantColumnas = columnas.size();

        // Si la cantidad de columnas es 0, se trabaja solo con los valores ingresados.
        if (cantColumnas == 0) {

            /*
             Se chequea la  de columnas que hay en esa tabla.
             La cantidad de valores ingresados solo pueden ser <= cantidad de columnas de la tabla
             */
            Integer cantValores = valores.size();

            ArrayList<String []> columnasTipos = TodasColumnasYTipos( dbActual, nombreTabla);
            cantColumnas = columnasTipos.size();

            if (cantValores <= cantColumnas){

                /*
                 * Si la cantidad de valores a ingresar son igual a la cantidad de columnas disponibles
                 * se utiliza el metodo de IngresoDirecto().
                 */

                if (cantValores.equals(cantColumnas)){
                    if(VerificacionDeTipos(columnasTipos, valores)) {

                        ArrayList<String> valoresParseados = ParseoValores(columnasTipos, valores);
                        IngresoDirecto(dbActual, nombreTabla, valoresParseados);
                        sumarIngresoMetadata( dbActual, nombreTabla, cantValores);

                        mensaje = "Se ingresaron correctamente los datos al archivo de valores de la tabla: " +
                                nombreTabla + "de la base de datos: " + dbActual;
                        System.out.println(mensaje);
                        return mensaje;
                    }else{
                        mensaje = "ERROR: Alguno de los valores ingresados no se encuentra" +
                                "en la forma del tipo de la columna.";
                        System.out.println(mensaje);
                        return mensaje;
                    }

                    /*
                     * Si la cantidad de valores a ingresar es menor a la cantidad de columnas disponibles
                     * se utiliza el metodo de IngresoSemiDirecto(), que rellena los valores para las columnas restantes
                     * con valores nulos.
                     */

                }else if (cantValores < cantColumnas){

                    /*
                    Se obtiene la misma cantidad de  valores y cantidad de columnas para poder hacer la verificacion
                    de tipos entre las columnas y los valores.
                     */

                     Integer resta = cantColumnas - cantValores;
                     for (int i = 0; i<resta; i++){
                         Integer ultimoelem = columnasTipos.size();
                         columnasTipos.remove(ultimoelem);
                     }

                     if(VerificacionDeTipos(columnasTipos, valores)) {

                         ArrayList<String> valoresParseados = ParseoValores(columnasTipos, valores);
                         IngresoSemiDirecto(dbActual, nombreTabla, valoresParseados, cantColumnas);
                         sumarIngresoMetadata( dbActual, nombreTabla, cantValores);

                        mensaje = "Se ingresaron correctamente los datos al archivo de valores.txt de la tabla: " +
                                nombreTabla + "de la base de datos: " + dbActual;
                        System.out.println(mensaje);
                        return mensaje;

                     }else{
                        mensaje = "ERROR: Alguno de los valores ingresados no se encuentra" +
                                "en la forma del tipo de la columna.";
                        System.out.println(mensaje);
                        return mensaje;
                    }
                }

                /*
                * Si el usuario ingresa mas valores que las columnas disponibles, entonces, se muestra una mensaje
                * de ERROR en la UI.
                */
            }else{
                mensaje = "ERROR: La cantidad de valores sobrepasa la cantidad de columnas en esa tabla";
                System.out.println(mensaje);
                return mensaje;
            }


         /* Si el Usuario ingresa columnas especificas para cada uno de los valores respectivamente.
          * Se trabaja con el metodo IngresoIndirecto.
          */

        }else if (cantColumnas > 0){


            ArrayList<String[]> columnasTabla = TodasColumnasYTipos(dbActual, nombreTabla);
            cantColumnas = columnasTabla.size();
            Integer cantValores = valores.size();

            ArrayList<String[]> columnasSeleccionadas = new ArrayList<>();

            Integer contador = 0;
            List posiciones = new ArrayList();


            /*
             * Se recorren todas las columnas ingresadas y por cada una se recorre cada columna de la tabla,
             * para encontrar si las columnas ingresadas se encuentran dentro de la tabla.
             * Se utiliza un contador como auxiliar para la verificacion.
             */

            for (int i = 0; i<columnas.size(); i++){
                String columnaIngresada = columnas.get(i);
                for (int j = 0; j<columnasTabla.size(); j++){
                    String pointerColumna = columnasTabla.get(j)[0];
                    if (String.valueOf(columnaIngresada).equals(String.valueOf(pointerColumna))){
                        contador ++;
                        /*
                        Las columnas seleccionadas seran las columnas de la tabla que tambien estan en las columnas
                        ingresadas.
                         */
                        columnasSeleccionadas.add(columnasTabla.get(j));
                        /*
                        * Se guardan en una lista las posiciones de las columnas ingresadas por el usuario en
                        * la tabla, para saber a que columnas corresponden los valores dados.
                         */
                        posiciones.add(j);
                    }
                }
            }

            // Verificacion que cada una de las columnas se encuentre en la tabla.
            if (contador.equals(columnas.size())){
                if (VerificacionDeTipos(columnasSeleccionadas, valores)){

                    ArrayList<String> valoresParseados = ParseoValores(columnasSeleccionadas, valores);
                    IngresoIndirecto(dbActual, nombreTabla, valoresParseados, posiciones, cantColumnas);
                    sumarIngresoMetadata( dbActual, nombreTabla, cantValores);

                    mensaje = "Se ingresaron correctamente los datos al archivo de valores.txt de la tabla: " +
                            nombreTabla + "de la base de datos: " + dbActual;
                    System.out.println(mensaje);
                    return mensaje;

                }else{
                    mensaje = "ERROR: Alguno de los valores ingresados no se encuentra" +
                            "en la forma del tipo de la columna.";
                    System.out.println(mensaje);
                    return mensaje;
                }


            } else {
                mensaje = "ERROR: Una de las columnas ingresadas por el usuario no se encuentra dentro" +
                        "de la tabla.";
                System.out.println(mensaje);
                return mensaje;
            }
        }
        return mensaje;
    }

    /**
     *
     * @param dbActual: Es la base de datos que apunta.
     * @param nombreTabla: Es el nombre de la tabla que se apunta
     * @return Se retorna todas las columnas con su tipo de dato.
     */

    public ArrayList<String []> TodasColumnasYTipos(String dbActual, String nombreTabla) {

        File file = new File("C:\\Users\\Jose Ramirez\\Downloads\\Test\\" + dbActual + "\\" + nombreTabla + "\\" + "Metadata.txt");
        ArrayList<String []> columnasTipos = new ArrayList<String[]>();


        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String current;

            /*
             * Se recorren todas las lineas del archivo, para obtener cada uno de los pares
             * que indican nombre de la columna y tipo de dato que almacena.
             */

            while ((current = br.readLine()) != null) {
                if (current.contains("COLUMN")) {
                    while (!(current = br.readLine()).contains("PRIMARY KEY")) {
                        String[] pares = current.split(" ");
                        columnasTipos.add(pares);
                        }
                    }
                }

            br.close();

            String mensaje = "Se obtuvieron todas las columnas y tipos de cada columna";
            System.out.println(mensaje);
            return columnasTipos;

        } catch (IOException e) {
            String mensaje = "ERROR: Ocurrió una IOexception: No se pudo obtener las columnas" +
                    "y los tipos de cada columna";
            System.out.println(mensaje);
            return columnasTipos;

        }
    }

    /**
     *
     * @param columnasTipos: Son las columnas que nos indican su nombre y su tipo de dato.
     * @param valores: Son todos los valores que se desean parsear.
     * @return Se retorna un booleano que indica si los valores son posibles parsearlos al tipo de dato
     * que indica cada una de las columnas.
     */

    public boolean VerificacionDeTipos(ArrayList<String []> columnasTipos, ArrayList<String> valores) {
        boolean parsable = true;

        for (int i = 0; i < columnasTipos.size(); i++) {
            String[] pointer = columnasTipos.get(i);

            // Se obtienen solo los tipos de cada una de las columnas
            String pointerType = pointer[1];

            /*
             * Se intenta parsear cada uno de los valores
             * segun el tipo de la dato que tiene la columna a la que apunta.
             */

            // INT
            if (pointerType.equals("int")) {
                String input = valores.get(i);

                try {
                    Integer.parseInt(input);

                } catch (Exception e) {
                    String mensaje = "ERROR: No se ha ingresado el elemento de acuerdo a su tipo. \n " +
                            "Valor: \n"  + valores.get(i) + "columna: \n" + pointerType;
                    System.out.println(mensaje);
                    parsable = false;
                }
            }

            // FLOAT
            else if (pointerType.equals("float")) {
                String input = valores.get(i);

                try {
                    Float.parseFloat(input);

                } catch (Exception e) {
                    String mensaje = "ERROR: No se ha ingresado el elemento de acuerdo a su tipo. \n " +
                            "Valor: \n"  + valores.get(i) + "columna: \n" + pointerType;
                    System.out.println(mensaje);
                    parsable = false;

                }
            }
            // DATE
            else if (pointerType.equals("date")) {

                // Se crea un objeto que corresponda al formato deseado
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String input = valores.get(i);

                try {
                    dateFormat.parse(input);

                } catch (ParseException e) {
                    String mensaje = "ERROR: No se ha ingresado el elemento de acuerdo a su tipo. \n " +
                            "Valor: \n"  + valores.get(i) + "columna: \n" + pointerType;
                    System.out.println(mensaje);
                    parsable = false;
                }

            }

            // CHAR
            else if (pointerType.contains("char")) {

                /*
                 * Se verifica que la cantidad de chars que puede ingresar el usuario en la columna
                 * no sobrepase el valor ingresado por el usuario.
                 */

                Integer tamano = pointerType.length();
                String numeroString = pointerType.substring(5,tamano-1);
                Integer tamanoLimite = Integer.parseInt(numeroString);

                String input = valores.get(i);

                if (input.length() <= tamanoLimite){

                    try {
                        String.valueOf(input);

                    } catch (Exception e) {
                        String mensaje = "ERROR: No se ha ingresado el elemento de acuerdo a su tipo. \n " +
                                "Valor: \n"  + valores.get(i) + "columna: \n" + pointerType;
                        System.out.println(mensaje);
                        parsable = false;
                    }
                }else{
                    parsable = false;
                }
            }
        }
        return  parsable;
    }

    /**
     *
     * @param columnasTipos: Son todos los nombres de las columnas con su tipo de dato.
     * @param valores: Son todos los valores que se desean parsear.
     * @return Se retorna un ArrayList con todos los nuevos valores parseados.
     */

    public ArrayList < String> ParseoValores (ArrayList<String []> columnasTipos, ArrayList<String> valores) {

        // Se recorren todas las columnas y sus tipos
        for (int i = 0; i < columnasTipos.size(); i++) {
            String[] pointer = columnasTipos.get(i);

            // Se obtienen solo los tipos de cada una de las columnas
            String pointerType = pointer[1];

            // INT
            if (pointerType.equals("int")) {
                String input = valores.get(i);

                Integer nuevoValor = Integer.parseInt(input);
                valores.remove(i);
                valores.add(i, String.valueOf(nuevoValor));

            }

            // FLOAT
            if (pointerType.equals("float")) {
                String input = valores.get(i);

                Float nuevoValor = Float.parseFloat(input);
                valores.remove(i);
                valores.add(i, String.valueOf(nuevoValor));
            }

            // DATE
            if (pointerType.equals("date")) {

                // Se crea un objeto que corresponda al formato deseado
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String input = valores.get(i);
                Date nuevoValor;

                // Se intenta parser el valor ingresado a tipo 'date'
                try {
                    nuevoValor = dateFormat.parse(input);
                    valores.remove(i);
                    valores.add(i, String.valueOf(nuevoValor));

                } catch (ParseException e) {

                }
            }

            // CHAR
            if (pointerType.contains("char")) {
                String input = valores.get(i);
                valores.remove(i);
                valores.add(i, String.valueOf(input));
            }
        }
        return valores;
    }

    /**
     *
     * @param dbActual Es el nombre de la base de datos a la que apunta.
     * @param nombreTabla El nombre de la tabla donde se van a ingresar los valores.
     * @param valores Todos los valores ingresados por el usuario.
     */

    public void IngresoDirecto(String dbActual, String nombreTabla, ArrayList<String> valores){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Jose Ramirez\\Downloads\\Test\\" + dbActual +
                    "\\" + nombreTabla + "\\" + "valores.txt", true));

            String lineaValores = "";

            // Se hace una nueva linea con los valores ingresados.
            for (int i = 0; i<valores.size();i++){
                lineaValores = lineaValores + "," + String.valueOf(valores.get(i));
            }

            // Se realiza un append de la linea al archivo de texto valores.txt
            writer.append(lineaValores);
            writer.newLine();
            writer.close();

        }catch(Exception e){
            String mensaje = "No se pudo escribir en el archivo valores.txt" +
                    "de la tabla: " + nombreTabla;
            System.out.println(mensaje);
        }
    }

    /**
     *
     * @param dbActual Es el nombre de la base de datos a la que apunta.
     * @param nombreTabla El nombre de la tabla donde se van a ingresar los valores.
     * @param valores Todos los valores ingresados por el usuario.
     * @param cantColumns La cantidad de columnas que existen en la tabla.
     */

    public void IngresoSemiDirecto(String dbActual, String nombreTabla, ArrayList<String> valores, Integer cantColumns){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Jose Ramirez\\Downloads\\Test\\" + dbActual +
                    "\\" + nombreTabla + "\\" + "valores.txt", true));

            String lineaValores = "";
            Integer valoresNulos = cantColumns - valores.size();

            // Se hace una nueva linea con los valores ingresados.
            for (int i = 0; i<valores.size();i++){
                lineaValores = lineaValores + "," + String.valueOf(valores.get(i));
            }

            // Los demas valores de la tabla se rellenan con nulo.
            for (int j =0; j<valoresNulos; j++){
                lineaValores = lineaValores + "," + String.valueOf("null");
            }

            writer.append(lineaValores);
            writer.newLine();
            writer.close();

        }catch(Exception e){
            String mensaje = "No se pudo escribir en el archivo valores.txt" +
                    "de la tabla: " + nombreTabla;
            System.out.println(mensaje);
        }
    }

    /**
     *
     * @param dbActual El nombre de la DB a la que apunta
     * @param nombreTabla El nombre de la tabla a la que apunta
     * @param valores Los valores que se quieren ingresar en el archivo
     * @param posiciones Las posiciones de las columnas a las que pertenece cada valor
     * @param cantColumns La cantidad de columnas que existe en esa tabla
     */
    public  void IngresoIndirecto(String dbActual, String nombreTabla, ArrayList<String> valores, List posiciones, Integer cantColumns){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Jose Ramirez\\Downloads\\Test\\" + dbActual +
                    "\\" + nombreTabla + "\\" + "valores.txt", true));

            String lineaValores = "";
            Stack stackValores = new Stack();

            /*
             * Creamos un nuevo stack con todos los valores a escribir, para facilitar la construccion de
             * la linea que vamos a escribir.
             */

            Integer cantValores = valores.size();

            for (int j = 0; j < cantValores; j++){
                String stackValor = valores.get(valores.size());
                stackValores.push(stackValor);
                valores.remove(valores.size());
            }

            // Construccion de la nueva linea
            for (int i = 0; i<cantColumns; i++){
                if (posiciones.contains(i)){
                    lineaValores = lineaValores + "," + String.valueOf(stackValores.pop());
                } else {
                    lineaValores = lineaValores + "," + String.valueOf("null");
                }
            }

            writer.append(lineaValores);
            writer.newLine();
            writer.close();

        }catch(Exception e){
            String mensaje = "No se pudo escribir en el archivo valores.txt" +
                    "de la tabla: " + nombreTabla;
            System.out.println(mensaje);
        }
    }

    /**
     *
     * @param dbActual El nombre de la DB a la que apunta
     * @param nombreTabla El nombre de la tabla a la que apunta
     */

    public void sumarIngresoMetadata(String dbActual, String nombreTabla, Integer cantValores){

        try {
            File input = new File("data\\" + dbActual + "\\" + "Metadata.txt");
            File temp = new File("data\\" + dbActual + "\\" + "Metadata.txt");


            BufferedReader reader = new BufferedReader(new FileReader(input));
            BufferedWriter writer = new BufferedWriter(new FileWriter(temp));

            String current;

            while ((current = reader.readLine()) != null){
                String[] pares = current.split(",");
                String pointeNameTable = pares[0];

                if(pointeNameTable.equals(nombreTabla)){

                    /*
                    Se toma el ultimo String que guarda la cantidad de registros en esa tabla
                    Y se suma la cantidad de valores que se ingresaron.
                     */
                    String inicial = current.substring(0,current.indexOf(','));
                    String indice = current.substring(current.indexOf(',') + 1);

                    int cantidad = Integer.parseInt(indice);
                    cantidad = cantidad +cantValores;

                    indice = String.valueOf(cantidad);
                    current = inicial + ',' + indice;
                }
                writer.write(current+System.getProperty("line.separator"));
            }
            reader.close();
            writer.close();
            Delete(input);

            boolean successful = temp.renameTo(input);
            System.out.println(successful);

        }catch (IOException e){
            System.out.println("ERROR: No se encontró el archivo de metadata.txt que guarda la cantidad" +
                    "de registros de la tabla: " + nombreTabla);
        }

    }

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