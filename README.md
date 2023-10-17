# Compiler-Phases
Partial implementation of a compiler project featuring a functional lexer, parser, and abstract syntax tree (AST) components. Written in Java, this project demonstrates language processing and syntax analysis, as well construction of an AST, stages past semantic analysis are written in high level pseudo code for easier Java code implementation. Work in progress with plans for further development.

# Compiler Project

This is a Java compiler project that aims to convert Java source code into bytecode through a series of stages, including lexical analysis, parsing, abstract syntax tree generation, and more.

## Key Features

1. **Lexical Analysis**:
   - Contains tokens for the majority of the Java language, performing lexical analysis of the input Java source code.

2. **Parsing**:
   - The parser can parse approximately 90% of Java code using the JavaCC tool. It parses the source code and generates a parse tree.

3. **Abstract Syntax Tree (AST)**:
   - The project includes an abstract syntax tree (AST) for the parsed Java code.
   - The AST represents the structure and order of expressions within the code.
   - It utilizes an LL(K) parser for traversing the tree and conducting necessary checks on the code.

## Future Development

4. **Semantic Analysis**:
   - High-level pseudocode for the symbol table is in progress.
   - The symbol table will perform various semantic checks on the AST to ensure code correctness.

5. **Intermediate Code Generation and Optimization**:
   - High-level pseudocode for intermediate-level code generation is under development.
   - Various optimization techniques will be applied to enhance the speed, memory usage, and overall efficiency of the compiler.

6. **Machine Code Generation**:
   - High-level pseudocode for machine code generation will be included.
   - This stage will focus on converting the intermediate code into bytecode for execution.

## Getting Started
For the Parser:
1. Open your terminal and navigate to the "parser" folder. Use the cd command to change to the appropriate directory:
  cd path/to/your/project/src/parser
2. Compile your parser by running the JavaCC tool on your grammar file, in this case, "MyParser.jj":
   javacc MyParser.jj
3. Compile all the generated Java files:
   javac *.java
4. Run the parser with a Java source code file by executing the following command. Replace "nameOfFile.txt" with the name of the Java source code file you want to parse, you can use the included .txt file or your own:
   java MyParser nameOfFile.txt

For the Abstract Syntax Tree (AST):
1. Open your terminal and navigate to the "ast" folder:
   cd path/to/your/project/src/ast
2. Generate the AST parser from your grammar using the jjtree tool. This step is specific to projects using JavaCC with JJTree. If you are not using JJTree, you may skip this step:
   jjtree Program.jjtree
3. Generate the Java parser from the JJTree output:
   javacc Program.jj
4. Compile the generated Java files:
   javac Program.java
5. Run the AST parser to input and parse Java source code. In the terminal, execute the following command, and you can enter a line of expression code (e.g., (2 + a) * (a / 6);) after running the command. Ensure that the line of code ends with a semicolon, the output should provide a tree like structure corresponding to the order of the expression:
   java Program

## Contributions

Contributions to this project are welcome. Feel free to fork the repository, make improvements, and submit pull requests.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
