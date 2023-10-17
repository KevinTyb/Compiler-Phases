/*package util;

import ast.*;
import staticanalysis.SymbolTable;

public class Visitor {

    private expressionSymbolTable symbolTable;
  
    public Visitor() {
      //initialize symbol table
      symbolTable = new expressionSymbolTable(null);
    }
  
    // visit method for start node
    public Object visit(Start node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.jjtAccept(this, data);
  
      return result;
    }
  
    //visit method for ConditionalExpression
    public Object visit(ConditionalExpression node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.childrenAccept(this, data);
  
      // get types of child expressions using symbol table
      String firstExp = getType (symbolTable, node.ConditionalOrExpression());
      String secondExp = getType (symbolTable, node.Expression());

      //perform type-checking here

      if (!"boolean".equals(firstExp)) {
        reportError("type mismatch: First expression must be boolean");
      }

      if (!isNumeric(secondExp)) {
        reportError("type mismatch: second expression should be numeric");
      }
  
      return result;
    }
  
    //visit method for ConditionalOrExpression
    public Object visit(ConditionalOrExpression node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.childrenAccept(this, data);
  
      //perform type-checking here

      // THE FOLLOWING IS HIGH LEVEL PSEUDO CODE
      // CERTAIN IMPLEMENTATIONS HERE ARE REQUIRED IN THE AST .JJT FILE BUT WILL NOT BE ADDED
      // DUE TO COMPILATION ISSUES THAT WOULD OCCUR IN THE AST FILE

      List<ExpressionNode> orExpression = node.OrExpressions();
      for (ExpressionNode expression : expressions) {
        // check if expression has a type other than boolean

        if (!getType(expression).equals("boolean")) {
          reportError(expression, "boolean");
        }
      }
  
      return result;
    }
  
    //visit method for ConditionalAndExpression
    public Object visit(ConditionalAndExpression node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.childrenAccept(this, data);
  
      //perform type-checking here

      // THE FOLLOWING IS HIGH LEVEL PSEUDO CODE
      // CERTAIN IMPLEMENTATIONS HERE ARE REQUIRED IN THE AST .JJT FILE BUT WILL NOT BE ADDED
      // DUE TO COMPILATION ISSUES THAT WOULD OCCUR IN THE AST FILE

      List<ExpressionNode> orExpression = node.AndExpressions();
      for (ExpressionNode expression : expressions) {
        // check if expression has a type other than boolean

        if (!getType(expression).equals("boolean")) {
          reportError(expression, "boolean");
        }
      }
  
      return result;
    }
  
    //visit method for InclusiveOrExpression
    public Object visit(InclusiveOrExpression node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result =node.childrenAccept(this, data);
  
      //perform type-checking here

      // THE FOLLOWING IS HIGH LEVEL PSEUDO CODE
      // CERTAIN IMPLEMENTATIONS HERE ARE REQUIRED IN THE AST .JJT FILE BUT WILL NOT BE ADDED
      // DUE TO COMPILATION ISSUES THAT WOULD OCCUR IN THE AST FILE

      List<ExpressionNode> orExpression = node.BitOrExpressions();
      for (ExpressionNode expression : expressions) {

        // check if expression has a type other than int

        if (!getType(expression).equals("int")) {
          reportError(expression, "int");
        }
      }
  
      return result;
    }
  
    //visit method for ExclusiveOrExpression
    public Object visit(ExclusiveOrExpression node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.childrenAccept(this, data);
  
      //perform type-checking here

      // THE FOLLOWING IS HIGH LEVEL PSEUDO CODE
      // CERTAIN IMPLEMENTATIONS HERE ARE REQUIRED IN THE AST .JJT FILE BUT WILL NOT BE ADDED
      // DUE TO COMPILATION ISSUES THAT WOULD OCCUR IN THE AST FILE

      List<ExpressionNode> orExpression = node.BitXorExpressions();
      for (ExpressionNode expression : expressions) {
        // check if expression has a type other than int

        if (!getType(expression).equals("int")) {
          reportError(expression, "int");
        }
      }
  
      return result;
    }
  
    //visit method for AndExpression
    public Object visit(AndExpression node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.childrenAccept(this, data);
  
      //perform type-checking here

      // THE FOLLOWING IS HIGH LEVEL PSEUDO CODE
      // CERTAIN IMPLEMENTATIONS HERE ARE REQUIRED IN THE AST .JJT FILE BUT WILL NOT BE ADDED
      // DUE TO COMPILATION ISSUES THAT WOULD OCCUR IN THE AST FILE

      List<ExpressionNode> orExpression = node.BitAndExpressions();
      for (ExpressionNode expression : expressions) {
        // check if expression has a type other than int

        if (!getType(expression).equals("int")) {
          reportError(expression, "int");
        }
      }
  
      return result;
    }
  
    //visit method for EqExpression
    public Object visit(EqExpression node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.childrenAccept(this, data);
  
      //perform type-checking here

      // THE FOLLOWING IS HIGH LEVEL PSEUDO CODE
      // CERTAIN IMPLEMENTATIONS HERE ARE REQUIRED IN THE AST .JJT FILE BUT WILL NOT BE ADDED
      // DUE TO COMPILATION ISSUES THAT WOULD OCCUR IN THE AST FILE

      List<ExpressionNode> orExpression = node.EqualExpressions();
      for (ExpressionNode expression : expressions) {
        // check if expression has a type other than boolean

        if (!getType(expression).equals("boolean")) {
          reportError(expression, "boolean");
        }
      }
  
      return result;
    }
  
    //visit method for RelationalExpression
    public Object visit(RelationalExpression node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.childrenAccept(this, data);
  
      //perform type-checking here

      // THE FOLLOWING IS HIGH LEVEL PSEUDO CODE
      // CERTAIN IMPLEMENTATIONS HERE ARE REQUIRED IN THE AST .JJT FILE BUT WILL NOT BE ADDED
      // DUE TO COMPILATION ISSUES THAT WOULD OCCUR IN THE AST FILE

      List<ExpressionNode> orExpression = node.RelationalExpressions();
      for (ExpressionNode expression : expressions) {
        // check if expression has a type other than boolean

        if (!getType(expression).equals("boolean")) {
          reportError(expression, "boolean");
        }
      }
  
      return result;
    }
  
    //visit method for ShiftExpression
    public Object visit(ShiftExpression node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.childrenAccept(this, data);
  
      //perform type-checking here

      // THE FOLLOWING IS HIGH LEVEL PSEUDO CODE
      // CERTAIN IMPLEMENTATIONS HERE ARE REQUIRED IN THE AST .JJT FILE BUT WILL NOT BE ADDED
      // DUE TO COMPILATION ISSUES THAT WOULD OCCUR IN THE AST FILE

      List<ExpressionNode> orExpression = node.ShiftExpressions();
      for (ExpressionNode expression : expressions) {
        // check if expression has a type other than int

        if (!getType(expression).equals("int")) {
          reportError(expression, "int");
        }
      }
  
      return result;
    }
  
    //visit method for AddExpression
    public Object visit(AddExpression node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.childrenAccept(this, data);
  
      //perform type-checking here

      // THE FOLLOWING IS HIGH LEVEL PSEUDO CODE
      // CERTAIN IMPLEMENTATIONS HERE ARE REQUIRED IN THE AST .JJT FILE BUT WILL NOT BE ADDED
      // DUE TO COMPILATION ISSUES THAT WOULD OCCUR IN THE AST FILE

      List<ExpressionNode> orExpression = node.AddExpressions();
      for (ExpressionNode expression : expressions) {
        // check if expression has a type other than int

        if (!getType(expression).equals("int")) {
          reportError(expression, "int");
        }
      }
  
      return result;
    }
  
    //visit method for MultiplicativeExpression
    public Object visit(MultiplicativeExpression node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.childrenAccept(this, data);
  
      //perform type-checking here

      // THE FOLLOWING IS HIGH LEVEL PSEUDO CODE
      // CERTAIN IMPLEMENTATIONS HERE ARE REQUIRED IN THE AST .JJT FILE BUT WILL NOT BE ADDED
      // DUE TO COMPILATION ISSUES THAT WOULD OCCUR IN THE AST FILE

      List<ExpressionNode> orExpression = node.MultiplicativeExpressions();
      for (ExpressionNode expression : expressions) {
        // check if expression has a type other than int

        if (!getType(expression).equals("int")) {
          reportError(expression, "int");
        }
      }
  
      return result;
    }
  
    //visit method for UnaryExpression
    public Object visit(UnaryExpression node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.childrenAccept(this, data);
  
      //perform type-checking here

      // THE FOLLOWING IS HIGH LEVEL PSEUDO CODE
      // CERTAIN IMPLEMENTATIONS HERE ARE REQUIRED IN THE AST .JJT FILE BUT WILL NOT BE ADDED
      // DUE TO COMPILATION ISSUES THAT WOULD OCCUR IN THE AST FILE

      // return a single child
      ExpressionNode expression = node.UnaryExpression(); // assumes AST has a method 'getUnaryExpression'

      // check if expression has a type other than int

        if (!getType(expression).equals("int")) {
          reportError(expression, "int");
        }
  
      return result;
    }
  
    //visit method for UnaryExpressionNotPlusMinus
    public Object visit(UnaryExpressionNotPlusMinus node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.childrenAccept(this, data);
  
      //perform type-checking here

      // THE FOLLOWING IS HIGH LEVEL PSEUDO CODE
      // CERTAIN IMPLEMENTATIONS HERE ARE REQUIRED IN THE AST .JJT FILE BUT WILL NOT BE ADDED
      // DUE TO COMPILATION ISSUES THAT WOULD OCCUR IN THE AST FILE

      // return a single child
      ExpressionNode expression = node.UnaryExpressionNotPlusMinus(); // assumes AST has a method 'getUnaryExpressionNotPlusMinus'

      // check if expression has a type other than int

        if (!getType(expression).equals("int")) {
          reportError(expression, "int");
        }
  
      return result;
    }
  
    //visit method for PreIncrementExpression
    public Object visit(PreIncrementExpression node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.childrenAccept(this, data);
  
      //perform type-checking here

      // THE FOLLOWING IS HIGH LEVEL PSEUDO CODE
      // CERTAIN IMPLEMENTATIONS HERE ARE REQUIRED IN THE AST .JJT FILE BUT WILL NOT BE ADDED
      // DUE TO COMPILATION ISSUES THAT WOULD OCCUR IN THE AST FILE

      // return a single child
      ExpressionNode expression = node.PreIncrementExpression(); // assumes AST has a method 'getPreIncrementExpression'

      // check if expression has a type other than int

        if (!getType(expression).equals("int")) {
          reportError(expression, "int");
        }
  
      return result;
    }
  
    //visit method for PreDecrementExpression
    public Object visit(PreDecrementExpression node, Object data) {
      symbolTable = node.symbolTable;
      //visit child node and return result
      Object result = node.childrenAccept(this, data);
  
      //perform type-checking here

      // THE FOLLOWING IS HIGH LEVEL PSEUDO CODE
      // CERTAIN IMPLEMENTATIONS HERE ARE REQUIRED IN THE AST .JJT FILE BUT WILL NOT BE ADDED
      // DUE TO COMPILATION ISSUES THAT WOULD OCCUR IN THE AST FILE

      // return a single child
      ExpressionNode expression = node.PreDecrementExpression(); // assumes AST has a method 'getPreDecrementExpression'

      // check if expression has a type other than int

        if (!getType(expression).equals("int")) {
          reportError(expression, "int");
        }
  
      return result;
    }
  
    publcic String getType(expressionSymbolTable symbolTable, ExpressionNode expression) {
      // code to retrieve type of the expression from symbol table

      Object typeObj = symbolTable.lookup(expression.getName());
      if (typeObj instanceof String) {
        return (String) typeObj;
      }
      return null;
    }

    public Boolean isNumeric (String type) {
      //check if given type is numeric
      return "int".equals(type) ||  "float".equals(type) || "double".equals(type);
    }

    public void reportError(String message){
      throw new Error ("Error encountered")
    }

  }
*/