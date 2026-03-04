const fs = require("fs");

console.log("Hi1");
fs.readFile("demo.txt", function (err, data) {
  if (err) {
    console.log();
  } else {
    console.log("hi2");
    console.log(data.toString());
    fs.writeFile("demo1.txt", data, function () {});
  }
});

console.log("hi3");
