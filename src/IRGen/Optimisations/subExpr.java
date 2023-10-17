/*package IRGen.Optimisations;

public class subExpr {
    
    expressions = {} // Dictionary to store expressions and their corresponding values
    newCode = [] // List to store optimised code

    for each line in code:
    lhs, rhs = pasrseLine(line) // Parse the line to get lhs and rhs

    if rhs in expressions: // check if expression is already stored
    newLHS = expressions[rhs] // Get variable associated with expression
    expressions[lhs] = newLHS // update dictionary with simplified expression
    else:
        expressions[rhs] = lhs // store new expression
    
    newLine = lhs + " = " + rhs // Create new line with original expression
    newCodea.append(newLine)

    // Replace variables with simplified expressions
    for each line in newCode:
        for lhs, rhs in expressions.items():
            line = line.replace(lhs, rhs)

    return newCode

}

*/