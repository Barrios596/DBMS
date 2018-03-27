import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EvalVisitor extends GramaticaSQLBaseVisitor<String> {

    Funciones creador = new Funciones();
    public String salida = "";
    public String dbActual = "";

    @Override public String visitCreateDatabase(GramaticaSQLParser.CreateDatabaseContext ctx) {

        String nombre=ctx.getChild(2).getText();
        salida=salida+creador.CreateDirectory(nombre)+'\n';

        return visitChildren(ctx);
    }

    @Override public String visitAlterDatabase(GramaticaSQLParser.AlterDatabaseContext ctx) {
        String viejo = ctx.getChild(2).getText();
        String nuevo = ctx.getChild(5).getText();
        salida=salida+creador.ModifyNameDirectory(viejo,nuevo)+'\n';
        return visitChildren(ctx);
    }

    @Override public String visitDropDatabase(GramaticaSQLParser.DropDatabaseContext ctx) {
        String nombre = ctx.getChild(2).getText();
        salida=salida+creador.DeleteDirectory(nombre)+'\n';
        return visitChildren(ctx); }

    @Override public String visitShowDatabase(GramaticaSQLParser.ShowDatabaseContext ctx) {
        salida=salida+creador.showDB()+'\n';
        return visitChildren(ctx);
    }

    @Override public String visitUseDatabase(GramaticaSQLParser.UseDatabaseContext ctx) {
        String agregar = creador.UseDB(ctx.getChild(2).getText());
        if(!agregar.contains("no existe")){
            dbActual=ctx.getChild(2).getText();
        }
        salida=salida+agregar+'\n';
        return visitChildren(ctx);
    }

    @Override public String visitCreateTable(GramaticaSQLParser.CreateTableContext ctx) {
        if(!dbActual.equals("")) {
            boolean primarykey = false;
            boolean foreignkey = false;
            boolean check = false;
            String nombre = ctx.getChild(2).getText();
            salida=salida+creador.CreateTable(nombre,dbActual)+'\n';
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("data\\"+dbActual+"\\"+nombre+"\\Metadata.txt",true));
                BufferedWriter escritor = new BufferedWriter(new FileWriter("data\\"+dbActual+"\\"+nombre+"\\valores.txt",true));

                int contador = 4;
                String cNombre = ctx.getChild(contador).getChild(0).getText();
                String cTipo = ctx.getChild(contador).getChild(1).getText();
                cTipo = cTipo.toLowerCase();
                writer.write("COLUMNS");
                writer.newLine();
                writer.write(cNombre+" "+cTipo);
                writer.newLine();
                String valores = cNombre;
                while (!ctx.getChild(contador+2).getText().toLowerCase().equals("constraint") && !ctx.getChild(contador+1).getText().equals(")")){
                    contador=contador+2;
                    cNombre = ctx.getChild(contador).getChild(0).getText();
                    cTipo = ctx.getChild(contador).getChild(1).getText();
                    cTipo = cTipo.toLowerCase();
                    writer.write(cNombre+" "+cTipo);
                    writer.newLine();
                    valores=valores+","+cNombre;
                }
                while (!ctx.getChild(contador+1).getText().equals(")")){
                    contador=contador+3;
                    if(ctx.getChild(contador).getText().toLowerCase().contains("primary")){
                        primarykey=true;
                        writer.write("PRIMARY KEY");
                        writer.newLine();
                        String key = ctx.getChild(contador).getChild(0).getChild(0).getText();
                        writer.write(key+" ");
                        int contador2=4;
                        String param = ctx.getChild(contador).getChild(0).getChild(contador2).getText();
                        writer.write(param);
                        while (!ctx.getChild(contador).getChild(0).getChild(contador2+1).getText().contains(")")){
                            contador2=contador2+2;
                            param = ctx.getChild(contador).getChild(0).getChild(contador2).getText();
                            writer.write(","+param);
                        }
                        writer.newLine();
                    }
                    else if(ctx.getChild(contador).getText().toLowerCase().contains("foreign")){
                        writer.write("FOREIGN KEY");
                        foreignkey=true;
                        writer.newLine();
                        String name = ctx.getChild(contador).getChild(0).getChild(0).getText();
                        writer.write(name+" ");
                        int contador2=4;
                        String columna = ctx.getChild(contador).getChild(0).getChild(contador2).getText();
                        writer.write(columna);
                        while (!ctx.getChild(contador).getChild(0).getChild(contador2+1).getText().contains(")")){
                            contador2=contador2+2;
                            columna = ctx.getChild(contador).getChild(0).getChild(contador2).getText();
                            writer.write(","+columna);
                        }
                        contador2=contador2+3;
                        String tabla = ctx.getChild(contador).getChild(0).getChild(contador2).getText();
                        writer.write(" REFERENCES "+tabla+" ");
                        contador2=contador2+2;
                        writer.newLine();
                    }
                }
                if(!primarykey){
                    writer.write("PRIMARY KEY");
                    writer.newLine();
                }
                if(!foreignkey){
                    writer.write("FOREIGN KEY");
                    writer.newLine();
                }
                if(!check){
                    writer.write("CHECK");
                    writer.newLine();
                }
                writer.close();
                escritor.write(valores);
                escritor.close();
                creador.sumarTabla(dbActual);
            }
            catch (IOException e){
                System.out.println("No se creó el archivo de metadata.");
            }
        }
        else {
            salida=salida+"No se ha escogido una base de datos actual."+'\n';
        }
        return visitChildren(ctx);
    }

    @Override public String visitAlterTable(GramaticaSQLParser.AlterTableContext ctx) {
        if(ctx.getText().toLowerCase().contains("rename")){
            String viejo = ctx.getChild(2).getText();
            String nuevo = ctx.getChild(5).getText();

            salida = salida+creador.RenameTable(viejo,nuevo,dbActual)+'\n';
        }
        return visitChildren(ctx);
    }

    @Override public String visitAlterModifyTable(GramaticaSQLParser.AlterModifyTableContext ctx) {

        String tabla = ctx.getChild(2).getText();
        String accion1 = ctx.getChild(3).getChild(0).getChild(0).getText();
        String accion2 = ctx.getChild(3).getChild(0).getChild(1).getText();
        String accion = accion1+" "+accion2;
        System.out.println(accion);
        if(accion.toLowerCase().contains("add column")){
            String nombre = ctx.getChild(3).getChild(0).getChild(2).getChild(0).getText();
            String tipo = ctx.getChild(3).getChild(0).getChild(2).getChild(1).getText();
            salida=salida+creador.addColumn(tipo,nombre,dbActual,tabla);
        }
        else if(accion.toLowerCase().contains("drop column")){
            String columna = ctx.getChild(3).getChild(0).getChild(2).getText();
            System.out.println(columna);
            salida=salida+creador.DropColumn(columna,dbActual,tabla);
        }
        return visitChildren(ctx);
    }
}
