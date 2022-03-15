//starting javascript training here
/*
* I see how the syntaxt is very similar to C programmig language
*/

console.log("Hello World!");
console.log("Hello " + "World!")

/*Variables
*   let is used when the variable can be changed
    const is when the variable is constant and never changes
*/

/*Comparisions 
2 > 1
5 < 10
5 <= 4
8 >= 7
7 == 7
6 !== 1

Logical Operators

  AND = &&
  OR = | |
  NOT = !
*/

//Null
let something = null; //Represents a void

// UNDEFINED
var a;
console.log(a); // Prints: undefined

//TEXT INTERPOLATION text ${expression} text

let name = "Juan";
console.log('Hello ${name}');



//Properties

      //console.log("SomeString".SomeMethod(remember to always put this))

//Methods

Math.random(); // Returns a number between 0 and 1

console.log("Hello".lenght);
console.log("electro".toUpperCase());
console.log("Nice".startsWith("N"));  //False or true if the word starts with that letter
console.log("    Hello    ".trim());

console.log(Math.floor(Math.random()*80));   // takes a random number, multiplies it by 50 and finds the closest int value

//If statemen and if else

let sale = true;

sale = false;

if (false) {
  console.log('The code in this block will not run.');
} else {
  console.log('But the code in this block will!');
}

//Another example

let hungerLevel = 7;

if(hungerLevel > 7){
  console.log('Time to eat!');
}else{
  console.log('We can eat later!');
}

// More Examples

let mood = 'sleepy';
let tirednessLevel = 6;

if(mood === 'sleepy' && tirednessLevel > 8){
  console.log('time to sleep');
}else{
  console.log('not bed time yet');
}