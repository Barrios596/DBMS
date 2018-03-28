/* Universidad del Valle de Guatemala
*  Bases de Datos
*  Rodrigo Barrios, José Antonio Ramírez, Joice Miranda
*  Clase visitante EvalVisitor.java
*  Esta clase visita cada nodo del árbol sintáctico y realiza acciones semánticas según corresponda.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EvalVisitor extends GramaticaSQLBaseVisitor<String> {
    //Se crea un objeto Funciones que tiene las funciones a utilizar
    Funciones creador = new Funciones();
    //Mensaje de salida que se imprime en la consola creada
    public String salida = "";
    //String que guarda el nombre de la base de datos actual
    public String dbActual = "";
    boolean todobien = true;

    /**
     * @Author Rodrigo Barrios
     * @param ctx: en todos los métodos de visitante se usa ctx, que es un contexto que usa ANTLR para poder manipular a los hijos del nodo visitado.
     * @return todos los métodos de visitante retornan los hijos del nodo al que se está visitando, esto es para el recorrido correcto del árbol
     * @descr Método para crear una base de datos nueva, llama a CreateDirectory
     */
    @Override public String visitCreateDatabase(GramaticaSQLParser.CreateDatabaseContext ctx) {
        if(todobien) {
            String nombre = ctx.getChild(2).getText();
            salida = salida + creador.CreateDirectory(nombre) + '\n';
        }
        return visitChildren(ctx);
    }
    /**
     * @Author Rodrigo Barrios
     * @param ctx
     * @return
     * @descr   Cambia el nombre de una base de datos específica
     */
    @Override public String visitAlterDatabase(GramaticaSQLParser.AlterDatabaseContext ctx) {
        if(todobien) {
            String viejo = ctx.getChild(2).getText();
            String nuevo = ctx.getChild(5).getText();
            salida = salida + creador.ModifyNameDirectory(viejo, nuevo) + '\n';
        }
        return visitChildren(ctx);
    }
    /**
     * @Author Rodrigo Barrios
     * @param ctx
     * @return
     * @descr   Elimina una base de datos específica.
     */
    @Override public String visitDropDatabase(GramaticaSQLParser.DropDatabaseContext ctx) {

        if(todobien) {
            String nombre = ctx.getChild(2).getText();
            salida = salida + creador.DeleteDirectory(nombre) + '\n';
        }
        return visitChildren(ctx); }
    /**
     * @Author Rodrigo Barrios
     * @param ctx
     * @return
     * @descr muestra la información de una base de datos
     */
    @Override public String visitShowDatabase(GramaticaSQLParser.ShowDatabaseContext ctx) {
        if(todobien){
            System.out.println(creador.KFExistentes("bd"));
            salida = salida + creador.showDB() + '\n';
        }
        return visitChildren(ctx);
    }
    /**
     * @Author Rodrigo Barrios
     * @param ctx
     * @return
     * @descr   actualiza la base de datos actual
     */
    @Override public String visitUseDatabase(GramaticaSQLParser.UseDatabaseContext ctx) {
        if(todobien) {
            String agregar = creador.UseDB(ctx.getChild(2).getText());
            if (!agregar.contains("no existe")) {
                dbActual = ctx.getChild(2).getText();
            }
            salida = salida + agregar + '\n';
        }
        return visitChildren(ctx);
    }
    /**
     * @Author Rodrigo Barrios
     * @param ctx
     * @return
     * @descr   Crea una tabla en la base de datos actual
     */
    @Override public String visitCreateTable(GramaticaSQLParser.CreateTableContext ctx) {
        //Si ya hay una base de datos escogida
        if(todobien) {
            if (!dbActual.equals("")) {
                boolean primarykey = false;
                boolean foreignkey = false;
                boolean check = false;
                String nombre = ctx.getChild(2).getText();
                //Se crea el directorio de la nueva bd
                salida = salida + creador.CreateTable(nombre, dbActual) + '\n';
                try {
                    //Se crean los archivos dentro del nuevo directorio
                    BufferedWriter writer = new BufferedWriter(new FileWriter("data\\" + dbActual + "\\" + nombre + "\\Metadata.txt", true));
                    BufferedWriter escritor = new BufferedWriter(new FileWriter("data\\" + dbActual + "\\" + nombre + "\\valores.txt", true));

                    int contador = 4;
                    //Se escriben las columnas
                    String cNombre = ctx.getChild(contador).getChild(0).getText();
                    String cTipo = ctx.getChild(contador).getChild(1).getText();
                    cTipo = cTipo.toLowerCase();
                    writer.write("COLUMNS");
                    writer.newLine();
                    writer.write(cNombre + " " + cTipo);
                    writer.newLine();
                    String valores = cNombre;
                    while (!ctx.getChild(contador + 1).getText().equals(")") && !ctx.getChild(contador + 1).getText().equals("CONSTRAINT")) {

                        System.out.println(ctx.getChild(contador + 1).getText());
                        contador = contador + 2;
                        cNombre = ctx.getChild(contador).getChild(0).getText();
                        cTipo = ctx.getChild(contador).getChild(1).getText();
                        cTipo = cTipo.toLowerCase();
                        writer.write(cNombre + " " + cTipo);
                        writer.newLine();
                        valores = valores + "," + cNombre;
                    }
                    //Se agregan los constraints
                    while (!ctx.getChild(contador + 1).getText().equals(")")) {
                        contador = contador + 2;
                        if (ctx.getChild(contador).getText().toLowerCase().contains("primary")) {
                            primarykey = true;
                            writer.write("PRIMARY KEY");
                            writer.newLine();
                            String key = ctx.getChild(contador).getChild(0).getChild(0).getText();
                            writer.write(key + " ");
                            int contador2 = 4;
                            String param = ctx.getChild(contador).getChild(0).getChild(contador2).getText();
                            writer.write(param);
                            while (!ctx.getChild(contador).getChild(0).getChild(contador2 + 1).getText().contains(")")) {
                                contador2 = contador2 + 2;
                                param = ctx.getChild(contador).getChild(0).getChild(contador2).getText();
                                writer.write("," + param);
                            }
                            writer.newLine();
                        } else if (ctx.getChild(contador).getText().toLowerCase().contains("foreign")) {
                            if (!primarykey) {
                                writer.write("PRIMARY KEY");
                                writer.newLine();
                            }
                            primarykey = true;
                            writer.write("FOREIGN KEY");
                            foreignkey = true;
                            writer.newLine();
                            String name = ctx.getChild(contador).getChild(0).getChild(0).getText();
                            writer.write(name + " ");
                            int contador2 = 4;
                            String columna = ctx.getChild(contador).getChild(0).getChild(contador2).getText();
                            writer.write(columna + ",");
                            contador2 = contador2 + 3;
                            String tabla = ctx.getChild(contador).getChild(0).getChild(contador2).getText();
                            writer.write(tabla + ",");
                            contador2 = contador2 + 2;
                            String columnaExt = ctx.getChild(contador).getChild(0).getChild(contador2).getText();
                            writer.write(columnaExt);
                            writer.newLine();
                        } else if (ctx.getChild(contador).getText().toLowerCase().contains("check")) {
                            check = true;
                            if (!primarykey) {
                                writer.write("PRIMARY KEY");
                                writer.newLine();
                            }
                            if (!foreignkey) {
                                writer.write("FOREIGN KEY");
                                writer.newLine();
                            }
                            foreignkey = true;
                            primarykey = true;
                            writer.write("CHECK");
                            writer.newLine();
                            String name = ctx.getChild(contador).getChild(0).getChild(0).getText();
                            String restriccion = ctx.getChild(contador).getChild(0).getChild(2).getText();
                            writer.write(name + " " + restriccion);
                            writer.newLine();
                        }
                    }
                    if (!primarykey) {
                        writer.write("PRIMARY KEY");
                        writer.newLine();
                    }
                    if (!foreignkey) {
                        writer.write("FOREIGN KEY");
                        writer.newLine();
                    }
                    if (!check) {
                        writer.write("CHECK");
                        writer.newLine();
                    }
                    writer.close();
                    escritor.write(valores);
                    escritor.close();
                    creador.sumarTabla(dbActual);
                } catch (IOException e) {
                    System.out.println("No se creó el archivo de metadata.");
                }
            }
            //esto es si no hay una base de datos escogida
            else {
                salida = salida + "No se ha escogido una base de datos actual." + '\n';
            }
        }
        return visitChildren(ctx);
    }

    /**
     * @Autor Rodrigo Barrios
     * @param ctx
     * @return  Cambia el nombre de una tabla que pertenece a la base de datos actual
     */
    @Override public String visitAlterTable(GramaticaSQLParser.AlterTableContext ctx) {
        if(todobien) {
            if (ctx.getText().toLowerCase().contains("rename")) {
                String viejo = ctx.getChild(2).getText();
                String nuevo = ctx.getChild(5).getText();

                salida = salida + creador.RenameTable(viejo, nuevo, dbActual) + '\n';
            }
        }
        return visitChildren(ctx);
    }
    /**
     * @Author Rodrigo Barrios
     * @param ctx
     * @return
     * @descr   Modifica una tabla en específico (agrega columna, las elimina o agrega constraints)
     */
    @Override public String visitAlterModifyTable(GramaticaSQLParser.AlterModifyTableContext ctx) {
        if(todobien) {
            String tabla = ctx.getChild(2).getText();
            String accion1 = ctx.getChild(3).getChild(0).getChild(0).getText();
            String accion2 = ctx.getChild(3).getChild(0).getChild(1).getText();
            String accion = accion1 + " " + accion2;
            //Si se agrega una columna
            if (accion.toLowerCase().contains("add column")) {
                String nombre = ctx.getChild(3).getChild(0).getChild(2).getChild(0).getText();
                String tipo = ctx.getChild(3).getChild(0).getChild(2).getChild(1).getText();
                salida = salida + creador.addColumn(tipo, nombre, dbActual, tabla) + '\n';
            }
            //Si se borra una columna
            else if (accion.toLowerCase().contains("drop column")) {
                String columna = ctx.getChild(3).getChild(0).getChild(2).getText();
                System.out.println(columna);
                salida = salida + creador.DropColumn(columna, dbActual, tabla) + '\n';
            }
            //Si se agrega una constraint
            else if (accion.toLowerCase().contains("add constraint")) {
                String action1 = ctx.getChild(3).getChild(0).getChild(2).getChild(0).getChild(1).getText();
                String action2 = ctx.getChild(3).getChild(0).getChild(2).getChild(0).getChild(2).getText();
                String action = action1 + action2;
                System.out.println(action);
                //Si se agrega una llave primaria
                if (action.toLowerCase().contains("primarykey")) {
                    String ident = ctx.getChild(3).getChild(0).getChild(2).getChild(0).getChild(0).getText();
                    int contador = 4;
                    String columnas = ctx.getChild(3).getChild(0).getChild(2).getChild(0).getChild(contador).getText();
                    while (!ctx.getChild(3).getChild(0).getChild(2).getChild(0).getChild(contador + 1).getText().equals(")")) {
                        contador = contador + 1;
                        columnas = columnas + ctx.getChild(3).getChild(0).getChild(2).getChild(0).getChild(contador).getText();
                    }
                    System.out.println(columnas);
                    salida = salida + creador.addPrimaryKey(tabla, dbActual, ident, columnas) + '\n';
                }
                //Si se agrega una llave foránea
                else if (action.toLowerCase().contains("foreignkey")) {
                    String ident = ctx.getChild(3).getChild(0).getChild(2).getChild(0).getChild(0).getText();
                    String local = ctx.getChild(3).getChild(0).getChild(2).getChild(0).getChild(4).getText();
                    String tablaExt = ctx.getChild(3).getChild(0).getChild(2).getChild(0).getChild(7).getText();
                    String columnaExt = ctx.getChild(3).getChild(0).getChild(2).getChild(0).getChild(9).getText();
                    salida = salida + creador.addForeingKey(tabla, tablaExt, dbActual, ident, columnaExt, local);
                }
            }
        }
        return visitChildren(ctx);
    }
}
