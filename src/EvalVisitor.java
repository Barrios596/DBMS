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
                while (!ctx.getChild(contador+1).getText().toLowerCase().equals("constraint") && !ctx.getChild(contador+1).getText().equals(")")){
                    contador=contador+2;
                    cNombre = ctx.getChild(contador).getChild(0).getText();
                    cTipo = ctx.getChild(contador).getChild(1).getText();
                    cTipo = cTipo.toLowerCase();
                    writer.write(cNombre+" "+cTipo);
                    writer.newLine();
                    valores=valores+","+cNombre;
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
}
