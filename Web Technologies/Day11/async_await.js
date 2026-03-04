//async function returns promises
async function readData(a) {
  //consider reading from some i/o
  return "Data is " + a;
}

//this.#name // started in 2022
// var readData = async function(a) {
//   //consider reading from some i/o
//   return "Data is " + a;
// }

// var readData = async (a) => {
//   //consider reading from some i/o
//   return "Data is " + a;
// };

console.log("Hi1");
readData("sid")
  .then((data) => console.log("Data from then:", data))
  .catch((err) => console.log(err));
//x.then().catch()
console.log("Hi2");

// readData().then(() => {
//   readData().then(() => {
//     writeData().then(() => {
//         writeData().then(()=>{

//         })
//     });
//   });
// });


async function operation(){
    var data1 = await readData("first read")
    var data2 = await readData("second read")
    // await writeData()
    // writeData()
    // writeData()
    console.log(data1,data2)
}

//should not write await outside async function
var x= await operation() // not giving error but undefined not resolving promise
console.log("45",x)
