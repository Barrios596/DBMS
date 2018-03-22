// Generated from GramaticaSQL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(GramaticaSQLParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(GramaticaSQLParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#float_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_literal(GramaticaSQLParser.Float_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#char_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_literal(GramaticaSQLParser.Char_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(GramaticaSQLParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaticaSQLParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase(GramaticaSQLParser.DatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(GramaticaSQLParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDatabase(GramaticaSQLParser.AlterDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(GramaticaSQLParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#showDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabase(GramaticaSQLParser.ShowDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#useDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseDatabase(GramaticaSQLParser.UseDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(GramaticaSQLParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(GramaticaSQLParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#columna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumna(GramaticaSQLParser.ColumnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(GramaticaSQLParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(GramaticaSQLParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#foreignKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKey(GramaticaSQLParser.ForeignKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck(GramaticaSQLParser.CheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(GramaticaSQLParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(GramaticaSQLParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(GramaticaSQLParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(GramaticaSQLParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(GramaticaSQLParser.RelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#notOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOp(GramaticaSQLParser.NotOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(GramaticaSQLParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(GramaticaSQLParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#addColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddColumn(GramaticaSQLParser.AddColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#addConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddConstraint(GramaticaSQLParser.AddConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#dropColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropColumn(GramaticaSQLParser.DropColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#dropConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraint(GramaticaSQLParser.DropConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(GramaticaSQLParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#showTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(GramaticaSQLParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#showColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(GramaticaSQLParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(GramaticaSQLParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#updateSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSet(GramaticaSQLParser.UpdateSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#updateColumas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateColumas(GramaticaSQLParser.UpdateColumasContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#cambio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCambio(GramaticaSQLParser.CambioContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#deleteFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteFrom(GramaticaSQLParser.DeleteFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#selectFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFrom(GramaticaSQLParser.SelectFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#orden}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrden(GramaticaSQLParser.OrdenContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#colOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColOrder(GramaticaSQLParser.ColOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCols(GramaticaSQLParser.ColsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#tabs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabs(GramaticaSQLParser.TabsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(GramaticaSQLParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSQLParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op(GramaticaSQLParser.Cond_opContext ctx);
}