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

    /*
     * Order of Operations:
     * 1. Parentheses
     * 2. Exponents
     * 3. Modulo/Multiplication/Division
     * 4. Addition/Subtraction
     */

    int expression1 = 5 % 2 - (4 * 2 - 1);
    // System.out.println(expression1);

    int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
    // System.out.println(expression2);

    int expression3 = 5 * 4 % 3 - 2 + 1;
    // System.out.println(expression3);

    /*
     * Greater Than and Less Than
     * - Greater Than: >
     * - Less Than: <
     * 
     * Equals and Not Equals
     * - Equal To: ==
     * - Not Equal To: !=
     * 
     * Greater/Less Than or Equal To
     * - Greater Than or Equal To: >=
     * - Less Than or Equal To: <=
     * 
     */
    int b = 5;
    int c = 10;

    System.out.println(b > c); // Prints: false
    System.out.println(b < c); // Prints: true
    System.out.println(b >= c); // Prints: false
    System.out.println(b <= c); // Prints: true
    System.out.println(b == c); // Prints: false
    System.out.println(b != c); // Prints: true
    System.out.println();

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /*
     * .equals()
     * Use .equals() instead of == when comparing objects.
     * == compares the memory address of the objects.
     * .equals() compares the values of the objects.
     */

    String person1 = "Paul";
    String person2 = "John";
    String person3 = "Paul";

    System.out.println(person1.equals(person2));
    // Prints false, since "Paul" is not "John"

    System.out.println(person1.equals(person3));
    // Prints true, since "Paul" is "Paul"

    /*
     * String Concatenation
     * Use the + operator to concatenate strings.
     */
    String firstName1 = "John";
    String lastName1 = "Doe";
    System.out.println(firstName1 + " " + lastName1);

    /*
     * final Keyword
     * To declare a variable with a value that cannot be manipulated, we need to use
     * the final keyword. To use the final keyword, prepend final to a variable
     * declaration like so:
     */
    final int yearBorn = 1968;

    /**
     * We covered:
     * 
     * Addition and subtraction, using + and -
     * Multiplication and division, using * and /
     * The modulo operator for finding remainders, %
     * Compound assignment operators +=, -=, *=, /=, and %=.
     * The order of operations: parentheses -> exponents -> multiplication,
     * division, modulo -> addition, subtraction
     * Greater than, >, and less than, <
     * Equal to, ==, and not equal to, !=
     * Greater than or equal to, >=, and less than or equal to, <=
     * equals() for comparing Strings and other objects
     * Using + to concatenate Strings
     * The final keyword which makes variables unchangeable
     */
  }
}
