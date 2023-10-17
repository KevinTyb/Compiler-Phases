/*package IRGen.Optimisations;

*** THE FOLLOWING IS PSEUDO CODE FOR CONSTANT FOLDING OPTIMSATION ***

public class ConstantFolding extends IntermediateCode{
    
    if expression is a constant:
    return expression

    if expression is a binary expression:
    left = simplify(expression.left)
    right = simplify(expression.right)

    if left and right are constants:
    result = evaluate(expression.operator, left, right)
    return createConstantExpression(result)

    return createBinaryExpression(expression.operator, left, right)

    if expression is UnaryExpression:
    operand = simplify(expression.operand)

    if operand is constant:
    result = evaluate(expression.operator, operand)
    return createConstantExpression(result)

    return createUnaryExpression(expression.operator, operand)

    return expression

    evaluate(operator, operands):
    //perform specified operation on operands and return result
    if (operator is "+"):
    return operand[0] + operand [1]
    else if (operator is "-"):
    return operand[0] - operand[1]
    else if (operator is "*"):
    return operand[0] * operand[1]
    else if (operator is "/"):
    return operand[0] / operand[1]
    else if (operator is "%"):
    return operand[0] % operand[1]
    else if (operator is "&&"):
    return operand[0] && operand[1]
    else if (operator is "||"):
    return operand[0] || operand[1]
    else if (operator is "=="):
    return operand[0] == operand[1]
    else if (operator is "!="):
    return operand[0] != operand[1]
    else if (operator is "<"):
    return operand[0] < operand[1]
    else if (operator is ">"):
    return operand[0] > operand[1]
    else if (operator is "<="):
    return operand[0] <= operand[1]
    else if (operator is ">="):
    return operand[0] >= operand[1]

    *** Following functions create new expression nodes and set properties accordingly ***

    createConstantExpression(value):
    constantExpression = new ConstantExpression
    constantExpression.value = value
    return constantExpression

    createBinaryExpression(operator, left, right):
    binaryExpression = new BinaryExpression
    binaryExpression.operator = operator
    binaryExpression.left = left
    binaryExpression.right = right
    return binaryExpression

    createUnaryExpression(operator, operand):
    unaryExpression = new UnaryExpression
    unaryExpression.operator = operator
    unaryExpression.operand = operand
    return unaryExpression

    *** Implementation to perform specified arithmetic operation based on operator, left, and right operands ***
    evaluate(operator, left, right):
    if (operator == "+"):
        return left + right
    else if (operator == "-"):
        return left - right
    else if (operator == "*"):
        return left * right
    else if (operator == "/"):
        return left / right
}

*/