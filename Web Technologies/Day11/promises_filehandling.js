const fs = require("fs/promises");

console.log("hi1");
fs
  .readFile("demo.txt")
  .then(function (data) {
    console.log("Data", data.toString());
    fs.writeFile("demo1.txt",data).then().catch(err => console.log(err))
  })
  .catch(function (err) {
    console.log(err);
  });
//x = fs.readFile("demo.txt")
// x.then(function (data) {
//   console.log("Data", data.toString());
// }).catch(function (err) {
//   console.log(err);
// });

//x.then(func).catch(func)
console.log("Hi2");
//console.log(x);

//setTimeout(()=>{console.log(x);},2000)
