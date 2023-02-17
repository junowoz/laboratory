public class ObjectOrientedJava {

  // Introduction to Classes
  /* Classes are models, and objects are instances of those models. For example,
   * a class could be a car, and an object could be a specific car, like a Ford Focus.
   * This is object-oriented programming because programs are built around objects and their interactions. An object contains state and behavior.
   *
   * Class: Bank
   * Object: Savings Account
   * State (Fields): Balance
   * Behavior (Methods): Deposit, Withdraw, Transfer
   */

  //////////////////////////////////////////////////////////////////////////////////////////////////////

  /*Syntax
   * public: is an access modifier. It means that the class is accessible by any other class.
   * main(): is the name of the method. It is the entry point of the program. Runs when we execute
   *         the program (Car.class). All inside main, will be printed in order.
   */

  /** Constructors
   * In order to create an object (instance of a class), we need to use a constructor.
   * A constructor is a method that is called when an object is created.
   * 
   * -------------------------------------------------------------------------------------------------
   * Constructor Parameters
   * A constructor can have parameters, which are used to initialize the fields of the object.
   * To create an object with a dynamic state, we combine the instance field + constructor method.
   * We can have many constructors that are the same, because of the "overloading" of constructors.
   * 
   * We have 2 types of parameters: Formal and Actual.
   * - Formal:Type and Name of the data. (String carColor)
   * - Actual: The value of the data.
   */

  /*Instance Fields - Instance Variables
   * Instance fields are fields that are declared inside a class, but outside of a method.
   * Called as has-a relationship with the object.
   * Example: A car has a color, a car has a model, a car has a year. The adjective for the object.
   *
   * ------------------------------------------------------------------------------------------------- 
   * Assigning Values to Instance Fields
   * 
   * 
   * -------------------------------------------------------------------------------------------------
   * Multiple Fields
   * 
   * 
   */

  public class Car {

      //Instance Fields (State of the object)
      String color;
      String model;
      int year;

      public Car() {
          //Scope of constructor (Constructor Method): Instance Tasks, Instance Value
          //This is where the State (Instances), are given a value.
          //This are the instructions for creating a Car instance.

          color = CarColor.RED;
      }

      public static void main(String[] args) {
          //Scope of main: Program Tasks
          // Invoke the constructor as a reference data type (in this case, Car)
          // Data-type = new Constructor-name
          // We use the keyword "new" to indicate we're creating a new object.
          // Outputting the value of ferrari, we would see its memory address "Car@1b6d3586"

          Car ferrari = new Car(); // <--- Instance (object) of the Car class
      }
  }
  
  /* Review
   * 
   */
}
