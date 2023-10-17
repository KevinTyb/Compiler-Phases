/*package IRGen;

*** The following is high level pseudo code of intermediate code generation ***
*** This pseudo code reflects the general structure and logic for generating intermediate code ***
*** for the expression grammar only based on the ast and visitor pattern ***

import ast.program;
import staticanalysis.expressionSymbolTable;
import ast.util.Visitor;

public class IntermediateCode extends Visitor {
    IntermediateCode: StringBuilder

    generateIntermediateCode(ast):
    ast.accept(this)
    return intermediateCode.toString()

    visit(Start node):
    node.Expression.accept(this)
    code.addInstruction ("POP") // discard result of expression
    intermediateCode.append(";\n")

    visit(ConditionalExpression node):
    node.ConditionalOrExpression.accept(this)

    if node has conditional expression:
    intermediateCode.append("if_false")
    node.expression.accept(this)
    intermediateCode.append(" goto ")
    intermediateCode.append("####") // placeholder for false label
    intermediateCode.append("\n")

    node.ConditionalOrExpression.accept(this)

    visit(ConditionalOrExpression node):

    node.children[0].accept(this)

    for i = 1 to node.children.length - 1;
    intermediateCode.append("||")
    node.children[i].accept(this)
    intermediateCode.append("\n")

    visit(ConditionalAndExpression node):

    node.children[0].accept(this) //visit first child

    // loop to iterate over any child nodes
    for i = 1 to node.children.length - 1; 
    intermediateCode.append("&&")

    // visit and generate intermediate code for RHS
    node.children[i].accept(this) 

    // separate a new line
    intermediateCode.append("\n") 

    visit(inclusiveOrExpression node):

    node.children[0].accept(this)

    for i = 1 to node.children.length - 1;
    intermediateCode.append("| ")
    node.children[i].accept(this)
    intermediateCode.append("\n")

    visit(ExclusiveOrExpression node):

    node.children[0].accept(this)

    for i = 1 to node.children.length - 1;
    intermediateCode.append("^ ")
    node.children[i].accept(this)
    intermediateCode.append("\n")

    visit(AndExpression node):

    node.children[0].accept(this)

    for i = 1 to node.children.length - 1;
    intermediateCode.append("& ")
    node.children[i].accept(this)
    intermediateCode.append("\n")

    visit(EqExpression node):

    node.children[0].accept(this)

    for i = 1 to node.children.length - 1;

    // call getOperator function to retrieve operator from tokens described in AST
    operator = getOperator(node.children[i].token)
    intermediateCode.append(operator).append("")
    node.children[i].accept(this)
    intermediateCode.append("\n")

    visit(RelationalExpression node):

    node.children[0].accept(this)

    for i = 1 to node.children.length - 1;
    operator = getOperator(node.children[i].token)
    intermediateCode.append(operator).append("")
    node.children[i].accept(this)
    intermediateCode.append("\n")

    visit(ShiftExpression node):

    node.children[0].accept(this)

    for i = 1 to node.children.length - 1;
    operator = getOperator(node.children[i].token)
    intermediateCode.append(operator).append("")
    node.children[i].accept(this)
    intermediateCode.append("\n")

    visit(AddExpression node):

    node.children[0].accept(this)

    for i = 1 to node.children.length - 1;
    operator = getOperator(node.children[i].token)
    intermediateCode.append(operator).append("")
    node.children[i].accept(this)
    intermediateCode.append("\n")
    
    visit(MultiplicativeExpression node):

    node.children[0].accept(this)

    for i = 1 to node.children.length - 1;
    operator = getOperator(node.children[i].token)
    intermediateCode.append(operator).append("")
    node.children[i].accept(this)
    intermediateCode.append("\n")

    visit(UnaryExpression node):
    if node is "("Expression")":
    node.Expression.accept(this)
    else if node is UnaryExpressionNotPlusMinus:
    node.UnaryExpressionNotPlusMinus.accept(this)
    else if node is Identifier:
    intermediateCode.append(node.token.value)
    else if node is Integer:
    intermediateCode.append(node.value)

    visit(UnaryExpressionNotPlusMinus node):
    if node is "~"UnaryExpression:
    intermediateCode.append("~")
    node.UnaryExpression.accept(this)
    else if node is "!" UnaryExpression:
    intermediateCode.append("!")
    node.UnaryExpression.accept(this)
    else if node is PreIncrementExpression:
    intermediateCode.append("++")
    node.UnaryExpression.accept(this)
    else if node is PreDecrementExpression:
    intermediateCode.append("--")
    node.UnaryExpression.accept(this)

    visit (PreIncrementExpression node):
    intermediateCode.append("++")
    node.UnaryExpression.accept(this)

    visit (PreIncrementExpression node):
    intermediateCode.append("--")
    node.UnaryExpression.accept(this)

    visit (Identifier node):
    intermediateCode.append(node.token.value)
    // Generate intermediate code to access identifier and store result
    code.addInstruction("LOAD", name)

    visit (Integer node):
    intermediateCode.append(node.token.value)
    // generate intermediate code to push integer value onto stack
    code.addInstruction("PUSH", value)

    visit (Expression node):
    node.ConditionalExpression.accept(this)

    // following are operator tokens from the AST grammar file
    function getOperator(token):
    if token is "+":
        return "+"
    else if token is "-":
        return "-"
    else if token is "*":
        return "*"
    else if token is "/":
        return "/"
    else if token is "%":
        return "%"
    else if token is "==":
        return "=="
    else if token is "!=":
        return "!="
    else if token is "<":
        return "<"
    else if token is ">":
        return ">"
    else if token is "<=":
        return "<="
    else if token is ">=":
        return ">="
    else if token is "<<":
        return "<<"
    else if token is ">>":
        return ">>"
    else if token is ">>>":
        return ">>>"
    else:
        return " "        
}

*/
