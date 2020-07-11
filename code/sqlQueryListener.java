// Generated from sqlQuery.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sqlQueryParser}.
 */
public interface sqlQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(sqlQueryParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(sqlQueryParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(sqlQueryParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(sqlQueryParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(sqlQueryParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(sqlQueryParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(sqlQueryParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(sqlQueryParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(sqlQueryParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(sqlQueryParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(sqlQueryParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(sqlQueryParser.TableSourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(sqlQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(sqlQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(sqlQueryParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(sqlQueryParser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#groupByCaluse}.
	 * @param ctx the parse tree
	 */
	void enterGroupByCaluse(sqlQueryParser.GroupByCaluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#groupByCaluse}.
	 * @param ctx the parse tree
	 */
	void exitGroupByCaluse(sqlQueryParser.GroupByCaluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#havingCaluse}.
	 * @param ctx the parse tree
	 */
	void enterHavingCaluse(sqlQueryParser.HavingCaluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#havingCaluse}.
	 * @param ctx the parse tree
	 */
	void exitHavingCaluse(sqlQueryParser.HavingCaluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(sqlQueryParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(sqlQueryParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(sqlQueryParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(sqlQueryParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(sqlQueryParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(sqlQueryParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(sqlQueryParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(sqlQueryParser.GroupByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(sqlQueryParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(sqlQueryParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(sqlQueryParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(sqlQueryParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(sqlQueryParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(sqlQueryParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(sqlQueryParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(sqlQueryParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#textLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTextLiteral(sqlQueryParser.TextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#textLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTextLiteral(sqlQueryParser.TextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link sqlQueryParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumnElement(sqlQueryParser.SelectColumnElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link sqlQueryParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumnElement(sqlQueryParser.SelectColumnElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link sqlQueryParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectFunctionElement(sqlQueryParser.SelectFunctionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link sqlQueryParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectFunctionElement(sqlQueryParser.SelectFunctionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(sqlQueryParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(sqlQueryParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link sqlQueryParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctionCall(sqlQueryParser.AggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link sqlQueryParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctionCall(sqlQueryParser.AggregateFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWindowedFunction(sqlQueryParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWindowedFunction(sqlQueryParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(sqlQueryParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(sqlQueryParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(sqlQueryParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(sqlQueryParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqlQueryParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(sqlQueryParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqlQueryParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(sqlQueryParser.UidContext ctx);
}