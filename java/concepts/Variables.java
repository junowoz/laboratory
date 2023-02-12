//VARIABLES
public class Variables {

  public static void main(String[] args) {
    /*
     * Primitives:
     * int,
     * double (decimal places),
     * boolean,
     * char (single character),
     * byte,
     * short,
     * long,
     * float
     */
    int yearCreated = 1995;
    double version = 1.8;
    boolean isFun = true;

    char lastLetter = '8';
    char firstLetter = 'J';

    /*
     * Objects (non-primitives):
     * String (multiple characters),
     * Scanner,
     * Random,
     * etc.
     */
    String creator = "Oracle";

    // Escape characters
    System.out.println("\"Hello World\""); // Prints: "Hello World"

    System.out.println("This is the backslash symbol: \\"); // Prints: This is the backslash symbol: \

    // New Line
    System.out.println("Hello\nGoodbye");
    /*
     * Prints:
     * Hello
     * Goodbye
     */

    // Static Checking: The Java programming language has static typing. Java
    // programs will not compile if a variable is assigned a value of an incorrect
    // type.

    /*
     * Naming
     * In Java, variable names are case-sensitive. myHeight is a different variable
     * from myheight. The length of a variable name is unlimited, but we should keep
     * it concise while keeping the meaning clear.
     * A variable starts with a valid letter, or a $, or a _. No other symbols or
     * numbers can begin a variable name. 1stPlace and *Gazer are not valid variable
     * names.
     */
    String blah = "";
    String firstName = "";
    String _numberOne = "";
    String $lettersAbc = "";

    /**
     * We covered:
     * 
     * - int, which stores whole numbers.
     * - double, which stores bigger whole numbers and decimal numbers.
     * - boolean, which stores true and false.
     * - char, which stores single characters using single quotes.
     * - String, which stores multiple characters using double quotes.
     * - Static typing, which is one of the safety features of Java.
     * - Variable naming conventions.
     */
    String name = "Juan";
    int age = 21;
    double desiredSalary = 15000.999;
    char gender = 'm';
    boolean lookingForJob = true;

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
     * Manipulating Variables
     * - Addition, subtraction, multiplication, division, and modulo.
     * - Increment and decrement.
     * - Order of operations.
     */
    int x = 5;
    int y = 10;
    int z = 20;

    System.out.println(x + y); // Prints: 15
    System.out.println(x - y); // Prints: -5
    System.out.println(x * y); // Prints: 50
    System.out.println(x / y); // Prints: 0
    System.out.println(x % y); // Prints: 5

    System.out.println(x++); // Prints: 5
    System.out.println(x); // Prints: 6

    System.out.println(++x); // Prints: 7
    System.out.println(x); // Prints: 7

    System.out.println(x--); // Prints: 7
    System.out.println(x); // Prints: 6

    System.out.println(--x); // Prints: 5
    System.out.println(x); // Prints: 5

    System.out.println(x + y * z); // Prints: 205
    System.out.println((x + y) * z); // Prints: 300
    System.out.println();

    /*
     * Compound Assignment Operators:
     * Addition (+=)
     * Subtraction (-=)
     * Multiplication (*=)
     * Division (/=)
     * Modulo (%=)
     */

    int a = 5;
    a += 10;
    a /= 20;
    a -= 5;

  }
}
