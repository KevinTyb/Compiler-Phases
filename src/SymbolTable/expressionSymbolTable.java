package SymbolTable;
/*package staticanalysis;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class expressionSymbolTable {

    public Hashtable<String, String> hashtable;
    protected expressionSymbolTable prev;

    public expressionSymbolTable (expressionSymbolTable p) {
      hashtable = new Hashtable<String, String>();
      prev = p;
    }
    public void add (String name, String type) {
      hashtable.put(name, type);
    }

    public void addExpression(String name, SimpleNode expression) {
      hashtable.put(name, expression);
    }

   public Object lookup(String name) {
    for (expressionSymbolTable e = this; e != null; e = e.prev) {
      Object found = e.hashtable.get(name);
      if (found != null) return found;
    }
      return null;
    }
  }
  */