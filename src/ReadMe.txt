The parser folder will contain 5 Java text files, each one can be used to check if the output
in the terminal is correct. In order to do so there are a few steps to take:
1 - In the terminal, you must be in the correct directory (C:\...\...\src\parser)
2 - type javacc MyParser.jj into the terminal
3 - type javac *.java into the terminal
4 - type java MyParser nameOfFile.txt (replace "nameOfFile" with actual file name)

Similar to the ast but with minor changes:
1 - Direct to the ast folder in the terminal (C:\...\...\src\ast)
2 - type jjtree Program.jjtree into the terminal
3 - type javacc Program.jj into the terminal
4 - type javac Program.java into the terminal
5 - type Java Program into the terminal
6 - You can now enter a line of expression code into the terminal such as (2 + a) * (a / 6);
ensuring the line ends with a semicolon