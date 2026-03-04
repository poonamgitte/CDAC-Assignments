//async function returns promises
// async function readData(a) {
//   //consider reading from some i/o
//   return "Data is " + a;
// }

// var readData = async function(a) {
//   //consider reading from some i/o
//   return "Data is " + a;
// }

var readData = async (a) =>  {
  //consider reading from some i/o
  return "Data is " + a;
}


console.log("Hi1");
readData("sid")
  .then((data) => console.log("Data from then:",data))
  .catch((err) => console.log(err));
//x.then().catch()
console.log("Hi2");
