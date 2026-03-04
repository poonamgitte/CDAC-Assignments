var f = require("fs")
//if module is in-built just write the name of the module
//otheriwise if user defined wite the path

//read file
var data = f.readFileSync("demo.txt")
console.log(data.toString())

//write file
//pass string to write to file
f.writeFileSync("demo.txt","This is sample")
//if the file exists then it will truncate the file and write the data
//if file does not exists then create the file and write the data

f.appendFileSync("demo.txt", "\nthis is new data")