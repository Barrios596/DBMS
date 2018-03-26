public class EvalVisitor extends GramaticaSQLBaseVisitor<String> {

    Funciones creador = new Funciones();
    public String salida = "";

    @Override public String visitCreateDatabase(GramaticaSQLParser.CreateDatabaseContext ctx) {

        String nombre=ctx.getChild(2).getText();
        salida=salida+'\n'+creador.CreateDirectory(nombre);

        return visitChildren(ctx);
    }

    @Override public String visitAlterDatabase(GramaticaSQLParser.AlterDatabaseContext ctx) {
        String viejo = ctx.getChild(2).getText();
        String nuevo = ctx.getChild(5).getText();
        salida=salida+'\n'+creador.ModifyNameDirectory(viejo,nuevo);
        return visitChildren(ctx);
    }

    @Override public String visitDropDatabase(GramaticaSQLParser.DropDatabaseContext ctx) {
        String nombre = ctx.getChild(2).getText();
        salida=salida+'\n'+creador.DeleteDirectory(nombre);
        return visitChildren(ctx); }

}
