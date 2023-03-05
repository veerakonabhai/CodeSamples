let myString = "Hello, my name is Kevin.";
let myRegex = /Hello/;
//.test() is one way to test regular expressions in JS
let result = myRegex.test(myString);
console.log(result); //true
//but it's limitation is as seen below, it matches exactly if it didn't then it will be false
myRegex = /kevin/;
result = myRegex.test(myString);
console.log(result); //false
//to check multiple patterns using .test() method
let petString = "James has a pet cat.";
myRegex = /dog|cat|bird|fish/; // true only if one of these matching exists.
result = myRegex.test(petString);
console.log(result);//true -> James has a pet cat.