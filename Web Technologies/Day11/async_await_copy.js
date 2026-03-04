const fs = require("fs")

async function readData(a) {
  //consider reading from some i/o
  return "Data is " + a;
}

console.log("Hi1");
console.log("Hi2");

var x= await readData("sa") // not giving error but undefined not resolving promise
console.log("45",x)
