//The Basics: Prints
public class HelloWorld {

  public static void main(String[] args) {
    System.out.print("Three...");
    System.out.print("Two...");

    System.out.println("One...");
    System.out.println("Ready or not, here I come!");
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Commenting Code

    /*
     * Long
     * Comment
     */

    /**
     * JavaDoc
     */

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Compilation: Catching Errors
    /*
     * Java is a compiled programming language, meaning the code we write in a .java
     * file is transformed into byte code by a compiler before it is executed by the
     * Java Virtual Machine on your computer.
     * The compiling process catches mistakes before the computer runs our code.
     *
     * The Java compiler runs a series of checks while it transforms the code. Code
     * that does not pass these checks will not be compiled.
     *
     * For example, with a file called Plankton.java, we could compile it with the
     * terminal command:
     * javac File.java
     *
     * A successful compilation produces a .class file: Plankton.class, that we
     * execute with the terminal command:
     * java File
     *
     * An unsuccessful compilation produces a list of errors. No .class file is made
     * until the errors are corrected and the compile command is run again.
     */

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Compilation: Creating Executables
    /*
     * We now have two files:
     * 1. File.java, our original file with Java syntax.
     * 2. File.class, our compiled file with Java bytecode, ready to be executed by
     * the Java Virtual Machine.
     *
     * We can execute the compiled class with the command:
     * java File
     */

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // SUMMARIZING KEYWORDS

    // CLASS: must match the FileName (Pascal Case is when we capitalize every word)
    // SCOPE: {} are used to define a block of code, the scope of the class.
    // METHOD: Every java program must have a main method, a sequence of tasks,
    // instructions. public static void main(String[] args)
    // PARAMETER: String[] args
    // STATEMENT: A single task. System.out.println("Hello World!");
    // EXPRESSION: "Hello World!"

    // VARIABLE: String name = "Bob";
    // TYPE: String, int, double, boolean, etc.
    // IDENTIFIER: name
    // LITERAL: "Bob"

    // KEYWORD: public, static, void, class, String, etc.
    // SEMICOLON: ;
    // COMMENT: // or /* */
    // OPERATOR: =, +, -, *, /, etc.
    // PUNCTUATION: (, ), {, }, etc.
    // NULL: null
    // MODIFIER: public, static, etc.
    // PACKAGE: java.lang
    // IMPORT: import java.lang.System;
    // JAVADOC: /** */
    // INTERPRETER: java
    // JVM: Java Virtual Machine
    // BYTECODE: Java bytecode
    // BYTECODE FILE: .class
    // SOURCE FILE: .java

  }
}
