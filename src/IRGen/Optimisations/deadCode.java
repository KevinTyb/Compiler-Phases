/*package IRGen.Optimisations;

import ast.program;

public class deadCode {
    
    *** Following pseudo code performs dead code elimination by identifying used variables ***
    *** keeping lines that are involved ***

    usedVars = {} // Stores used variables
    newCode = [] // List to store optimised code

    //Identify used variables
    for each line in code:
        lhs, rhs = parseLine(line)

    // Update set of used variables
    if lhs != empty:
        usedVars.add(lhs)
    
    // Check if variable in expression is used
    for var in parseVar(rhs):
        if var in usedVars:
            usedVars.add(variable)
    
    // Keep lines with used variables
    for each line in code:
        lhs, rhs = parseLine(line)
    
    // Check if line has used variables
    if lhs is not empty and lhs in usedVars:
        newCode.append(line)
    elif lhs == empty && var in usedVars for var in parseVar(rhs):
        newCode.append(line)

    return newCode

    parseVar(expression):
    variables = [] // List to store extracted variables

    // Here we use tokens from the AST file that have already been defined
    for token in expression.tokens:
        if isVariable(token):
            variables.append(token.value)

    return variables

}

*/