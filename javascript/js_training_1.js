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
let age = 7;
'Tommy is ' + age + ' years old.'; // String concatenation
 
`Tommy is ${age} years old.`; // String interpolation

//Methods
Math.random(); // Returns a number between 0 and 1

console.log("Hello".lenght);
console.log("electro".toUpperCase());
console.log("Nice".startsWith("N"));  //False or true if the word starts with that letter
console.log("    Hello    ".trim());

console.log(Math.floor(Math.random()*80));   // takes a random number, multiplies it by 50 and finds the closest int value

/*
* CONDITIONALS
*/

//If - Else
if (false) {
  console.log('The code in this block will not run.');
} else {
  console.log('But the code in this block will!');
}

//Else If

const size = 10;
 
if (size > 100) {
  console.log('Big');
} else if (size > 20) {
  console.log('Medium');
} else if (size > 4) {
  console.log('Small');
} else {
  console.log('Tiny');
}
// Print: Small

// More Examples using operators

let mood = 'sleepy';
let tirednessLevel = 6;

if(mood === 'sleepy' && tirednessLevel > 8){
  console.log('time to sleep');
}else{
  console.log('not bed time yet');
}

/*Logical Operators OR and &
OR - if one value is true, returns true.

Falsy values include false, 0, empty strings, null undefined, and NaN. All other values are truthy.
*/

true || false;        // true
10 > 5 || 10 > 20;    // true
false || false;       // false
10 > 100 || 10 > 20;  // false

//& -if one value is false, returns false
true && true;      // true
1 > 2 && 2 > 1;    // false
true && false;     // false
4 === 4 && 3 > 1;  // true