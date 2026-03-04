function readData(a) {
  return new Promise(function (resolve, reject) {
    if (a.startsWith("s")) {
      let data = "Data is " + a;
      resolve(data);
    } else {
      reject("No Data");
    }
  });
}

readData("sbc")
  .then((data) => console.log(data))
  .catch((err) => console.log(err));
//console.log(x)
